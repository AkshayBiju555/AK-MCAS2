#!/bin/bash
if [ $# -eq 1 ]
then
    if [ -f $1 ]
    then    
        echo "reverse of $1"
        cat $1
        echo "->"
        echo -e "\n->\n" 
        tac $1
    else
        echo "file does not exist"
    fi
else
    echo "enter filename or path"
fi