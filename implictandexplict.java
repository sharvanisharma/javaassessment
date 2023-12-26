public class implictandexplict {

	    public static void main(String[] args){
	        int a = 20;
	        long b = a;
	        float c = b;
	        double d = c;
	        System.out.println("before conversion,int value" +a);
	        System.out.println("before conversion,float value" +b);
	        System.out.println("before conversion,long value" +c);
	        System.out.println("before conversion,doubled value" +d);
	        double db = 15;
	        int i = (int)db;
	        float f = (int)db;
	        long l = (int)db;
	        System.out.println("after conversion,int value" +i);
	        System.out.println("after converstion, float value" +f);
	        System.out.println("after conversion,long value" +l);
	       
	    }
	}
