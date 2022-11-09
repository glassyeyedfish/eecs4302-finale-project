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
	(elseifblock)*
	(elseblock)?
	'END IF'										#PLIfBlock
	;
	
elseifblock: 'ELSE IF' expr 'THEN'
	(assign | ifblock)+
	;
	
elseblock: 'ELSE'
	(assign | ifblock)+
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
	
expr_addsub: expr_addsub '+' expr_muldiv			#PLAddition
	| expr_addsub '-' expr_muldiv					#PLSubtraction
	| expr_muldiv									#PLAddsubFallthrough
	;

expr_muldiv: expr_muldiv '*' expr_exp				#PLMutiplication
	| expr_muldiv '/' expr_exp						#PLDivision
	| expr_exp										#PLMuldivFallthrough
	;

expr_exp: expr_exp '**' expr_base					#PLExponent
	| expr_base										#PLExpFallthrough
	;

expr_base:  '(' expr ')'							#PLBrackets
	| '!' expr									#PLNot
	| 'LOG' '(' expr ')'						#PLLog
	| 'SIN' '(' expr ')'						#PLSin
	| 'COS' '(' expr ')'						#PLCos
	| 'TAN' '(' expr ')'						#PLTan
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