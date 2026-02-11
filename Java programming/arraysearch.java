/*
11-02-26
Q6. Search an Element from an array */

import java.util.Scanner;

public class arraysearch {
public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.print("Enter the size of the array:");
        size=sc.nextInt();
        
        int[] A = new int[size];

        System.out.println("Enter the array elements:");
        for(int i=0;i<size;i++)
        {
                A[i]=sc.nextInt();
        }
        int found=0;
        int search;
        System.out.print("Enter the element to search:");
        search=sc.nextInt();
        int pos=0;
        for(int i=0;i<size;i++)
        {
            pos++;
            if(A[i]==search)
            {
                found=1;
                break;
            }  
        }
        if(found==0)
        {
            System.out.println("Element not found");
        }
        else{
            System.out.println("element found at "+pos);
        }
    } 
} 


/*

OUTPUT

PS C:\AK\Java programming> javac arraysearch.java
PS C:\AK\Java programming> java arraysearch      
Enter the size of the array:5
Enter the array elements:
10 20 30 40 50
Enter the element to search:20
element found at 2
PS C:\AK\Java programming> java arraysearch
Enter the size of the array:5  
Enter the array elements:
10 20 30 40 50
Enter the element to search:60
Element not found
*/