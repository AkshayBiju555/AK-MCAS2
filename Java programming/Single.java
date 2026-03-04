/*Q.11 Single inheritance */
class work
{
    void work()
    {
        System.out.println("Work hard");

    }
}

class fruit extends work
{
    void fruity()
    {
        System.out.println("To reap the contents of your hardwork");
    }
}
public class Single{
public static void main(String args[])
{
    fruit f=new fruit();
    f.fruity();
    f.work();
}
}

/*
OUTPUT:
PS C:\AK\Java programming> javac Single.java
PS C:\AK\Java programming> java Single
To reap the contents of your hardwork
Work hard
 */