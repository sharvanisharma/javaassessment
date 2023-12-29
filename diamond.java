interface Sample1 {
    default void sum(int x,int y) {
          System.out.println("Sum 1 is = "+ (x+y));
    }
}

interface Sample2 {
    default void sum(int x,int y) {
          System.out.println("Sum 2 is = "+ (x+y));
    }
}

class Dummy implements Sample1, Sample2{
    @Override
    public void sum(int x,int y) {
          System.out.println("Sum is = "+ (x+y));
    }
    public static void main(String args[]){
          Dummy obj = new Dummy();
          obj.sum(1909,8765);
    }
}