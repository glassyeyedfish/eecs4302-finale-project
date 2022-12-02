grammar TestLang;

@header {
	package testlang.antlr;
}

prog: 'TEST' ID
	(test_func)+ 
	'END TEST' 
	EOF  											#TLProgram
	;

test_func: '@Test' 'FUNC' ID '(' ')'
	(func_call | assrt)+
	'END FUNC'										#TLTestFunc
	;
	
func_call: ID '(' ((expr ',')* expr)? ')'			#TLFunctionCall
	;
	
assrt: 'ASSERTEQUALS' '(' func_call ',' expr ')'	#TLAssertEquals
	 | 'ASSERT' '(' func_call ')'					#TLAssert
	 ;

expr: INT_LIT 										#TLInteger
	| BOOL_LIT										#TLBoolean
	;

TYPE: 'INT' | 'BOOL' ;

INT_LIT: '0'|'-'?[1-9][0-9]*;
BOOL_LIT: 'TRUE'|'FALSE';

ID: [a-z][a-z0-9_]*;

COMMENT: '!!' ~[\r\n]* -> skip ;
WS: [ \t\n\r]+ -> skip ;