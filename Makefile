SOOT9=src/project/lib/sootclasses_j9-trunk-jar-with-dependencies.jar
JAVA11=/usr/lib/jvm/java-11-openjdk-amd64/bin

all:
	mkdir -p build
	$(JAVA11)/javac -d build -cp $(SOOT9) src/project/src/*.java src/project/src/*/*.java src/project/src/*/*/*.java

tests:
	mkdir -p build/tests
	$(JAVA11)/javac -cp build -d build/tests src/tests/*.java

runtest:
	$(JAVA11)/java -cp $(SOOT9):build staticselector.PassDriver -cp VIRTUAL_FS_FOR_JDK:build:build/tests MergeSort  --app

clean:
	rm -rf build sootOutput tmp

.PHONY: all clean
