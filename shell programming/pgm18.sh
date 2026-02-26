#!/bin/bash
read -p "Enter a string: " s
ns=""
for((i=${#s}-1;i>=0;i--))
do
 ns="$ns${s:i:1}"
done
echo "reversed strings is : "$ns