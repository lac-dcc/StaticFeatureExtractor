
# JVM Static Feature Extractor

**JVM Static Feature Extractor** is an open-source static code feature extractor that uses the features specified by the [CHOAMP](https://ieeexplore.ieee.org/document/8254393/) technique. The tool receives JVM compatible bytecode as input, which enables the extractor to work with a wide set of programming languages, such as Java, Scala, Kotlin or even Android applications.

## Requeriments

To compile and run this tool you'll need:

 - Oracle openJDK 11
 - [Soot 3.2.0] [Soot9 branch] (https://github.com/Sable/soot)
 	* *currently shippend with from this github repository.*
 - Make
 - Bash
 - Python 2.7 and the following packages:
	 - pandas
	 - sklearn
	 - numpy
	 

## Installation

1 - Clone the repository:
```bash
git clone https://github.com/lac-dcc/StaticFeatureExtractor.git
```

2 - Access the *StaticFeatureExtractor* dir and open the Makefile file:
```bash
cd StaticFeatureExtractor
vim Makefile
```
3 - Update the variable JAVA11, setting it to the place where the binaries for the openJDK 11 are installed, for example:
*	JAVA11=/usr/lib/jvm/java-11-openjdk-amd64/bin/

4 - Run the make command for compiling the tool:
```console
make
```

After running this command you should have several compiled classes for the tool inside the *build* dir.


## First run

The Extractor comes with some examples/tests you can use to test the tool and check how the annotation system works. They are placed in the directory `src/tests/`. You can compile them with the command:
```bash
make tests
```
After compiling them, you can run the tests with the following command line:
```bash
make runtest
```

If you want to manually run this command you should use the command below:

```bash
java -cp src/project/lib/sootclasses_j9-trunk-jar-with-dependencies.jar:build staticselector.PassDriver -cp VIRTUAL_FS_FOR_JDK:build:build/tests MergeSort  --app
```

When running this command you should have an output similar to this:
```bash
 make runtest
/usr/lib/jvm/java-11-openjdk-amd64/bin/java -cp src/project/lib/sootclasses_j9-trunk-jar-with-dependencies.jar:build staticselector.PassDriver -cp VIRTUAL_FS_FOR_JDK:build:build/tests MergeSort  --app

================ Initializing Tool ================

staticselector.PassDriver.main - Instrummenting Java/Kotlin/Scala file
staticselector.PassDriver.main - Running Soot ...
Soot started on Wed Sep 22 15:05:43 BRT 2019
staticselector.PassDriver$1.internalTransform - Building Call Graph
staticselector.PassDriver$1.internalTransform - Finding Critical Sections
added edge from <MergeSort: void parallelMergeSort(int[],int)> to <Sorter: void run()>
added edge from <MergeSort: void parallelMergeSort(int[],int)> to <Sorter: void run()>
staticselector.StaticAnalyzer.generalFeatureExtraction - Extracting features for all parallel regions.
  Generating Features to MergeSort
  Generating Features to Sorter
staticselector.StaticAnalyzer.propagateFeatures - Propagating features through the Call Graph
Features order [Branches, CriticalSections, Memory, Atomic, FalseSharing, Barriers]
Program Point #  <MergeSort: void main(java.lang.String[])> :: 18.538420204191294, 0.0, 29.446534121440084, 0.0, 1.4354066985645932, 0.0
Soot finished on Wed Sep 22 15:05:54 BRT 2019
Soot has run for 0 min. 10 sec.
```

## Code Documentation

https://lac-dcc.github.io/StaticFeatureExtractor/

## License

GNU GPL3
