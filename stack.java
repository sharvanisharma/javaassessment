import java.util.Stack;
public class stack {
    public static void main(String[] args) {
        Stack<String>stack = new Stack<String>();
        stack.add("i love gaming");
        stack.add("travelling");
        stack.add("clothing");
        stack.add("never settle");
        System.out.println("Stack :" + stack);
        String rem_ele = stack.remove(0);
        System.out.println("Removed element: " +rem_ele);
        System.out.println("Final Stack :" + stack);
    }
    
}
