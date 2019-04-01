all: compileTest

compileTest:
	mkdir -p bin
	javac -classpath /usr/share/java/junit4.jar src/Min.java testcases/MinParameterizedTest.java testcases/TestRunner.java -d bin

test:
	cd bin ; java -classpath .:/usr/share/java/junit4.jar TestRunner

clean:
	rm bin/*.class
