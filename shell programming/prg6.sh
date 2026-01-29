#!/bin/bash

if [ $# -eq 1 ]
then
    if who | grep -qw "$1"
    then
        echo "$1 user is logged in"
    else
        echo "$1 user is NOT logged in"
    fi
else
    echo "please enter user name"
fi
