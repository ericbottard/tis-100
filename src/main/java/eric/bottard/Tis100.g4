grammar Tis100;

node: line*;

line:
    label? stmt? COMMENT? NEWLINE;

label: ID ':';

stmt:
      'NOP'                #NOP
    | 'MOV' src ',' dst    #MOV
    | 'SWP'                #SWP
    | 'SAV'                #SAV
    | 'ADD' src            #ADD
    | 'SUB' src            #SUB
    | 'NEG'                #NEG
    | 'JMP' ID             #JMP
    | 'JEZ' ID             #JEZ
    | 'JNZ' ID             #JNZ
    | 'JGZ' ID             #JGZ
    | 'JLZ' ID             #JLZ
    | 'JRO' src            #JRO
    ;



src: REGISTER              #sourceRegister
    | INT                  #sourceInt
    | PORT                 #sourcePort
    ;

dst: REGISTER              #destinationRegister
    | PORT                 #destinationPort
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
    | 'ANY'
    | 'LAST'
    ;

COMMENT: '#' (~'\n')*;

INT: '-'? DIGIT DIGIT? DIGIT?;

DIGIT: [0-9];

ID: [A-Z0-9\-_$]+;

WS: ' '+ -> skip;

NEWLINE: '\n';
