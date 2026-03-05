/*
04-03-2026

Q9.Sort Strings */


import java.util.Arrays;
import java.util.Scanner;

public class sortstring { 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many strings? ");
        int n = sc.nextInt();
        sc.nextLine();  

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            arr[i] = sc.nextLine();
        }

   
        Arrays.sort(arr);

        System.out.println("Sorted strings:");
        for (String s : arr) {
            System.out.println(s);
        }

        
    }
  
}


/*

PS C:\AK\Java programming> javac sortstring.java
PS C:\AK\Java programming> java sortstring      
How many strings? 3
Enter string 1: zebra
Enter string 2: lion
Enter string 3: deer
Sorted strings:
deer
lion
zebra
*/
