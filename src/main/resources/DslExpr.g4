grammar DslExpr;     //定义规则文件grammar
@header {        //一种action,定义生成的词法语法解析文件的头，当使用java的时候，生成的类需要包名，可以在这里统一定义
 package antlr4ExprVisit;
}

//parsers
sta:(expr ender)*;  //定义sta规则，里面包含了*（0个以上）个 sql ender组合规则
ender:';';  //定义ender规则，是一个分号

expr: expr op=('+'|'-') expr        # addSubTag
    | funtype (('('expr (','expr)*')')|('('')'))# callFunTag
    | ID                            # varTag
    | INT                           # intTag
    | STRING                        # stringTag
    | expr MDM expr                 # mdmTag
    ;     //规则结束符

//定义规则函数
funtype:(ADD|SUB|LTRIM|LENGTH|REPLACE|EQUALS|ISNULL|SUBSTRING) ;

//keywords  定义一些关键字的lexer，忽略大小写
ADD:'add';
SUB:'sub';
SUBSTRING:'substring';
LTRIM:'ltrim';
LENGTH:'length';
REPLACE:'replace';
EQUALS:'equals';
ISNULL: [Ii][Ss][Nn][Uu][Ll][Ll];


ID : [A-Za-z_][A-Za-z0-9_]*;

INT : [0-9]+ ;

//符号集
MDM:('*'|'/'|'%');

//base  定义一些基础的lexer,
fragment DIGIT:[0-9];   //匹配数字
fragment LETTER:[a-zA-Z];  //匹配字母
STRING        //匹配带引号的文本
    : '\'' ( ~('\''|'\\') | ('\\' .) )* '\''
    | '"' ( ~('"'|'\\') | ('\\' .) )* '"'
    ;
IDENTIFIER    //匹配只含有数字字母和下划线的文本
    : (LETTER | DIGIT | '_')+
    ;
NUMBER: DIGIT+('.'DIGIT+)? ; //数字类型，包括浮点和整型

BACKQUOTED_IDENTIFIER   //匹配被``包裹的文本
    : '`' ( ~'`' | '``' )* '`'
    ;

//--hiden  定义需要隐藏的文本，指向channel(HIDDEN)就会隐藏。这里的channel可以自定义，到时在后台获取不同的channel的数据进行不同的处理
SIMPLE_COMMENT: '--' ~[\r\n]* '\r'? '\n'? -> channel(HIDDEN);   //忽略行注释
BRACKETED_EMPTY_COMMENT: '/**/' -> channel(HIDDEN);  //忽略多行注释
BRACKETED_COMMENT : '/*' ~[+] .*? '*/' -> channel(HIDDEN) ;  //忽略多行注释
WS: [ \r\n\t]+ -> channel(HIDDEN);  //忽略空白符

// 匹配其他的不能使用上面的lexer进行分词的文本
UNRECOGNIZED: .;