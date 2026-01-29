#!/bin/bash
read -p "Enter a number" b
if [ $(( $b % 2 )) -eq 0 ]
then
    echo "even number"
else
    echo "odd number"
fi