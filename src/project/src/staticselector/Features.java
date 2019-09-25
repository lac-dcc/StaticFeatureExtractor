/*
 * Copyright (C) 2019 
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package staticselector;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import soot.Body;
import soot.PatchingChain;
import soot.SootClass;
import soot.SootMethod;
import soot.Unit;
import soot.Value;
import soot.jimple.*;
import soot.jimple.internal.*;
import soot.toolkits.graph.LoopNestTree;

import soot.jimple.toolkits.annotation.logic.Loop;
import soot.jimple.toolkits.thread.synchronization.LockAllocator;
import soot.jimple.toolkits.thread.synchronization.CriticalSection;
import soot.toolkits.graph.BlockGraph;
import soot.toolkits.graph.ClassicCompleteBlockGraph;
import soot.util.Chain;
import soot.util.Switchable;

/**
 * Represents static code features of a method.
 */

public class Features {
    //
    // All features values are related to the current associated method
    // represented method being analyzed
    public SootMethod method;
    // total number of memory operations
    public long numMemory;
    // total number of branch operations
    public long numBranches;
    // total number of instructions within parallel regions
    public long numCriticalSections;
    // total number of atomic operations
    public long numAtomic;
    // total number of barriers found
    public long numBarriers;
    // total number of stores to arrays within parallel regions
    public long numFalseSharing;
    // total number of stores within parallel regions
    public long numFalseSharingAllStores;
    // total number of instructions in method
    public long numIntructions;
    // CFG Block representation of the method
    private BlockGraph cfg;
    //
    private Map<SootMethod, Map<Unit, Integer>> methodsDepth
        = new HashMap<SootMethod, Map<Unit, Integer>>();

    class Range {
        public final int l, u;
        public final boolean e; // estimated?
        public Value value;
        public Range(int l, int u) {
            this(l, u, false);
        }

        public Range(int l, int u, boolean e) {
            this.l = l;
            this.u = u;
            this.e = e;
        }

        public int diff() {
            return u - l;
        }

        @Override
        public String toString() {
            return "[ " + l + " , " + u + " ]";
        }
    }

    private Map <Loop, Range> loopRanges;

    /**
     * Constructor.
     * @param target Method to be analyzed.
     */
    public Features(SootMethod target) {
        method = target;
        numMemory = 0;
        numBranches = 0;
        numCriticalSections = 0;
        numAtomic = 0;
        numBarriers = 0;
        numFalseSharing = 0;
        numFalseSharingAllStores = 0;
        numIntructions = 0;
        loopRanges = new HashMap<Loop, Range>();
        try {
            buildCFG();
            extractFeatures();
        } catch (RuntimeException e) {
            //System.err.println("Features for method: " + target.getSignature() +
            //        " were ignored, due to internal fail!");
            //e.printStackTrace();
        }
    }

    /**
     * Builds unit CFG
     */
    private void buildCFG () {
        this.cfg = new ClassicCompleteBlockGraph(this.method.retrieveActiveBody());
        //this.cfg = new BriefBlockGraph(this.method.retrieveActiveBody());
    }

    /**
     * Uses a simple formula to calculate the percentage of a specific feature
     * in a method.
     * @param counter Amount of times the features appeared in the method.
     * @return Calculated percentage.
     */
    private double percent (long counter) {
        if (this.numIntructions > 0)
            return (counter * 100) / (double) this.numIntructions;
        return 0.0;
    }

    private double percent (long counter, long base) {
        if (base > 0)
            return (counter * 100) / (double) base;
        return 0.0;
    }

    /**
     * Merges two Feature objects;
     * @param other Feature object to be merged into this object.
     */
    public void addFeaturesFrom (Features other) {
        addFeaturesFrom(other, 1);
    }


    public void addFeaturesFromCall (Features other, Unit callsite, SootMethod caller) {
        Map<Unit, Integer> unitDepth = calculateInstructionDepth(caller);
        int depth = unitDepth.getOrDefault(callsite, 0);

        Body body = caller.retrieveActiveBody();        
        LoopNestTree loopNestTree = new LoopNestTree(body);
        
        if (depth == 0) {
            addFeaturesFrom(other, 1);
        } else {
            // appel's model
            int base = 10;
            long inc = (long) Math.pow(base, depth);            
            for (Loop loop : loopNestTree) {
                List<Stmt> loopStmts = loop.getLoopStatements();
                for (Stmt s : loopStmts) {
                    if (s.equals(callsite)) {
                        Range r = loopRanges.getOrDefault(loop, null);
                        // if l iterate over constants use range info
                        if (r != null && !r.e) inc = r.diff();                        
                    }
                }
            }            
            addFeaturesFrom(other, inc);
        }        
    }

    /**
     * Merges two Feature objects taking into account the call depth;
     * @param other Feature object to be merged into this object.
     * @param it number of iterations
     */
    public void addFeaturesFrom (Features other, long it) {
        // we take into consideration the call depth to define the
        // associated cost. For this we rely on Appel and George's model
        // present in their Iterated Register Coalescing algorithm                

        this.numBranches += other.numBranches * it;
        this.numMemory   += other.numMemory * it;
        this.numAtomic   += other.numAtomic * it;
        this.numBarriers += other.numBarriers * it;
        this.numCriticalSections += other.numCriticalSections * it;
        this.numFalseSharing += other.numFalseSharing * it;
        this.numFalseSharingAllStores += other.numFalseSharingAllStores * it;
        this.numIntructions +=  other.numIntructions * it;
    }

    /**
     * Serializes features data into string to output.
     * @return Serialized features data.
     */
    public String serialize () {
        return "" + percent(this.numBranches) + ", "
                + percent(this.numCriticalSections) + ", "
                + percent(this.numMemory) + ", "
                + percent(this.numAtomic) + ", "
                + percent(this.numFalseSharing, this.numFalseSharingAllStores)
                + ", " + percent(this.numBarriers);
    }

    /**
     * Helper method for printing the percentage of each features from specific
     */
    public void showPercentages () {
        System.out.printf("\tBranch Operations: %.2f\n", percent(numBranches));
        System.out.printf("\tMemory Operations: %.2f\n", percent(numMemory));
        System.out.printf("\tAtomic Operations: %.2f\n", percent(numAtomic));
        System.out.printf("\tBarriers          : %.2f\n",percent(numBarriers));
        System.out.printf("\tCritical Sections: %.2f\n",
                                                  percent(numCriticalSections));
        System.out.printf("\tFalse sharing    : %.2f\n",
                                                percent(numFalseSharing,
                                                this.numFalseSharingAllStores));
        System.out.println();
    }


    /**
     * Iterates over the method's body and calculates the amount of
     * instructions of each type of interest. This takes into
     * account the depth of each instruction.
     */
    private void extractFeatures () {
        // JVM info instructons
        // https://docs.oracle.com/javase/specs/jvms/se8/html/jvms-2.html
        // Baf Reference: Page 13 of
        // https://courses.cs.washington.edu/courses/cse501/01wi/project/sable-thesis.pdf
        Body body = method.retrieveActiveBody();        
        LoopNestTree loopNestTree = new LoopNestTree(body);
        PatchingChain<Unit> units = body.getUnits();

        Map<Unit, Integer> unitDepth = calculateInstructionDepth(method);
        checkCriticalSections(body, unitDepth);
        checkFalseSharing();
        int base = 10;

        for (Unit u : units) {
            //
            // Using the unit depth to 'estimate' the amount of times it will be
            // be executed.
            int depth = unitDepth.getOrDefault(u, 0);
            // appel's model
            long inc = (long) Math.pow(base, depth);
            if (depth > 0) {
                for (Loop loop : loopNestTree) {
                    List<Stmt> loopStmts = loop.getLoopStatements();
                    for (Stmt s : loopStmts) {
                        if (s.equals(u)) {
                            Range r = loopRanges.getOrDefault(loop, null);
                            // if l iterate over constants use range info
                            if (r != null && !r.e)  inc = r.diff();                                                                                         
                        }
                    }
                }
            }
            
            this.numIntructions += inc;
            if (isBranchInst(u)) {
                this.numBranches += inc;
            } else if (isMemoryInst(u)) {
                this.numMemory += inc;
            }
            if (isAtomicOp(u)) {
                this.numAtomic += inc;
            } else if (isBarrierOp(u)) {
                this.numBarriers += inc;
            }
        }
    }

    private void calculateLoopRange (Loop l, SootMethod sm) {
        //
        // Simple implementation of range estimator for loops
        // iterating over constants
        boolean valid = true;
        Body body = sm.retrieveActiveBody();
        Chain<Unit> units = body.getUnits();
        //System.out.println("Loop at method " + sm.getSubSignature() );

        // getting prev of loop head, where variable is initialized
        Unit u = units.getPredOf(l.getHead());
        Value initVariable = null;
        IntConstant initValue = null;
        if (u instanceof JAssignStmt) {
            JAssignStmt a = (JAssignStmt) u;
            initVariable = a.getLeftOp();
            if (a.getRightOp() instanceof IntConstant) {
                initValue = (IntConstant) a.getRightOp();
            } else {
                valid = false;
            }
        }
        //System.out.println("    Loop head " + l.getHead() + " [prev] " + u);
        Stmt head = l.getHead();
        if (head instanceof IfStmt) {
            IfStmt is = (IfStmt) head;
            Value cond = is.getCondition();
            JimpleLocal variable = null;
            IntConstant constant = null;
            if (cond instanceof AbstractBinopExpr) {
                Value op1 = ((AbstractBinopExpr) cond).getOp1();
                Value op2 = ((AbstractBinopExpr) cond).getOp2();
                if (op1 instanceof JimpleLocal) {
                    variable = (JimpleLocal) op1;
                } else if (op1 instanceof IntConstant) {
                    constant = (IntConstant) op1;
                } else {
                    valid = false;
                }
                if (op2 instanceof JimpleLocal) {
                    variable = (JimpleLocal) op2;
                } else if (op2 instanceof IntConstant) {
                    constant = (IntConstant) op2;
                } else {
                    valid = false;
                }
                //if (initVariable.equals(variable)) {
                //    System.out.print("Variavel de inducao: " + variable);
                //    System.out.print("[ "+ initValue + "," + constant +"]");
                //}
                if (valid) {
                    int ibegin = initValue.value;
                    int iend = constant.value;
                    // very simple approach. only works for cases when the induction
                    // variable initiates with a value lower than the comparative
                    // not even checking what type of comparative nor the inc method.
                    if (ibegin <= iend) {
                        Range r = new Range(ibegin, iend);
                        loopRanges.put(l, r);
                        return;
                    }
                }

                Range r = new Range(1, 10, true);
                loopRanges.put(l, r);
            }
        }

    }

    /**
     * Calculates the depth of each instruction in the LoopNestTree obj.
     * @param sm Input method, from which will be calculated instruction depth.
     * @return A Map<Unit, Integer> containing the depth of each unit.
     */
    private Map<Unit, Integer> calculateInstructionDepth (SootMethod sm) {
        // check if we already processed this method
        if (methodsDepth.containsKey(sm)) {
            return methodsDepth.get(sm);
        } else {
            // First we analyze all Units (statements) within loops
            Body body = sm.retrieveActiveBody();
            LoopNestTree loopNestTree = new LoopNestTree(body);
            Map<Unit, Integer> idepth = new HashMap<Unit, Integer>();

            if (!loopNestTree.isEmpty()) {
                for (Loop initloop : loopNestTree) {
                    calculateLoopRange(initloop, sm);
                    int depth = 1;
                    Loop loop = loopNestTree.higher(initloop);
                    //
                    // walk on the tree up to the root, so we can define our
                    // nested level
                    while (loop != null) {
                        depth++;
                        loop = loopNestTree.higher(loop);
                    }
                    List<Stmt> loopBody = initloop.getLoopStatements();
                    for (Stmt s : loopBody) {
                        Integer currentDepth = idepth.getOrDefault(s, 1);
                        if (depth >= currentDepth) {
                            idepth.put(s, depth);
                        }
                    }
                }
            }
            methodsDepth.put(sm, idepth);
            return idepth;
        }        
    }

    /**
     * Checks the percentage of FalseSharing as a percentage of STORE
     * ops in the parallel region.
     */
    private void checkFalseSharing () {
        Body body = this.method.retrieveActiveBody();
        PatchingChain<Unit> units = body.getUnits();
        int stores = 0;
        int totalStoresNum = 0;
        //
        // We characterize STORE operations in JIMPLE IR as assignment
        // operations, because we take into account all stores, inclusive
        // the ones to local array in frame.
        for (Unit u : units) {
            if (u instanceof JAssignStmt) {
                totalStoresNum++;
                JAssignStmt as = (JAssignStmt) u;
                if (as.getLeftOp() instanceof JArrayRef) {
                    JArrayRef ref = (JArrayRef) as.getLeftOp();
                    Value index = ref.getIndex();
                    if (!(index instanceof IntConstant)) {
                        stores++;
                    }
                }
            }
        }

        this.numFalseSharing = stores;
        this.numFalseSharingAllStores = totalStoresNum;
    }

    /**
     * Finds the percentage of operations in the input method's body that happen
     * within critical sections.
     * @param body Input method's body.
     */
    private void checkCriticalSections (Body body, Map<Unit, Integer> unitDepth) {
        // critical sections created with lock and synchronized method/block
        SootMethod sm = body.getMethod();
        JimpleBody jBody = (JimpleBody) body;
        LoopNestTree loopNestTree = new LoopNestTree(body); /// todo: move to a method

        if (sm.isSynchronized()) {
            this.numCriticalSections = this.numIntructions;
        } else {
            //
            // Get list of critical sections calculated by soot
            List<CriticalSection> list = LockAllocator.v().getCriticalSections();
            Set<Unit> unitsInCriticSect = new HashSet<Unit>();
            for (CriticalSection sr : list) {
                if (sm.equals(sr.method)) {
                    ////unitsInCriticSect.addAll(sr.units);
                    int it = 1;
                    int depth = unitDepth.getOrDefault(sr.entermonitor, 0);
                    // System.out.println("Critical Section Beggining: " +
                                      //sr.entermonitor + " at depth " + depth);
                    if (depth > 0) {
                        for (Loop loop : loopNestTree) {
                            List<Stmt> loopStmts = loop.getLoopStatements();
                            for (Stmt s : loopStmts) {
                                if (s.equals(sr.entermonitor)) {
                                    it = loopRanges.getOrDefault(loop, new Range(0,1)).diff();
                                }
                            }

                        }
                    }
                    this.numCriticalSections += sr.units.size() * it;
                }
            }
        }
    }

    /**
     * Checks if input unit is an atomic operation.
     * @param u Input unit.
     * @return True if input unit is an atomic operation.
     */
    private boolean isAtomicOp (Unit u) {
        JInvokeStmt invoke = null;
        if (u instanceof JAssignStmt) {
            JAssignStmt assign = (JAssignStmt) u;
            Value op = assign.getRightOp();
            if (op instanceof JInvokeStmt) {
                invoke = (JInvokeStmt) op;
            } else {
                return false;
            }
        } else if (u instanceof JInvokeStmt) {
            invoke  = (JInvokeStmt) u;
        } else {
            return false;
        }

        if (invoke != null) {
            InvokeExpr expr = invoke.getInvokeExpr();
            if (expr instanceof JVirtualInvokeExpr) {
                JVirtualInvokeExpr vi = (JVirtualInvokeExpr) expr;
                SootMethod sm = vi.getMethod();
                SootClass  sc = sm.getDeclaringClass();
                //
                // Considering any call to the atomic package as being a atomic
                // operation. see:
                // https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/atomic/package-summary.html
                if (sc.getPackageName().equals("java.util.concurrent.atomic")) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Checks if input Unit is an explicity barrier in java code.
     * @param u Input unit.
     * @return True if input unit is a barrier
     */
    private boolean isBarrierOp (Unit u) {
        // We look for explicit barriers in java code
        JInvokeStmt invoke = null;
        if (u instanceof JAssignStmt) {
            JAssignStmt assign = (JAssignStmt) u;
            Value op = assign.getRightOp();
            if (op instanceof JInvokeStmt) {
                invoke = (JInvokeStmt) op;
            }
        } else if (u instanceof JInvokeStmt) {
            invoke  = (JInvokeStmt) u;
        } else {
            return false;
        }

        if (invoke != null) {
            InvokeExpr expr = invoke.getInvokeExpr();
            if (expr instanceof JVirtualInvokeExpr) {
                JVirtualInvokeExpr vi = (JVirtualInvokeExpr) expr;
                SootMethod sm = vi.getMethod();
                SootClass  sc = sm.getDeclaringClass();
                if (sc.getName().equals("java.util.concurrent.CyclicBarrier")) {
                    if (sm.getSubSignature().equals("int await()")) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /**
     * Check if input Switchable is a memory operation.
     * @param u Input switchable (Unit/Value...).
     * @return True if input is a memory operation.
     */
    private boolean isMemoryUnit (Switchable u) {
        // heap mem inst -> virtualinvoke, lengthOf, new, newarray.
        // staticinvoke may contribute only in propagation throught callgraph.
        if (u instanceof JLengthExpr) {
            return true;
        } else if (u instanceof JNewExpr) {
            return true;
        } else if (u instanceof JNewArrayExpr) {
            return true;
        } else if (u instanceof JInvokeStmt) {
            JInvokeStmt invoke = (JInvokeStmt) u;
            InvokeExpr invokeExpr = invoke.getInvokeExpr();
            if (invokeExpr instanceof JVirtualInvokeExpr) {
                return true;
            }
        } else if (u instanceof JArrayRef) {
            // case with load or store into array with no constant index
            Value index = ((JArrayRef)u).getIndex();
            if (!(index instanceof IntConstant)) {
                return true;
            }
        } else if (u instanceof AbstractBinopExpr) {
            Value right = ((AbstractBinopExpr)u).getOp1();
            Value left = ((AbstractBinopExpr)u).getOp2();
            if (left instanceof JArrayRef) {
                Value index = ((JArrayRef)left).getIndex();
                if (!(index instanceof IntConstant)) {
                    return true;
                }
            }
            if (right instanceof JArrayRef) {
                Value index = ((JArrayRef)right).getIndex();
                if (!(index instanceof IntConstant)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Check if input unit represents a memory instruction
     * @param u Input unit.
     * @return True if input unit is a branch instruction.
     */
    private boolean isMemoryInst (Unit u) {
        //
        // Checks if we have load or store for references
        boolean isMemory = isMemoryUnit(u);
        if (u instanceof JAssignStmt) {
            JAssignStmt assignment = (JAssignStmt) u;
            isMemory |= isMemoryUnit(assignment.getRightOp());
            isMemory |= isMemoryUnit(assignment.getLeftOp());
        }
        return isMemory;

        // FOR BAF ONLY
//        if (u instanceof BLoadInst) {
//            Type type = ((BLoadInst)u).getOpType();
//            if (type instanceof soot.RefType)
//                return true;
//            // type could be soot.IntType, DoubleType, which are for primitives
//        } else if (u instanceof BStoreInst) {
//            Type type = ((BStoreInst)u).getOpType();
//            if (type instanceof soot.RefType)
//                return true;
//        }

    }

    /**
     * Check if input unit represents a branch instruction
     * @param u Input unit.
     * @return True if input unit is a branch instruction.
     */
    private boolean isBranchInst (Unit u) {
        if (u instanceof JGotoStmt)
            return true;
        else if (u instanceof JIfStmt)
            return true;
        else if (u instanceof JTableSwitchStmt)
            return true;
        else if (u instanceof JLookupSwitchStmt)
            return true;
        else
            return false;
    }
}
