public class tryandcatch {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        int c = 0;
        try{
            c= a/b;
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
            System.out.println("You are trying to divdide by 0, it is undefined.");
        }
        System.out.println(c);
    }
    
}
