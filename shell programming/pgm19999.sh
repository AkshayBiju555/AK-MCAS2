#!/bin/bash
read -p "Enter a file name: " file1
echo "Enter the contents of $file1: "
cat > "$file1"
read -p "Enter a pattern to search in file: " s
grep -ni $s $file1

#comment
: '
PS C:\AK\shell programming> bash pgm19999.sh
Enter a file name: f4.txt
Enter the contents of f4.txt: 
Hello world
hi there
HELLO again
bye
Enter a pattern to search in file: hello
1:Hello world
3:HELLO again
'