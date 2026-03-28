import java.util.*;
class nameexception extends RuntimeException
{
    nameexception(String s)
    {
        super(s);
    }
}
class passexception extends RuntimeException
{
    passexception(String s)
    {
        super(s);
    }
}
class user
{
    String name,password;
    user(String n,String pass)
    {
        name=n;
        password=pass;
    }
    void login(String n,String pass)
    {
        try
        {
            if(name.equals(n)&&password.equals(pass))
            {
                System.out.println("login successful");
            }
            else{
                throw new passexception("Invalid username or password");
            }
        }
        catch(passexception e)
        {
            System.out.println("\n"+e.getMessage());
        }

    }
}
public class validation
{
    public static void main(String args[])
    { 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the username");
        String s=sc.next();
        try
        {

            for(int i=0;i<s.length();i++)
            {
                char ch=s.charAt(i);
                if((ch>=65 && ch<=90) || (ch>=97 && ch<=122))
                {
                    continue;
                }
                else{
                    throw new nameexception("invalid name");
                }
                
            }

        }
        catch(nameexception e)
        {
            System.out.println("\n"+e.getMessage());
            System.exit(0);
        }
        System.out.println(("Enter password"));
        String pass=sc.next();
        try
        {
            int p=0;
            if(pass.length()<8)
            {
                throw new nameexception("Password must be atleast 8 characters long");
            }
            for(int i=0;i<pass.length();i++)
            {
                char ch=pass.charAt(i);
                if(ch>=48 && ch<=57)
                {
                    p=1;
                }

            }
            if(p==0)
            {
                throw new passexception("Password must contain atleast a digit");

            }
            
        }
        catch(nameexception e)
        {
            System.out.println("\n"+e.getMessage());
            System.exit(0);
        }
        catch(passexception e)
        {
            System.out.println("\n"+e.getMessage());
            System.exit(0);
        }
        user u1=new user(s,pass);
        System.out.println("Login");
        System.out.println("Enter username");
        String n1=sc.next();
        System.out.println("Enter password");
        String p1=sc.next();
        u1.login(n1,p1);

    }
    
}
