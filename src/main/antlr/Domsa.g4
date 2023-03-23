grammar Domsa;

@header {
package com.github.mrglassdanny.domsa.lang.antlr;
}

// EXPRESSION ------------------------------------------------------------------------------------

idExpr
    :
    Id (Dot Id)*
    ;

fnExpr: Id LeftParen expr? RightParen;

arithExpr: Number | fnExpr | idExpr | LeftParen addExpr RightParen;
mulExpr: arithExpr ((Star | Div | Mod) arithExpr)*;
addExpr: mulExpr ((Plus | Minus) mulExpr)*;

relExpr: addExpr ((Less | Greater | LessEqual | GreaterEqual) addExpr)*;
eqValue: (relExpr | String | FormatString | True | False | Null);
eqExpr: eqValue ((Equal | NotEqual) eqValue)*;

logAndExpr: eqExpr (And eqExpr)*;
logOrExpr: logAndExpr (Or logAndExpr)*;

expr
    : logOrExpr
    | LeftParen expr RightParen;

// ASSIGNMENT ------------------------------------------------------------------------------------

assign: idExpr assignOper assignValue;

assignOper: Assign;

assignValue
    : expr
    | (jsonObj | jsonArr)
    ;

// JSON ------------------------------------------------------------------------------------

jsonObj
   : LeftBrace jsonPair (Comma jsonPair)* RightBrace
   | LeftBrace RightBrace
   ;

jsonPair
   : Id Colon jsonValue
   ;

jsonArr
   : LeftBracket jsonValue (Comma jsonValue)* RightBracket
   | LeftBracket RightBracket
   ;

jsonValue
   : expr
   | jsonObj
   | jsonArr
   ;

// FLOW ------------------------------------------------------------------------------------

eos: NewLine+ | EOF;

stmt
    :   lblStmt
    |   compStmt
    |   assignStmt
    |   selStmt
    |   iterStmt
    ;

assignStmt
    :   assign? eos;

lblStmt
    :   Id Colon stmt
    |   Case expr Colon stmt
    |   Default Colon stmt
    ;

compStmt
    :   LeftBrace stmt? RightBrace
    ;

selStmt
    :   If expr stmt (Else stmt)?
    |   Switch expr stmt
    ;

iterStmt
    :   Loop stmt
    |   While expr stmt
    |   For Id In Id stmt
    ;

script
    :   stmt? EOF
    ;



// ================================================================================

Break : 'break';
Case : 'case';
Default: 'default';
Else : 'else';
False: 'false';
For : 'for';
If : 'if';
In : 'in';
Loop: 'loop';
Null: 'null';
Return : 'return';
Switch : 'switch';
True: 'true';
While: 'while';

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

Number: Minus? DigitSequence+ (Dot DigitSequence*)?;

DigitSequence
    :   Digit+
    ;

fragment
Digit
    :   [0-9]
    ;

FormatString
   : '`' (SafeCodePoint)* '`'
   ;

String
   : '"' (StringEsc | SafeCodePoint)* '"'
   ;

fragment StringEsc
   : '\\' (["\\/bfnrt] | Unicode)
   ;
fragment Unicode
   : 'u' Hex Hex Hex Hex
   ;
fragment Hex
   : [0-9a-fA-F]
   ;
fragment SafeCodePoint
   : ~ ["\\\u0000-\u001F]
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