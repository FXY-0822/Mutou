DSEG SEGMENT
DATA DW 1
DSEG ENDS
SSEG SEGMENT STACK
          DB 100 DUP(0)
SSEG ENDS
CSEG SEGMENT
          ASSUME DS:DSEG,SS:SSEG,CS:CSEG;
START:MOV AX,DSEG
           MOV DS,AX
           MOV AX,DATA
           MOV CL,16
    C1:   ROL AX,1
            MOV DX,AX
            AND DX,1
            ADD DX,30H
            PUSH AX
            MOV AH,2
            INT 21H
            POP AX
    LOOP C1
            MOV AH,4CH
            INT 21H
            CSEG ENDS
            END START  