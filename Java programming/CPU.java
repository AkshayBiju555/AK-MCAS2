/* Q5 .Create a class named CPU with an attribute price.
Inside the CPU class, create:
A non-static inner class named Processor with attributes number of cores and manufacturer.
A static nested class named RAM with attributes memory size and manufacturer.
Create an object of the CPU class and use it to create objects of the Processor and RAM classes.
Finally, display the details of the Processor and RAM. */


public class CPU
{
    int price;
    class Processor
    {
        int cores;
        String manufacturer;
        Processor(int a, String b)
        {
            cores=a;
            manufacturer=b;
        }
        void display()
        {
            System.out.println("Processor info");
            System.out.println("Number of cores="+cores);
            System.out.println("Name of manufacturer="+manufacturer);
        }
    }
    static class ram
    {
        int memory;
        String man;
        ram(int c,String d)
        {
            memory=c;
            man=d;
        }
        void display()
        {
            System.out.println("RAM info");
            System.out.println("Memory size="+memory+"GB");
            System.out.println("Name of manufacturer="+man);
        }
        
    }
    public static void main(String args[])
    {
       CPU.ram obj1=new CPU.ram(16,"Intel");
       CPU obj2=new CPU();
       CPU.Processor obj3=obj2.new Processor(10,"Apple");
       obj1.display();
       obj3.display();
       
    }
}

/*

OUTPUT

PS C:\AK\Java programming> javac CPU.java
PS C:\AK\Java programming> java CPU
RAM info
Memory size=16GB
Name of manufacturer=Intel
Processor info
Number of cores=10
Name of manufacturer=Apple
*/