/*Q8. String manipulatiion */

import java.util.Scanner;
public class stringman 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str;
        System.out.println("Enter the string");
        str=sc.nextLine();
        System.out.println("string in uppercase: "+str.toUpperCase());
        System.out.println("string in lowercase: "+str.toLowerCase());
        System.out.println("String length:"+str.length());
        System.out.println("string character at pos 0 is: "+str.charAt(0));
        System.out.println("String starts with 'Hell'?"+str.startsWith("Hell"));
        System.out.println("Trimmed String :"+str.trim());
        System.out.println(str.substring(2, 5));
        String str1;
        System.out.println("Enter another string");
        str1=sc.nextLine();
        System.out.println("COncatenated String: "+str.concat(str1));
        System.out.println("Strings are equal? "+str.equals(str1));
        System.out.println("Strings are equal (ignore case)? "+str.equalsIgnoreCase(str1));
        System.out.println("String contains 'lo'? "+str.contains("lo"));
        System.out.println("Replace 'l' with 'x': "+str.replace('l','x'));
        System.out.println("Index of 'l': "+str.indexOf('l'));
    }
}


/*
OUTPUT

PS C:\AK\Java programming> javac stringman.java
PS C:\AK\Java programming> java stringman
Enter the string
Hello 
string in uppercase: HELLO
string in lowercase: hello
String length:5
string character at pos 0 is: H
String starts with 'Hell'?true
Trimmed String :Hello
llo
Enter another string
World
COncatenated String: HelloWorld
Strings are equal? false
Strings are equal (ignore case)? false
String contains 'lo'? true
Replace 'l' with 'x': Hexxo
Index of 'l': 2
*/