#!/bin/bash
read -p "Enter the first file: " file1
read -p "Enter the second file: " file2
read -p "Enter the third file: " file3
echo "Enter the contents of $file1"
cat > "$file1"
echo "Enter the contents of $file2"
cat > "$file2"
diff -a $file1 $file2 > $file3
cat "$file3"

#comment
: 'PS C:\AK\shell programming> bash pgm1999.sh
Enter the first file: f1.txt
Enter the second file: f2.txt
Enter the third file: f3.txt
Enter the contents of f1.txt
hi im tony
its wonderful
Enter the contents of f2.txt
bye i aint tony
: 
its cool
1,2c1,2
< hi im tony
< its wonderful
---
> bye i aint tony
> its cool
'