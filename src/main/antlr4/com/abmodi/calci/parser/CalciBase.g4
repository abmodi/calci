grammar CalciBase;


WS: [ \t\n]+ -> skip ;
NUMBER: ('0' .. '9') + ('.' ('0' .. '9') +)?;
ADD: '+';
SUB: '-';
MUL: '*';
DIV: '/';

start: expr;


expr  : left=expr op=('*'|'/') right=expr #opExpr
      | left=expr op=('+'|'-') right=expr #opExpr
      | '(' expr ')'                      #parenExpr
      | atom=NUMBER                       #atomExpr
      ;
operation: (ADD | SUB | MUL | DIV);