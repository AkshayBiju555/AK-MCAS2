#!/bin/bash
read -p "enter a directory you want to search" dir
for filename in "/mnt/c/AK/shell programming/$dir"

do
    if [ -d "$filename" ]
    then
        echo "$filename is a directory"
    else
        echo "$filename is not a directory"
    fi
done