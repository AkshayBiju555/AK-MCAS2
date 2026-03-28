import java.util.*;
class negative extends RuntimeException
{
    negative(String s)
    {
        super(s);
    }
}
public class negavg 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit");
        int n=sc.nextInt();
        int[] a=new int[n];
        double sum=0;
        System.out.println("Enter the numbers");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            try{
                if(a[i]<0)
                {
                    throw new negative("negative number is not allowed");
                }
                else{
                    sum+=a[i];
                }
            }
            catch(negative e)
            {
                System.out.println("\n"+e.getMessage());
                System.exit(0);
            }
        }
        System.out.println("Average"+String.format("%.2f",sum/n));

    }
    
}
