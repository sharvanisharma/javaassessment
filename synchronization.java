class BookTableAtResturant{
    int total_tables = 6;
void Booktable(int table)
{
    if(total_tables>=table)
    {
        System.out.println("tables booked successfully");
        total_tables=total_tables - table;
        System.out.println("tables left : " +total_tables);

    }
    else{
        System.out.println("sorry tables cannot be booked...");
        System.out.println("tables left : "+ total_tables);
    }
}
}
public class synchronization extends Thread {
    static BookTableAtResturant B;
    int table;
    public void run()
    {
        B.Booktable(table);

    }
    public static void main(String[] args) {
        B=new BookTableAtResturant();
        synchronization veena = new synchronization();
        veena.table=2;
        veena.start();
        synchronization vani = new synchronization();
        vani.table=4;
        vani.start();
        synchronization baby = new synchronization();
        baby.table=2;
        baby.start();


        
    }
}

    

