grammar ProgLang;

@header {
	package progantlr;
}

// Forces declarations to be at the top
prog: 'PROGRAM' ID
	(func)+
	'END PROGRAM' 
	EOF  											#PLProgram
	;
	
func: 'FUNC' ID '(' func_sig ')' ( '::' TYPE)?
	(decl)+
	(assign | print | ifblock)+
	'END FUNC'										#Function
	;
	
func_sig: func_sig_decl (',' func_sig_decl)*
	;
	
func_sig_decl: TYPE '::' ID
	;

decl: TYPE '::' ID '=' 
	(INT_LIT | BOOL_LIT)							#PLDeclaration
	;

assign: ID '=' expr									#PLAssignmnet
	;
	
print: 'PRINT' expr									#PLPrint
	;
	
ifblock: 'IF' expr 'THEN'
	(assign | print | ifblock)+
	(elseifblock)*
	(elseblock)?
	'END IF'										#PLIfBlock
	;
	
elseifblock: 'ELSE IF' expr 'THEN'
	(assign | print | ifblock)+
	;
	
elseblock: 'ELSE'
	(assign | print | ifblock)+
	;

expr: expr '||' expr_and							#PLOr
	| expr_and										#PLOrFallthrough
	;
	
expr_and: expr_and '&&' expr_eq						#PLAnd
	| expr_eq										#PLAndFallthrough
	;
	
expr_eq: expr_eq '==' expr_ineq						#PLEquals
	| expr_eq '!=' expr_ineq						#PLNotEquals
	| expr_ineq										#PLEqFallthrough
	;
	
expr_ineq: expr_ineq '<' expr_addsub				#PLLessThan
	| expr_ineq '>' expr_addsub						#PLGreaterThan
	| expr_ineq '<=' expr_addsub					#PLLessEquals
	| expr_ineq '>=' expr_addsub					#PLGreaterEquals
	| expr_addsub									#PLIneqFallthrough
	;
	
expr_addsub: expr_addsub '+' expr_mult				#PLAddition
	| expr_addsub '-' expr_mult						#PLSubtraction
	| expr_mult										#PLAddsubFallthrough
	;

expr_mult: expr_mult '*' expr_base					#PLMutiplication
	| expr_base										#PLMultFallthrough

expr_base:  '(' expr ')'							#PLBrackets
	| '!' expr										#PLNot
	| ID											#PLVariable
	| INT_LIT										#PLIntLiteral
	| BOOL_LIT										#PLBoolLiteral
	;

TYPE: 'INT' | 'BOOL' ;

INT_LIT: '0'|'-'?[1-9][0-9]*;
BOOL_LIT: 'TRUE'|'FALSE';

ID: [a-z][a-z0-9_]*;

COMMENT: '!!' ~[\r\n]* -> skip ;
WS: [ \t\n\r]+ -> skip ;
