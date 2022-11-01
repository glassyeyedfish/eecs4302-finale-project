grammar TestLang;

@header {
	package testantlr;
}

prog: 'TEST PROGRAM' ID
	(
		  run
	)+ 
	'END TEST PROGRAM' 
	EOF  											#TLProgram
	;

run: 'RUN' ID										#TLRun
	;

ID: [a-z][a-z0-9_]*;

COMMENT: '!!' ~[\r\n]* -> skip ;
WS: [ \t\n\r]+ -> skip ;