#!/bin/bash
read -p "Enter a file name: " file1
echo "Enter contents of $file1: "
cat > "$file1"
read -p "Enter line number: " l
echo "start printing from the line $l: "
tail +$l $file1

#comment
: 'bash pgm199.sh  
Enter a file name: draw1.txt 
Enter contents of draw1.txt: 
h
e
l
l
o
Enter line number: 2
start printing from the line 2: 
e
l
l
o'