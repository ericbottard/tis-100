grammar Tis100;

node: line? ('\n' line)*;

line:     comment
        | label
        | label stmt
        | stmt
        ;

comment: '#' ~'\n'*?;

label: ID ':';

stmt:
      'MOV' src ',' dst
    | 'JMP' ID
    ;

src: REGISTER
    | INT
    | PORT
    ;

dst: REGISTER
    | PORT
   ;

REGISTER:
      'ACC'
    | 'NIL'
    ;

PORT:
      'UP'
    | 'LEFT'
    | 'DOWN'
    | 'RIGHT'
    ;

INT: '-'? DIGIT DIGIT? DIGIT?;

DIGIT: [0-9];

ID: [A-Z0-9\-_$]+;

WS: ' '+ -> skip;


