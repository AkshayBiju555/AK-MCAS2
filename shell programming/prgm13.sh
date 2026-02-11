

read -p "Enter a string:" str
read -p "Enter starting index and number of characters in the strings:" a b
substr=${str:$a:$b}
echo "Substring is :" $substr