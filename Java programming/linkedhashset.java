import java.util.*;

public class linkedhashset {
    public static void main(String args[])
    {
        Set <String> set=new LinkedHashSet<String>();
        Scanner sc=new Scanner(System.in);
        String el;
        int ch;
        do
        {
            System.out.println("\n-----------------------\n1.ADD\n2.REMOVE\n3.DISPLAY\n4.SEARCH\n0.EXIT\n------------------\nEnter your choice:");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("enter element to insert:");
                    el=sc.next();
                    set.add(el);
                    break;
                case 2:
                    System.out.println("Enter element to remove: ");
                    el=sc.next();
                    set.remove(el);
                    break;
                case 3:
                    System.out.println("Linked hashset:"+set);
                    break;
                case 4:
                    System.out.println("Enter element to search:");
                    el=sc.next();
                    boolean contains=set.contains(el);
                    System.out.println("Set contains "+el+":"+contains);
                    break;
                case 0:
                    System.out.println("Exiting");
                    break;

            }

        }while(ch!=0);
    }
    
}
