class Example2 implements Runnable{

    public void run(){
        try{
            for(int i=1;i<+5;i++)
            {
                System.out.println(i+"Thread" + Thread.currentThread().getId());
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}



public class multithreadingex2{
    public static void main(String[] args){
        Example1 ex1 = new Example1();
        Example1 ex2 = new Example1();
        ex1.start();
        ex2.start();
    }

}
