import java.util.*;
public class arraylist
{
    public static void main(String args[])
    {
        ArrayList <String> list=new ArrayList<String>();
        Scanner sc=new Scanner(System.in);
        String el;
        int ch;
        do
        {
            System.out.println("\n-------------------------\n1.Add\n2.Size\n3.Search by Index\n4.Find index\n5.Contains\n6.Remove\n7.Remove by index\n8.display\nclear search\n0.exit\n-------\nEnter your choice:");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("Enter element to insert : ");
                    el=sc.next();
                    list.add(el);
                    break;
                case 2:
                    System.out.println("Size of  the arraylist\n"+list.size());
                    break;
                case 3:
                    System.out.println("Enter index of element to search : ");
                    int index=sc.nextInt();
                    System.out.println("Element at index "+index+" is "+list.get(index));
                    break;
                case 4:
                    System.out.println("Enter an element to find index : ");
                    el=sc.next();
                    index=list.indexOf(el);
                    System.out.println("Index of "+el+" is "+index);
                    break;
                case 5:
                    System.out.println("Enter an element : ");
                    el=sc.next();
                    boolean contains=list.contains(el);
                    System.out.println(el+" is in the list : "+contains);
                    break;
                case 6:
                    System.out.println("Enter element to be removed : ");
                    el=sc.next();
                    boolean removed=list.remove(el);
                    System.out.println("After removing  "+el+" arraylist : : "+list );
                    break;
                case 7:
                    System.out.println("Enter the index to remove the element : ");
                    index=sc.nextInt();
                    list.remove(index);
                    System.out.println("after removing the element,arraylist : "+list);
                    break;
                case 8:
                    System.out.println("Arraylist : "+list);
                    break;
                case 9:
                    list.clear();
                    break;
                case 0:
                    break;
            }

        }while(ch!=0);
    }
}