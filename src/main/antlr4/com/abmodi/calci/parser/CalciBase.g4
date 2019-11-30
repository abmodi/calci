grammar CalciBase;


WS: [ \t\n]+ -> skip ;
NUMBER: ('0' .. '9') + ('.' ('0' .. '9') +)?;
ADD: '+';
SUB: '-';
MUL: '*';
DIV: '/';


expr: NUMBER operation NUMBER;
operation: (ADD | SUB | MUL | DIV);