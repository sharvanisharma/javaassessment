import java.util.*;
 
public class queueremove {
    public static void main(String[] args)
        throws IllegalStateException
    {
        Queue<Integer> Q
            = new LinkedList<Integer>();
        Q.add(126000);
        Q.add(917768);
        Q.add(991254);
        Q.add(767096);
        System.out.println("Queue: " + Q);
        System.out.println("Queue's head: " + Q.remove());
        System.out.println("Queue's head: " + Q.remove());
    }
}
 
