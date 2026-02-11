/*
11-02-26
Q7.Sort an array (Bubble sort)
*/
import java.util.Scanner;

public class arraysort {
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
        int temp;
     
        System.out.println("Sorted Array");
        
        for(int i=0;i<size-1;i++)
        {
            for(int j=0;j<size-i-1;j++)
            {
                if(A[j]>A[j+1])
                {
                    temp=A[j];
                    A[j]=A[j+1];
                    A[j+1]=temp;
                }

            }
              
        }
        for(int i=0;i<size;i++)
        {
                System.out.print(  A[i ]+"  ");
        }
        
    } 
} 



/*

OUTPUT


PS C:\AK\Java programming> javac arraysort.java
PS C:\AK\Java programming> java arraysort      
Enter the size of the array:5
Enter the array elements:
4
1
3
2
5
Sorted Array
1  2  3  4  5
*/