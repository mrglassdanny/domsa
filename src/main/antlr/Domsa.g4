grammar Domsa;

@header {
package com.github.mrglassdanny.domsa.lang.antlr;
}

postfixExpr
    :
    Id
    (LeftBracket expr RightBracket
    | (Dot) Id
    )*
    ;

mulExpr: (postfixExpr | Number) ((Star | Div | Mod) (postfixExpr | Number))*;

addExpr: mulExpr ((Plus | Minus) mulExpr)*;

relExpr: addExpr ((Less | Greater | LessEqual | GreaterEqual) addExpr)*;

eqExpr: relExpr ((Equal | NotEqual) relExpr)*;

logAndExpr: eqExpr ((And) eqExpr)*;

logOrExpr: logAndExpr ((Or) logOrExpr)*;

condExpr: logOrExpr (Question expr Colon condExpr);

assignExpr: condExpr | ( assignOper assignExpr) | Number | StringLiteral;

assignOper: Assign;

expr: assignExpr (Comma assignExpr)*;

constExpr
    :   condExpr
    ;

jsonAsgExpr: Id Colon expr;

jsonExpr: LeftBrace (jsonAsgExpr (Comma jsonAsgExpr)*)? RightBrace;

jsonInitExpr: Id Assign jsonExpr;

fnExpr: Id LeftParen (expr | jsonExpr)? RightParen;


eos: NewLine+ | EOF;

stmt
    :   lblStmt
    |   compStmt
    |   exprStmt
    |   selStmt
    |   iterStmt
    ;

lblStmt
    :   Id Colon stmt
    |   Case constExpr Colon stmt
    |   Default Colon stmt
    ;

compStmt
    :   LeftBrace stmt? RightBrace
    ;

exprStmt
    :   expr? eos
    ;

selStmt
    :   If expr stmt (Else stmt)?
    |   Switch expr stmt
    ;

iterStmt
    :   Loop stmt
    |   While expr stmt
    |   For Id In postfixExpr stmt
    ;

script
    :   stmt? EOF
    ;



// ================================================================================

Break : 'break';
Case : 'case';
Else : 'else';
For : 'for';
If : 'if';
In : 'in';
Loop: 'loop';
Return : 'return';
Switch : 'switch';

LeftParen : '(';
RightParen : ')';
LeftBracket : '[';
RightBracket : ']';
LeftBrace : '{';
RightBrace : '}';

Less : '<';
LessEqual : '<=';
Greater : '>';
GreaterEqual : '>=';

Plus : '+';
PlusPlus : '++';
Minus : '-';
MinusMinus : '--';
Star : '*';
Div : '/';
Mod : '%';

And : 'and';
Or : 'or';
Not : '!';

Question : '?';
Colon : ':';
Comma : ',';

Assign : '=';

Equal : '==';
NotEqual : '!=';

Dot : '.';

Id
    :   IdNondigit
        (   IdNondigit
        |   Digit
        )*
    ;

fragment
IdNondigit
    :   Nondigit
    ;

fragment
Nondigit
    :   [a-zA-Z_]
    ;

Number: Sign? DigitSequence+ (Dot DigitSequence*)?;

fragment
Sign
    :   [+-]
    ;

DigitSequence
    :   Digit+
    ;

fragment
Digit
    :   [0-9]
    ;

StringLiteral
    :   ('"' SCharSequence? '"')
    |   ('`' SCharSequence? '`')
    ;

fragment
SCharSequence
    :   SChar+
    ;

fragment
SChar
    :   ~["\\\r\n]
    |   '\\\n'   // Added line
    |   '\\\r\n' // Added line
    ;

Whitespace
    :   [ \t]+
        -> skip
    ;

Newline
    :   (   '\r' '\n'?
        |   '\n'
        ) -> skip
    ;

BlockComment
    :   '/*' .*? '*/'
        -> skip
    ;

LineComment
    :   '//' ~[\r\n]*
        -> skip
    ;