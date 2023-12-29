import java.util.*;
 
public class queueadd {
    public static void main(String[] args)
        throws IllegalStateException
    {
        Queue<Integer> Q
            = new LinkedList<Integer>();
        Q.add(126754);
        Q.add(356754);
        Q.add(59876);
        Q.add(787675);
        System.out.println("Queue: " + Q);
        System.out.println("Queue's head: " + Q.add(126754));
    }
}