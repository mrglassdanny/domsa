grammar DomsaScript;

@header {
package com.github.mrglassdanny.domsa.lang.antlrgen;
}

// EXPRESSION ------------------------------------------------------------------------------------

idExpr
    :
    Id (Dot Id)*
    ;

fnExpr: Id LeftParen expr? RightParen;

baseExpr
    : idExpr
    | fnExpr
    | Number
    | String
    | FormatString
    | True
    | False
    | Null
    | LeftParen expr RightParen
    ;

mulExpr: baseExpr ((Star | Div | Mod) baseExpr)*;

addExpr: mulExpr ((Plus | Minus) mulExpr)*;

relExpr: addExpr ((Equal | NotEqual | Less | Greater | LessEqual | GreaterEqual) addExpr)*;

logAndExpr: relExpr (And relExpr)*;

logOrExpr: logAndExpr (Or logAndExpr)*;

expr: logOrExpr;

// JSON ------------------------------------------------------------------------------------

jsonValue
   : expr
   | jsonArr
   | jsonObj
   ;

jsonPair
   : Id Colon jsonValue
   ;

jsonArr
   : LeftBracket eos? jsonValue (Comma eos? jsonValue)* eos? RightBracket
   | LeftBracket RightBracket
   ;

jsonObj
   : LeftBrace eos? jsonPair (Comma eos? jsonPair)* eos? RightBrace
   | LeftBrace eos? RightBrace
   ;

// ASSIGNMENT ------------------------------------------------------------------------------------

assignId
    :
    Id (Dot Id)*
    ;

assignValue
    : expr
    | jsonArr
    | jsonObj
    ;

assign: assignId Assign assignValue;

// FLOW ------------------------------------------------------------------------------------

eos: Newline+;

stmt
    : eos?
    (   nestStmt
    |   assignStmt
    |   condStmt
    |   iterStmt
    |   retStmt
    |   eos)
      eos?
    ;

assignStmt
    :   assign;

nestStmt
    :   LeftBrace stmt? RightBrace
    ;

condStmt
    :   If expr nestStmt (Else If expr nestStmt)? (Else nestStmt)?
    ;

iterStmt
    :   Loop nestStmt
    |   While expr nestStmt
    |   For Id In Id nestStmt
    ;

retStmt
    : Return expr;

script
    :   stmt* EOF
    ;



// TOKENS ------------------------------------------------------------------------------------

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
        )
    ;

BlockComment
    :   '/*' .*? '*/'
        -> skip
    ;

LineComment
    :   '//' ~[\r\n]*
        -> skip
    ;