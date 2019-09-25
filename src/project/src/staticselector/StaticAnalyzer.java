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

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import soot.Body;
import soot.DoubleType;
import soot.FastHierarchy;
import soot.IntType;
import soot.Local;
import soot.LongType;
import soot.PatchingChain;
import soot.RefType;
import soot.Scene;
import soot.SootClass;
import soot.SootMethod;
import soot.Unit;
import soot.baf.BafBody;
import soot.jimple.InvokeExpr;
import soot.jimple.Jimple;
import soot.jimple.JimpleBody;
import soot.jimple.Stmt;
import soot.jimple.StringConstant;
import soot.jimple.internal.JAssignStmt;
import soot.jimple.toolkits.annotation.logic.Loop;
import soot.jimple.toolkits.callgraph.CallGraph;
import soot.jimple.toolkits.callgraph.Edge;
import soot.tagkit.AnnotationTag;
import soot.tagkit.Tag;
import soot.tagkit.VisibilityAnnotationTag;
import soot.toolkits.graph.ExceptionalUnitGraph;
import soot.toolkits.graph.LoopNestTree;
import soot.toolkits.graph.UnitGraph;
import soot.util.Chain;
import staticselector.utils.Logger;

/**
 * Parses CallGraph, extracts static features of methods and build
 * a map <SootMethod, Features>.
 */
public class StaticAnalyzer {
    private CallGraph cg;
    private Map<SootMethod, Features> featuresLibMap;
    private Map<SootMethod, Features> featuresMap;
    private Map<SootMethod, Features> propagatedFeaturesMap;
    private List<SootMethod> enterMethods;
    private boolean debug = true;

    public StaticAnalyzer (CallGraph cg) {
        this.cg = cg;
        featuresMap = new HashMap<SootMethod, Features> ();
        featuresLibMap = new HashMap<SootMethod, Features> ();
        propagatedFeaturesMap = new HashMap<SootMethod, Features> ();
        enterMethods = new ArrayList<SootMethod>();
    }

    public void run () {
        //
        // 1 - Iterate over all application classes / methods and extract
        // the features for them. (Only for Parallel Regions)
        generalFeatureExtraction();

        //
        // 2 - Traverse the Call Graph and propagate the features through the
        // methods (May extrapole Parallel Regions to their calls)
        propagateFeatures();
    }

    /**
     * Checks if input class is member of a library package.
     * @param sclass Input class.
     * @return true if class is member of a library package, false otherwise.
     */
    private boolean isLibraryClass (SootClass sclass) {
        String pack = sclass.getPackageName();
        if (pack.startsWith("java."))
            return true;
        else if (pack.startsWith("jdk."))
            return true;
        else if (pack.startsWith("soot."))
            return true;
        else if (pack.startsWith("sun."))
            return true;
        else if (pack.startsWith("oracle."))
            return true;
        else
            return false;
    }

    private boolean isHelperMain (SootClass sc) {
        String name = sc.getName();
        if (name.contains("HelperMain"))
            return true;
        return false;
    }

    private boolean hasParallelMethod (SootClass _class_) {
        List<SootMethod> methods = _class_.getMethods();
        for (SootMethod method : methods) {
            List<Tag> tags = method.getTags();
            for (Tag tag : tags) {
                if (tag instanceof VisibilityAnnotationTag) {
                    ArrayList<AnnotationTag> aTags =
                            ((VisibilityAnnotationTag)tag).getAnnotations();
                    for (AnnotationTag annotation : aTags) {
                        String name = annotation.getType();
                        if (name.equals("LParallelRegion;")) {
                            enterMethods.add(method);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /**
     * Iterates over all application classes and methods, and create an
     * Feature object for each method.
     */
    private void generalFeatureExtraction () {
        //
        // We use a very simple notion of parallel region. A paralle region is
        // a class that implements Runnnable or inherits Thread
        // We also analyze methods manually identified in fake main or by
        // the @ParallelRegion tag
        if (debug) Logger.log("Extracting features for all parallel regions.");
        Chain<SootClass> classes = Scene.v().getApplicationClasses();
        for (SootClass sclass : classes) {
            if (!isLibraryClass(sclass) &&
                    (isParallelClass(sclass) || isHelperMain(sclass) ||
                    hasParallelMethod(sclass)) ) {
                System.out.println("  Generating Features to " + sclass.getName());
                List<SootMethod> methods = sclass.getMethods();
                for (SootMethod method : methods) {
                    //System.out.println("   # " + method.getSubSignature() );
                    featuresMap.put(method, new Features(method));
                }
            }
        }
    }

    /**
     * Checks if input class implements runnable or inherits Thread
     * @param sclass Input class
     * @return Results
     */
    private boolean isParallelClass (SootClass sclass) {
        FastHierarchy h = Scene.v().getOrMakeFastHierarchy();
        if( sclass.implementsInterface("java.lang.Runnable") ||
            h.isSubclass(sclass, Scene.v().getSootClass("java.lang.Thread"))) {
            return true;
        } else {
            return false;
        }
    }


    /**
     * Traverses the CG and propagates features from each callee to its callers.
     */
    private void propagateFeatures () {
        if (debug) Logger.log("Propagating features through the Call Graph");
        Set<SootMethod> calculated = new HashSet<SootMethod>();
        Chain<SootClass> classes = Scene.v().getApplicationClasses();
        try {
            for (SootClass sclass : classes) {
                List<SootMethod> methods = sclass.getMethods();
                for (SootMethod method : methods) {
                    if (!calculated.contains(method)) {
                        propagateFeatures(method, calculated);
                    }
                }
            }
        } catch (RuntimeException e) {
            System.err.println("Exception at : " + e);
        }
    }

    /**
     * Propagates features to target SootMethod.
     * @param sm Target SootMethod.
     * @param calculated Set containing methods with features already calculated.
     * @throws RuntimeException
     */
    private void propagateFeatures (SootMethod sm, Set<SootMethod> calculated)
        throws RuntimeException {
        if (sm.isPhantom() || sm.isAbstract()) {
            return;
        }
        Features propagated = getFeatures(sm);
        try {            
            Chain<Unit> units = sm.retrieveActiveBody().getUnits();            
            for (Unit u : units) {
                if (u instanceof Stmt) {
                    Stmt s = (Stmt) u;
                    if (s.containsInvokeExpr()) {
                        Iterator<Edge> it = this.cg.edgesOutOf(u);
                        while (it.hasNext()) {
                            Edge e = it.next();
                            SootMethod tgt = e.tgt();

                            if (!calculated.contains(tgt) &&
                                    !isLibraryClass(tgt.getDeclaringClass())) {
                                calculated.add(tgt);
                                propagateFeatures(tgt, calculated);
                            }
                            
                            Features features = getFeatures(tgt);                            
                            propagated.addFeaturesFromCall(features, u, sm);
                            propagatedFeaturesMap.put(sm, propagated);                        
                        }
                    }
                }
            }

            calculated.add(sm);

        } catch (Exception e) {
           //System.err.println("Failed when propagating features : " + e);
           //handler(e);
        }
    }    

    /**
     * Returns the Features object of a given method passes as parameter.
     * In case of no object found, a new one will be created and returned.
     * @param method Method which features are required.
     * @return Features object.
     */
    public Features getFeatures (SootMethod method) {
        if (propagatedFeaturesMap.containsKey(method)) {
            return propagatedFeaturesMap.get(method);
        } else if (featuresMap.containsKey(method)) {
            return featuresMap.get(method);
        } else if (featuresLibMap.containsKey(method)) {
            return featuresLibMap.get(method);
        } else {
            Features features = new Features(method);
            featuresLibMap.put(method, features);
            return features;
        }
    }

    /**
     * Dumps code in Jimple and BAF IRs into a tmp directory.
     */
    public void dumpIR () {
        Chain<SootClass> classes = Scene.v().getApplicationClasses();
        for (SootClass sclass : classes) {
            File jFile = new File("tmp/" + sclass.getName() + ".J");
            File bFile = new File("tmp/" + sclass.getName() + ".B");
            try {
                FileWriter jfw = new FileWriter(jFile);
                FileWriter bfw = new FileWriter(bFile);
                BufferedWriter jbw = new BufferedWriter(jfw);
                BufferedWriter bbw = new BufferedWriter(bfw);
                for (SootMethod sm : sclass.getMethods()) {
                    jbw.write("\n" + sm.getSubSignature() + "   { \n");
                    bbw.write("\n" + sm.getSubSignature() + "   { \n");
                    JimpleBody jbody = (JimpleBody) sm.retrieveActiveBody();
                    PatchingChain<Unit> units = jbody.getUnits();
                    for (Unit u : units) {
                        jbw.write("\t" + u + " || " + u.getClass().getName() + "\n");
                        if ( u instanceof JAssignStmt) {
                            JAssignStmt as = (JAssignStmt) u;
                            String a = as.getLeftOp().getType().toString();
                            //jbw.write("\t\t" + a + " ## " + as.getLeftOp().getClass().getName() + "\n");
                        }
                    }
                    PatchingChain<Unit> bunits = (new BafBody(jbody, null)).getUnits();
                    for (Unit u : bunits) {
                        bbw.write("\t" + u + " || " + u.getClass().getName() + "\n");
                    }
                }
                jbw.close();
                bbw.close();
                jfw.close();
                bfw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Print the features Map of each method using the percentage notation
     * for each category of interest.
     */
    public void printFeaturesMap () {
        for (Map.Entry<SootMethod, Features> entry :
                                            propagatedFeaturesMap.entrySet()) {
            SootMethod method = entry.getKey();
            Features features = entry.getValue();
            System.out.println("Method: " + method.getSignature());
            features.showPercentages();
        }

        for (Map.Entry<SootMethod, Features> entry : featuresMap.entrySet()) {
            SootMethod method = entry.getKey();
            if (!propagatedFeaturesMap.containsKey(method)) {
                Features features = entry.getValue();
                System.out.println("Method not propagated: " + method.getSignature());
                features.showPercentages();
            }
        }
    }

    /**
     * Adds profiling information into selected methods. The profiling
     * information contains execution time and feature count.
     */
    public void addProfilingInfo () {
        Chain<SootClass> classes = Scene.v().getApplicationClasses();
        for (SootClass c : classes) {
            //
            // Instrumment methods, but avoing intrummenting our own external
            // logging library
            if (! c.getPackageName().contains("staticselector.")) {
                for (SootMethod sm : c.getMethods()) {
                    ////System.out.println(sm.getSubSignature() + " >> " + getFeaturesStream(sm));
                    profileMethod(sm);
                    addDumper(sm); // only adds dump in main method
                }
            }
        }
    }

    /**
     * Looks for features associated to input method and serialize them into
     * a single String.
     * @param sm Input SootMethod.
     * @return Serialized string.
     */
    private String getFeaturesStream (SootMethod sm) {
        String stream = "";
        Features f = this.propagatedFeaturesMap.getOrDefault(sm,
                this.featuresMap.getOrDefault(sm, null));
        if (f != null) {
            stream = f.serialize();
        }
        return stream;
    }

    /**
     * Adds a call to a dump method in the external logging library. The library then logs
     * the data to a file (ideally). This method looks for the main method of the target
     * application.
     * @param body Body of the main method.
     */
    private void addDumper (SootMethod sm) {
        Body body = sm.retrieveActiveBody();
        boolean isMainMethod = body.getMethod().getSubSignature()
                                               .equals("void main(java.lang.String[])");
        // ToDo: This is the second call to findExitUnits. THey could be merged, to avoid
        // unnecessary computation.
        List<Unit> exitUnits = findExitUnits(body);
        Chain<Unit> units = body.getUnits();
        SootClass loggerClass  = Scene.v().getSootClass("staticselector.exlib.DataLogger");
        for (Unit exit : exitUnits) {
            Unit dump = Jimple.v().newInvokeStmt(
                        Jimple.v().newStaticInvokeExpr(loggerClass.getMethod(
                        "void dump()").makeRef()));
            if (isMainMethod) {
                units.insertBefore(dump, exit);
            } else
              if (exit instanceof Stmt && ((Stmt)exit).containsInvokeExpr()) {
                units.insertBefore(dump, exit);
            }
        }
    }

    /**
     * Adds profiling information in input method.
     * @param sm Input method.
     */
    private void profileMethod (SootMethod sm) {
        JimpleBody body = (JimpleBody) sm.retrieveActiveBody();
        Unit  insertionPoint   = body.getFirstNonIdentityStmt();
        Chain<Unit> units      = body.getUnits();
        List<Unit> exitUnits   = findExitUnits(body);
        List<Unit> unitsToInsert = new ArrayList<Unit>();
        String timeClass       = "<java.lang.System: long nanoTime()>";
        SootClass loggerClass  = Scene.v().getSootClass(
                                  "staticselector.exlib.DataLogger");
        String serializedFeatures = getFeaturesStream(sm);
        String methodHash = String.valueOf(sm.getSignature().hashCode());
        serializedFeatures = methodHash + "," + serializedFeatures;
        //
        // variables to be inserted in target methods.
        Local var_init, var_end, var_diff;
        var_init = insertDeclaration("$r_initTime" , "long", body);
        var_end  = insertDeclaration("$r_endTime"  , "long", body);
        var_diff = insertDeclaration("$r_diffTime" , "long", body);

        //
        // Creating TimeStamps. Creating instructions to collect
        // system.nanoTime() at the beggining method.
        Unit initTimestamp = Jimple.v().newAssignStmt(var_init,
                                Jimple.v().newStaticInvokeExpr(
                                Scene.v().getMethod(timeClass).makeRef()));
        units.insertBefore(initTimestamp, insertionPoint);
        //
        // Creating instructions to collect system.nanoTime()
        // at al exit points of method
        for (Unit exit : exitUnits) {
            unitsToInsert.clear();
            // end timestamp
            unitsToInsert.add(Jimple.v().newAssignStmt(var_end,
                                Jimple.v().newStaticInvokeExpr(
                                Scene.v().getMethod(timeClass).makeRef())));

            // getting diff timestamp (end - init)
            unitsToInsert.add(Jimple.v().newAssignStmt(var_diff,
                                Jimple.v().newSubExpr(var_end, var_init)));

            // adding method call to our external logging library
            unitsToInsert.add(Jimple.v().newInvokeStmt(
                        Jimple.v().newStaticInvokeExpr(loggerClass.getMethod(
                        "void log(java.lang.String,long)").makeRef(),
                        StringConstant.v(serializedFeatures), var_diff)));

            // actually inserting new instructions before every exit point.
            for (Unit unit : unitsToInsert) {
                units.insertBefore(unit, exit);
            }
        }

        //
        // Check, against Soot Standards, if the modifications in this method's body
        // are valid.
        try {
            body.validate();
        } catch (Exception e) {
            System.err.println("Error: The Soot Body is not valid!");
            System.err.println(e);
            System.err.println(body.getMethod().getSignature());
        }

    }


    /**
     * Get all exit points in the input body.
     * @param body Input body.
     * @return List of all exit points.
     */
    private List<Unit> findExitUnits (Body body) {
        // does not include calls to System.exit
        UnitGraph cfg = new  ExceptionalUnitGraph(body);
        List<Unit> exitNodes = new ArrayList<Unit>(cfg.getTails());
        // adding calls to System.exit()
        Chain<Unit> units = body.getUnits();
        for (Unit u : units) {
            if (u instanceof Stmt && ((Stmt)u).containsInvokeExpr()) {
                InvokeExpr invoke = ((Stmt)u).getInvokeExpr();
                SootMethod callee = invoke.getMethod();
                if (callee.getSignature().equals(
                    "<java.lang.System: void exit(int)>")) {
                    exitNodes.add(u);
                }
            }
        }
        return exitNodes;
    }

    /**
     * Method for inserting local declaration in sootMethod.
     * @param name Local ASCII name.
     * @param type Local type.
     * @param body Method's body.
     * @return Reference to the local, already inserted into the method's body.
     */
    private Local insertDeclaration(String name, String type, Body body) {
        Local tmp;
        switch(type) {
            case "long":
                tmp = Jimple.v().newLocal(name, LongType.v());
                break;
            case "int":
                tmp = Jimple.v().newLocal(name, IntType.v());
                break;
            case "double":
                tmp = Jimple.v().newLocal(name, DoubleType.v());
                break;
            default:
                tmp = Jimple.v().newLocal(name, RefType.v(type));
                break;
        }

        // check if we already have the dec in method
        Chain<Local> locals = body.getLocals();
        for (Local l : locals) {
            if(l.equals(tmp))
                return l;
        }

        locals.add(tmp);
        return tmp;
    }

    public List<SootMethod> getMethods() {
        return enterMethods;
    }
}
