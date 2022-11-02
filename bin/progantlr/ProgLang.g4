grammar ProgLang;

@header {
	package progantlr;
}

// Forces declarations to be at the top
prog: 'PROGRAM' ID
	(decl)+
	(
		  assign
		| ifblock
	)+ 
	'END PROGRAM' 
	EOF  											#PLProgram
	;

decl: TYPE '::' ID									#PLDeclaration
	;

assign: ID '=' expr									#PLAssignmnet
	;
	
ifblock: 'IF' expr 'THEN'
	(assign | ifblock)+
	'END IF'										#PLIfBlock
	;

expr:  expr '+' expr								#PLAddition
	| ID											#PLVariable
	| INT_LIT										#PLIntLiteral
	| BOOL_LIT										#PLBoolLiteral
	;

TYPE: 'INT' | 'BOOL' ;

INT_LIT:'0'|'-'?[1-9][0-9]*;
BOOL_LIT:'TRUE'|'FALSE';

ID: [a-z][a-z0-9_]*;

COMMENT: '!!' ~[\r\n]* -> skip ;
WS: [ \t\n\r]+ -> skip ;