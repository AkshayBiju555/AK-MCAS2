/*Q3. Add two complex numbers */

import java.util.Scanner;
public class complex 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,d,real,imaginary;
        System.out.println("Enter real part of first complex number");
        a=sc.nextInt();
        System.out.println("Enter imaginary part of first complex number");
        b=sc.nextInt();
        System.out.println("Enter real part of second complex number");
        c=sc.nextInt();
        System.out.println("Enter imaginary part of second complex number");
        d=sc.nextInt();
        real=a+c;
        imaginary=b+d;
        if(imaginary>=0)
        {
            System.out.println("Sum of two complex number is: "+real+ "+i"+imaginary);
            
        }
        else{
            System.out.println("Sum of two complex number is: "+real+ "-i"+(-imaginary));
        }

        
    }
    
}


/*
OUTPUT

Positive

PS C:\Users\cacet\OneDrive\Desktop\MCA S2> javac complex.java
PS C:\Users\cacet\OneDrive\Desktop\MCA S2> java complex      
Enter real part of first complex number
2
Enter imaginary part of first complex number
3
Enter real part of second complex number
2
Enter imaginary part of second complex number
3
Sum of two complex number is: 4+i6

negative

PS C:\Users\cacet\OneDrive\Desktop\MCA S2> javac complex.java
PS C:\Users\cacet\OneDrive\Desktop\MCA S2> java complex      
Enter real part of first complex number
1
Enter imaginary part of first complex number
1
Enter real part of second complex number
5
Enter imaginary part of second complex number
-6
Sum of two complex number is: 6-i5
*/