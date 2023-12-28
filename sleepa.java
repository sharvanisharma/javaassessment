class sleepa extends Thread{
    public void run()
    {
        try
        {
        for(int i=1;i<=3;i++)
        {
            System.out.println(i+"Thread" + Thread.currentThread().getId());
            Thread.sleep(1000);
        }
    }
    catch(InterruptedException i)
    {
        System.out.println(i);
    }
}
    class B
    {
        public static void main(String[] args)
        {
            sleepa t1= new sleepa();
            sleepa t2= new sleepa();
            sleepa t3= new sleepa();

            t1.setName("thread 1");
            t2.setName("thread 2");
            t3.setName("thread 3");

            t1.start();
            t2.start();
            t3.start();
        }
    }
}

