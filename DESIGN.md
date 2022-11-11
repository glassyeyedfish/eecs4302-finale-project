# Programming Language (Tennis) (.tns)

A short list of all language features:

- Types: INT, BOOL
- Functions
- Variable Assignment
- Brackets: ()
- Math Operators: +, -, *
- Comparison Operators: ==, !=, <, >, <=, >=
- Logical Operators: &&, ||
- Control Flow: if, else if, else
- Basic Output: PRINT

A simple program that demonstrates the language features:

```
PROGRAM prog0
	!! comments begin with '!!'
	
	!! you can declare a bunch of functions
	FUNC my_print (BOOL :: var)
		PRINT var
	END FUNC
	
	!! functions can have a return type at the end
	FUNC add (INT :: a, INT :: b) :: INT
		RETURN a + b
	END FUNC
	
	!! you must have a main function, with an empty signature, the be the entry point
	!! of the program
	
	!! you can also declare variable inside of functions! Just remember, you have to
	!! put all your declarations at the beginning, and assign them all with a literal
	FUNC main ()
		!! like this
		INT :: a = 1
		
		!! you can't assign an expression
		INT :: b = 1 + 1
		
		!! and you can't forget the assignment
		INT :: c
		
		PRINT a
	END FUNC
	
	!! Here is an example of all possible operators supported by the langugae in order 
	!! from highest precedence to lowest
	FUNC ops (INT :: param)
		INT :: i = 0
		BOOL :: b = TRUE
		
		b = !TRUE 			!! FALSE
		
		i = 17 * 24			!! 408
		
		i = 2 + 2			!! 4 (not 5)
		i = 0 - 1			!! -1
		
		b = 0 < 1			!! TRUE
		b = 0 > 1			!! FALSE
		b = 1 <= 1			!! TRUE
		b = 0 >= 1			!! FALSE
		
		b = 1 == 2			!! FALSE
		b = 1 != 2			!! TRUE
		
		b = TRUE && FALSE		!! FALSE
		
		b = TRUE || FALSE		!! TRUE
		
		!! You can also use round brackets to force an order of operations
		i = 2 * 3 + 4 		!! 6
		i = 2 * (3 + 4)		!! 14
		
		!! Finally, you can refer to any declared variables or function parameters
		i = i + 1			!! 15
		i = param			!! param
	END FUNC
```

# Testing Language (.tns.test)

# Running the Compiler

`java -jar compiler.jar -i src/*.tns -t tests/*.tns.tst -o index.html`