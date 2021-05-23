grammar cring;

program
    : function? mainProg EOF
    ;

function
    : type FUNC varname OPAR parametrList CPAR block (FUNC varname OPAR parametrList CPAR block)*
    ;

mainProg
    : MAIN block
    ;

block
    : OBRACE (statement)* CBRACE
    ;

statement
    : varDeclaration SCOL
    | callMethod SCOL
    | expression SCOL
    | print SCOL
    | ifStatement
    | assign
    | whileStatement
    | forStatement
    | breakStat SCOL
    | contStat SCOL
    | retStat SCOL
    ;

varDeclaration
    : type varname (ASSIGN expression)?
    ;

callMethod
    : varname OPAR expressionList CPAR
    ;

print
    : PRINT OPAR expressionList CPAR
    ;

ifStatement
    : IF OPAR parametrs CPAR block (ELSE block)?
    ;

assign
    : varname ASSIGN expression SCOL
    ;

whileStatement
    : WHILE OPAR parametrs CPAR block
    ;

forStatement
    : FOR OPAR forInside CPAR block
    ;

forInside
    : forInit SCOL parametrs SCOL expression
    ;

forInit
    : (varDeclaration | expression) (',' (varDeclaration | expression))*
    ;

breakStat
    : BREAK
    ;

contStat
    : CONT
    ;

retStat
    : RET expression?
    ;

parametr
    : expression                           #ExpConclusin
    | callMethod                           #CallMethodConlusin
    | expression op = (EQ | NE) expression #EqualityConclusion
    | expression op = (GT | GE) expression #MoreThenConclusion
    | expression op = (LT | LE) expression #LessThenConclusion
    ;

parametrs
    : parametr (pob = (AND | OR) parametr)*
    ;

parametrList
    : (varDeclaration (',' varDeclaration)*)?
    ;

expression
    : assign                                        #AssignExpr
    | callMethod                                    #CallMethodExpr
    | MINUS expression                              #UnaryMinusExpr
    | NOT expression                                #NotExpr
    | expression op = (MUL  | DIV | MOD) expression #MultiplicationExpr
    | expression op = (PLUS | MINUS) expression     #AdditiveExpr
    | varname                                       #VarnameExpr
    | literal                                       #LiteralExpr
    | OPAR expression CPAR                          #ParenExpr
    ;

expressionList
    : (expression (',' expression)*)?
    ;

literal
    : intLiteral
    | charLiteral
    | floatLiteral
    | boolLiteral
    ;

intLiteral
    : NUMBER
    ;

charLiteral
    : '\'' IDENTIFIER '\''
    ;

floatLiteral
    : NUMBER '.' NUMBER
    ;

boolLiteral
    : TRUE
    | FALSE
    ;

STRING
    : '"' (~["\r\n] | '""')* '"'
    ;

type
    : INT
    | CHAR
    | FLOAT
    | BOOL
    | 'string'
    ;

varname
    : IDENTIFIER (IDENTIFIER | NUMBER)*
    | STRING
    ;

OR   : '||' | 'or';
AND  : '&&' | 'and';
EQ   : '==';
NE   : '!=';
GT   : '>' ;
LT   : '<' ;
GE   : '>=';
LE   : '<=';
PLUS : '+' ;
MINUS: '-' ;
MUL  : '*' ;
DIV  : '/' ;
MOD  : '%' ;
POW  : '^' ;
NOT  : '!' ;

SCOL   : ';';
ASSIGN : '=';
OPAR   : '(';
CPAR   : ')';
OBRACE : '{';
CBRACE : '}';

TRUE  : 'true'    ;
FALSE : 'false'   ;


FOR   : 'for'     ;
IF    : 'if'      ;
ELSE  : 'else'    ;
WHILE : 'while'   ;

PRINT : 'print'   ;
FUNC  : 'function';
MAIN  : 'main()'  ;

BREAK : 'break'   ;
CONT  : 'continue';
RET   : 'return'  ;

INT    : 'int'  ;
CHAR   : 'char' ;
FLOAT  : 'float';
BOOL   : 'bool' ;

IDENTIFIER
    : [a-zA-Z] [a-zA-Z_0-9]*
    ;

NUMBER
    : [0-9]+ ([0-9])*
    ;

Newline
    : ( '\r' '\n'?
      | '\n'
      ) -> skip
    ;
// Пробелы и комменты
WS             : [ \t\r\n\u000C]+ -> skip;
COMMENTS       : '/*' .*? '*/'    -> skip;
LINE_COMM      : '//' ~[\r\n]*    -> skip;