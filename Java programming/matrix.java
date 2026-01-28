/*
21-01-2026

Q2. Read 2 matrices from the console and perform matrix addition. 
*/
import java.util.Scanner;
public class matrix
{
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r,c;
        System.out.println("Enter number of rows:");
        r=sc.nextInt();
        System.out.println("Enter number of columns:");
        c=sc.nextInt();
        int[][] A = new int[r][c];
        int[][] B = new int[r][c];
        int[][] C = new int[r][c];

        System.out.println("Enter first matrix:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                A[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter second matrix:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                B[i][j]=sc.nextInt();
            }
        }

        System.out.println("the sum of two matrices:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                C[i][j]=A[i][j]+B[i][j];
            }
        }

        
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(C[i][j]+" ");
            }
        System.out.print(" \n");
        }

    }
}

/*
OUTPUT

PS C:\Users\cacet\OneDrive\Desktop\MCA S2> javac matrix.java
PS C:\Users\cacet\OneDrive\Desktop\MCA S2> java matrix      
Enter number of rows:
3
Enter number of columns:
3
Enter first matrix:
1 2 3
4 5 6
7 8 9
Enter second matrix:
9 8 7 
6 5 4
3 2 1
the sum of two matrices:
10 10 10
10 10 10
10 10 10

*/