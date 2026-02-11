#/bin/bash
read -p "enter a number: "n
no=$n
while [ $n -gt 0 ]
do
  ld=$(($n % 10))
  p=$(($p * 10 + ld))
  n=$(($n / 10))
done
if [ $p -eq $no ]
then echo "Palindrome"
else echo "No palindrome"
fi