import java.util.*;

public class priorityq {
    public static void main(String args[])
    {
        PriorityQueue<String> q=new PriorityQueue<String>();
        Scanner sc=new Scanner(System.in);
        String el;
        int ch;
        do
        {
            System.out.println("\n---------------------------\n1ADD\n2.REMOVE\n3.DISPLAY\n4.HEAD\n0.wrong choice\nEnter yout choice:");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("Enter element to insert:");
                    el=sc.next();
                    q.add(el);
                    break;
                case 2:
                    q.remove();
                    break;
                case 3:
                    System.out.println("priority queue:"+q);
                    break;
                case 4:
                    System.out.println("head of the queue:"+q.peek());
                    break;
                case 9:
                    break;

            }
        
        }while(ch!=0);
    
}
}
