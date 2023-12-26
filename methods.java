public class methods {
    public static void main(String[] args) {
        methods m = new methods();
        m.sayHello();
        m.addNumbers(3,4);
        m.addNumbers(15,79);
       int k = m.multiplynumbers(4,6);
       System.out.println(k);
    }

    void sayHello()
    {
        System.out.println("Hello");
    }

    void addNumbers(int a, int b){
        System.out.println(a+b);
    }

    int multiplynumbers(int a, int b)
    {
        int x = a*b;
        return x;
    }


    }

