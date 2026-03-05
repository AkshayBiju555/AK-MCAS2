#!/bin/bash
i="y"
read -p "Enter name of the database: " db
touch "$db"

while [ $i = "y" ]
do
    clear
    echo "1. View Database"
    echo "2. View Specific Record"
    echo "3. Add Record"
    echo "4. Delete Record"
    echo "5. Exit"

    read -p "Enter your choice: " ch

    case $ch in
    1) cat "$db";;

    2) read -p "Enter ID : " id
       grep -i "$id" "$db";;

    3) read -p "Enter new Student Id : " tid
       read -p "Enter new name : " nm
       read -p "Enter designation : " des
       read -p "Enter college name : " college
       echo "$tid $nm $des $college" >> "$db";;

    4) read -p "Enter ID : " id
       grep -vw "$id" "$db" > temp
       mv temp "$db"
       echo "Record deleted successfully";;

    5) exit;;

    *) echo "Invalid choice";;
    esac

    read -p "Do you want to continue? (y/n): " i
    if [ "$i" != "y" ]
    then
        exit
    fi
done