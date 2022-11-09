The following commands should run the three prepared tests:

java -jar compiler.jar src/tests/test0.txt
java -jar compiler.jar src/tests/test1.txt
java -jar compiler.jar src/tests/test2.txt

Each test looks like this:

TEST PROGRAM some_test
	RUN some_program
END TEST PROGRAM

In this example, the compiler will search for 'some_program.txt' in the root 
directory, and run all implemented tests on 'some_program'.