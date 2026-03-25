import java.io.*;
import java.util.Scanner;

public class evenoddfiledemo 
{
    public static void main(String args[])
    {
        try
        {
        FileReader fr=new FileReader("numbers.txt");
        Scanner sc=new Scanner(fr);
        FileWriter fw1=new FileWriter("evenfile1.txt");
        FileWriter fw2=new FileWriter("oddfile1.txt");
        while(sc.hasNextInt())
        {
            int num=sc.nextInt();
            if(num%2==0)
            {
                fw1.write(num+"\n");
            }
            else{
                fw2.write(num+"\n");
            }
        }
        sc.close();
        fr.close();
        fw1.close();
        fw2.close();
    }
    catch (IOException e) 
    {
        System.out.println("Error occurred: " + e.getMessage());
    }
       

    }
    
}
