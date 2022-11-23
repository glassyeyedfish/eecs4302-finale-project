grammar ProgLang;

@header {
	package proglang.antlr;
}

prog:	'PROGRAM' ID (func)+ 'END PROGRAM' EOF		# Program
	;

func:	'FUNC' ID 
		'(' 
		((attr_decl ',')* attr_decl)? 
		')' 
		('::' TYPE)?
		(attr_decl)*
		(attr_asgmt | prnt | if_block | func_call)*
		('return' expr)?
		'END' 'FUNC'								# Function
	;
	
func_call: ID '(' ((expr ',')* expr)? ')'			# FunctionCall
		 ;

attr_decl:	TYPE '::' ID							# AttributeDecl
		 ;

attr_asgmt: ID '=' expr								# AttributeAsgmt
		  ;

prnt:	'PRINT' '(' expr ')'						# Print
	;

if_block:	'IF' '(' expr ')' 'THEN'
			(attr_asgmt | prnt | if_block | func_call)*	
			'END' 'IF'								# Conditional
	    ;

expr: '(' expr ')'									# Parentheses
	| ID '(' ((expr ',')* expr)? ')'				# FunctionCallInExpression
	| expr '*' expr									# Multiplication
	| expr '+' expr									# Addition
	| expr '-' expr									# Subtraction
	| expr '>' expr									# GreaterThan
	| expr '<' expr									# LessThan
	| expr '>=' expr								# GreaterThanOrEqualTo
	| expr '<=' expr								# LessThanOrEqualTo
	| expr '==' expr								# EqualTo
	| expr '!=' expr								# NotEqualTo
	| expr '&&' expr								# And
	| expr '||' expr								# Or
	| '!' expr										# Not
	| ID											# Variable
	| INT											# Integer
	| BOOL											# Boolean
	;

TYPE: 'INT' | 'BOOL' ;
INT: '0'|'-'?[1-9][0-9]*;
BOOL: 'TRUE'|'FALSE';
ID: [a-z][a-z0-9_]*;
COMMENT: '!!' ~[\r\n]* -> skip ;
WS: [ \t\n\r]+ -> skip ;
