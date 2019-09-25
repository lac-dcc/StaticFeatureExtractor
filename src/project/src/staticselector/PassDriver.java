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

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import soot.*;
import soot.jimple.DynamicInvokeExpr;
import soot.jimple.InvokeExpr;
import soot.jimple.Stmt;
import soot.jimple.toolkits.callgraph.CallGraph;
import soot.jimple.toolkits.callgraph.Edge;
import soot.options.Options;
import soot.util.Chain;
import staticselector.utils.Logger;

// ToDo: Add CHA Graph builder and merge it with Spark Graph

/**
 * Parses input Java classes and extract static features out of them.
 */
public class PassDriver {

    /**
     * Extractor Driver.
     * @param args Command line input arguments.
     */
    public static void main (String[] args) {
        Logger.log("Instrummenting Java/Kotlin/Scala file");
        // specifies soot options for handling JAR/class file
        setSootOptions(extractInput(args));

        // adding our analysis to soot's pipeline
        PackManager.v().getPack("wjtp").add(
            new Transform("wjtp.phases", new SceneTransformer() {
                protected void internalTransform(String phaseName,
                  Map options) {

                    Logger.log("Building Call Graph");
                    Logger.log("Finding Critical Sections");

                    // getting call graph from soot scene
                    CallGraph cg = Scene.v().getCallGraph();
                    Set<SootClass> ths = findUnThreads();
                    extendCallGraph(cg, ths);

                    // initiating our analysis and instrumentation
                    StaticAnalyzer analyzer = new StaticAnalyzer(cg);
                    // running analysis (feature extraction)
                    analyzer.run();

                    // adding log information methods
                    //analyzer.addProfilingInfo();
                    //analyzer.printFeaturesMap();
                    //analyzer.dumpIR();

                    // print features of selected methods
                    System.out.println("Features order [Branches, CriticalSections, "
                            + "Memory, Atomic, FalseSharing, Barriers]");
                    List<SootMethod> _methods_ = analyzer.getMethods();
                    for (SootMethod sm : _methods_) {
                       System.out.println("Program Point #  " + sm.getSignature()
                            + " :: " + analyzer.getFeatures(sm).serialize());
                    }
                }
            }));

            Logger.log("Running Soot ...");

            Scene.v().addBasicClass("staticselector.exlib.DataLogger",
                SootClass.SIGNATURES);
            Scene.v().addBasicClass("java.util.concurrent.ThreadLocalRandom",
                    SootClass.SIGNATURES);
            Scene.v().addBasicClass("scala.runtime.java8.JFunction0$mcZ$sp",
                    SootClass.HIERARCHY);
            Scene.v().addBasicClass("scala.runtime.java8.JFunction1$mcVI$sp",
                    SootClass.HIERARCHY);

            soot.Main.main(args);
    }

    /**
     * Checks if input class is member of a library package.
     * @param sclass Input class.
     * @return true if class is member of a library package, false otherwise.
     */
    private static boolean isLibraryClass (SootClass sclass) {
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

    /**
     * Finds classes which implements Runnable interface or
     * is a subclass of java.lang.Thread.
     * @return A set containing all classes found.
     */
    private static Set<SootClass> findUnThreads () {
        FastHierarchy h = Scene.v().getOrMakeFastHierarchy();
        Set<SootClass> scs = new HashSet<SootClass>();
        for (SootClass sclass : Scene.v().getApplicationClasses()) {
            if (!isLibraryClass(sclass)) {
                if (sclass.implementsInterface("java.lang.Runnable") ||
                        h.isSubclass(sclass, Scene.v().getSootClass("java.lang.Thread"))) {
                    scs.add(sclass);
                }
            }
        }
        return scs;
    }

    /**
     * Iterates over application classes and checks if methods may be added
     * to call graph. Note: check method @simpleCallGraphExtension
     * @param cg Input pre-generated call graph.
     * @param set Set of classes to extend call graph.
     */
    private static void extendCallGraph (CallGraph cg, Set<SootClass> set) {
        List<SootClass> appClassesSnapshot = new ArrayList<SootClass>
                (Scene.v().getApplicationClasses());

        for (SootClass sclass : appClassesSnapshot) {
            if (!isLibraryClass(sclass)) {
                List<SootMethod> methodsSnapshot =
                        new ArrayList<SootMethod>(sclass.getMethods());
                for (SootMethod sm : methodsSnapshot) {
                    try {
                        simpleCallGraphExtension(cg, sm, set);
                    } catch (RuntimeException e) {
                        System.err.println("Failed at " + e);
                        // do not exit on this fail [warning]
                    }
                }
            }
        }
    }

    /**
     * Extends the Call Graph with missing edges
     * - ToDo: Add CHA information
     * @param cg Original Call Graph
     * @param entryPoint Method to be analyzed
     */
    private static void simpleCallGraphExtension (CallGraph cg,
            SootMethod entryPoint, Set<SootClass> set)
       throws RuntimeException {
        if (entryPoint == null)
            entryPoint = Scene.v().getMainMethod();
        if (entryPoint.isPhantom() || entryPoint.isAbstract())
            return;

        Chain<Unit> units = entryPoint.retrieveActiveBody().getUnits();
        List<SootMethod> nexts = new ArrayList<SootMethod>();

        for (Unit u : units) {
            if (u instanceof Stmt) {
                Stmt s = (Stmt) u;
                if (s.containsInvokeExpr()) {
                    InvokeExpr in = s.getInvokeExpr();
                    //System.out.println("Hey > " + in.getMethod().getSignature());
                    SootClass sclass = entryPoint.getDeclaringClass();
                    //
                    // Special Handler for Executor submit
                    if (in.getMethod().getSignature().equals(
                    "<java.util.concurrent.ExecutorService: java.util.concurrent.Future submit(java.lang.Runnable)>"))
                    {
                        Value arg0 = in.getArg(0);
                        Type t = arg0.getType();
                        if (t instanceof RefType) {
                            RefType rt = (RefType) t;
                            SootClass sc = rt.getSootClass();
                            SootMethod sm = sc.getMethod("void run()");
                            Edge e = new Edge(entryPoint, s, sm);
                            cg.addEdge(e);
                            nexts.add(sm);
                        }
                    } else if (in.getMethod().getSignature().equals(
                            "<java.lang.Thread: void start()>")) {
                        for (SootClass tclass : set) {
                            SootMethod sm = tclass.getMethod("void run()");
                            if (!sm.equals(entryPoint)){
                                Edge e = new Edge(entryPoint, s, sm);
                                cg.addEdge(e);
                                nexts.add(sm);
                                System.out.println("added edge from "
                                   + entryPoint.getSignature() + " to "
                                   + sm.getSignature());
                            }
                        }

                    } else {
                        Iterator it = cg.edgesOutOf(u);
                        //
                        // avoid adding extra edges to units with outgoing edges
                        if (!it.hasNext() && !(s.getInvokeExpr() instanceof DynamicInvokeExpr) ) {
                            Edge e = new Edge(entryPoint, s, in.getMethod());
                            cg.addEdge(e);
                            nexts.add(in.getMethod());
                        }
                    }
                }
            }
        }

        for (SootMethod s : nexts) {
            if (!s.getDeclaringClass().getPackageName().startsWith("java."))
                simpleCallGraphExtension(cg, s, set);
        }
    }


    private static String[] extractInput (String[] args) {
        return args;
    }


    /**
     * Sets soot parameters for handling java class/jar files.
     * @param input Path for input directory, class or jar file.
     */
    private static void setSootOptions (String[] input) {
        Options.v().set_whole_program(true);
        Options.v().set_verbose(false);
        Options.v().set_src_prec(Options.src_prec_class);
        Options.v().set_output_format(Options.output_format_jimple);
        Options.v().set_allow_phantom_refs(true);
        Options.v().set_xml_attributes(false);
        Options.v().set_force_overwrite(true);
        Options.v().setPhaseOption("jb","use-original-names:true");
        Options.v().setPhaseOption("jb","preserve-source-annotations:true");
        // results in faster call graphs, exclude libraries
        Options.v().set_no_bodies_for_excluded(true);
        //Options.v().set_process_dir(Collections.singletonList(input));
        Options.v().set_java_version(6);
        Options.v().setPhaseOption("cg.spark", "on");
        // Required for perform LockAllocator analysis and create CriticalSections
        Options.v().setPhaseOption("wjtp.tn", "enabled:true");
        Options.v().setPhaseOption("wjtp.tn", "locking-scheme:leave-original");
        //Options.v().setPhaseOption("wjtp.mhp", "enabled:true");
    }
}
