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

// JSON ------------------------------------------------------------------------------------

jsonValue
   : expr
   | jsonObj
   | jsonArr
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

assignOper: Assign;

assignValue
    : expr
    | (jsonObj | jsonArr)
    ;

assign: idExpr assignOper assignValue;

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