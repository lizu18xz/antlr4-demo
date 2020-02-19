grammar Mul;
@header {        //一种action,定义生成的词法语法解析文件的头，当使用java的时候，生成的类需要包名，可以在这里统一定义
 package antlr4mul;
}
prog : stat+;

stat : expr             # printExpr
     | ID '=' expr      # assign
     | 'print(' ID ')'  # print
     ;

expr : <assoc=right> expr '^' expr # power
     | expr op=(MUL|DIV) expr   # MulDiv
     | expr op=(ADD|SUB) expr   # AddSub
     | sign=(ADD|SUB)?NUMBER       # number
     | ID                       # id
     | '(' expr ')'             # parens
     ;


ID   : [a-zA-Z]+;
NUMBER  : [0-9]+('.'([0-9]+)?)?
        | [0-9]+;
COMMENT : '/*' .*? '*/' -> skip;
LINE_COMMENT : '//' .*? '\r'? '\n' -> skip;
WS   : [ \t\r\n]+ -> skip;
MUL  : '*';
DIV  : '/';
ADD  : '+';
SUB  : '-';