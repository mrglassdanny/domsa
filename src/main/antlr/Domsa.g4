grammar Domsa;

@header {
package com.github.mrglassdanny.domsa.lang.antlr;
}

script: assignment* EOF;

assignment: WORD EQUAL expression end;

expression: (WORD | number) (operator (expression))?;

operator: (PLUS | MINUS | STAR | DIV | MOD);

number: MINUS? NUMERIC_LITERAL;

end: NEWLINE+;

LEFT_PAREN: '(';
RIGHT_PAREN: ')';
LEFT_BRACE: '{';
RIGHT_BRACE: '}';
LEFT_BRACKET: '[';
RIGHT_BRACKET: ']';
LESS: '<';
GREATER: '>';
LESS_EQUAL: '<=';
GREATER_EQUAL: '>=';
DOUBLE_LESS: '<<';
DOUBLE_GREATER: '>>';
PLUS: '+';
MINUS: '-';
STAR: '*';
DIV: '/';
MOD: '%';
BACKSLASH: '\\';
AMPERSAND: '&';
CARET: '^';
BANG: '!';
QUESTION: '?';
COLON: ':';
SEMI_COLON: ';';
COMMA: ',';
PIPE: '|';
DOUBLE_PIPE: '||';
POUND: '#';
AT: '@';
EQUAL: '=';
NOT_EQUAL: '!=' | '<>';
DOT: '.';
DOLLAR_SIGN: '$';

NUMERIC_LITERAL:
	DIGIT+ ('.' DIGIT*)? (E [-+]? DIGIT+)?
	| '.' DIGIT+ ( E [-+]? DIGIT+)?;

STRING_LITERAL: (
		'\'' ( ~'\'' | '\'\'')* '\''
		| '"' ( ~'"' | '""')* '"'
	);

FMT_STRING_LITERAL: (
		'`' .*? '`'
	);

WORD: [a-zA-Z_0-9.]+;

BLOCK_COMMENT: '/*' .*? '*/' -> channel(HIDDEN);

WHITESPACE: [ \t]+ -> channel(HIDDEN);

NEWLINE: ( '\r' '\n'? | '\n');

fragment DIGIT: [0-9];

fragment A: [aA];
fragment B: [bB];
fragment C: [cC];
fragment D: [dD];
fragment E: [eE];
fragment F: [fF];
fragment G: [gG];
fragment H: [hH];
fragment I: [iI];
fragment J: [jJ];
fragment K: [kK];
fragment L: [lL];
fragment M: [mM];
fragment N: [nN];
fragment O: [oO];
fragment P: [pP];
fragment Q: [qQ];
fragment R: [rR];
fragment S: [sS];
fragment T: [tT];
fragment U: [uU];
fragment V: [vV];
fragment W: [wW];
fragment X: [xX];
fragment Y: [yY];
fragment Z: [zZ];