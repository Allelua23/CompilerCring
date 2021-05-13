grammar cring;

program
    : consts? functions? mainProg EOF
    ;

consts
    : CONST varDeclaration SCOL (CONST varDeclaration SCOL)*
    ;

functions
    : FUNC varname OPAR parametrList CPAR block (FUNC varname OPAR parametrList CPAR block)*
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
    : IF OPAR concList CPAR block (ELSE block)?
    ;

assign
    : varname ASSIGN expression SCOL
    ;

whileStatement
    : WHILE OPAR concList CPAR block
    ;

forStatement
    : FOR OPAR forInside CPAR block
    ;

forInside
    : forInit SCOL concList SCOL expression
    ;

forInit
    : (varDeclaration | expression) (',' (varDeclaration | expression))*
    ;

conc
    : expression #ExpConclusin
    | callMethod #CallMethodConlusin
    | expression op = (EQ | NE) expression #EqualsConclusion
    | expression op = (GT | GE) expression #MoreThenConclusion
    | expression op = (LT | LE) expression #LessThenConclusion
    ;

concList
    : conc (pob = (AND | OR) conc)*
    ;

parametrList
    : (varDeclaration (',' varDeclaration)*)?
    ;

expression
    : assign                                        #AssignExpression
    | callMethod                                    #CallMethodExpression
    | MINUS expression                              #unaryMinusExpression
    | NOT expression                                #notExpression
    | expression op = (MUL  | DIV | MOD) expression #MultipliesExpression
    | expression op = (PLUS | MINUS) expression     #SummExpression
    | varname                                       #VarNameExpression
    | literal                                       #LiteralExpression
    | OPAR expression CPAR                          #ParenExpression
    ;

expressionList
    : (expression (',' expression)*)?
    ;

literal
    : intLiteral
    | charLiteral
    | floatLiteral
    | boolLiteral
    | STRING
    ;

intLiteral
    : NUMBER
    ;

charLiteral
    : '\'' IDENTIFIER '\''
    ;

floatLiteral
    : NUMBER '.' NUMBER
    | '.' NUMBER
    ;

boolLiteral
    : TRUE
    | FALSE
    ;

STRING
    : '"' (~["\r\n] | '""')* '"'
    ;

type
    : 'int'
    | 'char'
    | 'float'
    | 'bool'
    ;

varname
    : IDENTIFIER (IDENTIFIER | NUMBER)*
    ;

OR   : '||';
AND  : '&&';
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
PRINT : 'print'   ;
FOR   : 'for'     ;
IF    : 'if'      ;
ELSE  : 'else'    ;
WHILE : 'while'   ;
CONST : 'const'   ;
FUNC  : 'function';
MAIN  : 'main()'  ;

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
WS             : [ \t\r\n\u000C]+ -> channel(HIDDEN); //или skip
COMMENTS       : '/*' .*? '*/'    -> channel(HIDDEN);
LINE_COMM      : '//' ~[\r\n]*    -> channel(HIDDEN);