public class constructor {


    int i;
    char j;

    constructor(){
        System.out.println("I AM CREATING A OBJECT");
    }

    constructor(int i){
        this.i = i;
    }
        public static void main(String[] args) {
            
            constructor t = new constructor();
            constructor u = new constructor();
            constructor v = new constructor();
            constructor x = new constructor();
            constructor a = new constructor(25);

            System.out.println(a.i);

        }
    }
    

