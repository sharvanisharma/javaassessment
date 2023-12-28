public class wait {
    public static void main(String[] args) {
        System.out.println("One");
        synchronized (args){
            System.out.println("Two");
            try{
                args.wait(50000);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Three");
        }
    }
    
}
