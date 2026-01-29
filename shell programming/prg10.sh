#!/bin/bash

read -p "Enter the directory name you want to search: " dir

# full path
direct="/mnt/c/AK/shell programming/$dir"

# check if directory exists
if [ -d "$direct" ]; then
    # count all files recursively
    num_files=$(find "$direct" -type f | wc -l)
    echo "There are $num_files files in $direct"
else
    echo "$direct is not a directory"
fi
