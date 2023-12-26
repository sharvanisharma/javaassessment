import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        int arr[] = new int[10];
        Scanner s = new Scanner(System.in);
        for(int i=0;i<10;i++)
        {
            System.out.println("please entes marks of students"+ (i+1));
            arr[i] = s.nextInt();
        }
        for(int i=0;i<10;i++)
        {
            System.out.println(arr[i]+ "  "1);
        }

    }
    
}
