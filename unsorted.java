import java.util.Arrays;
 
class unsorted {

    public static int ythSmallest(Integer[] arr, int y)
    {

        Arrays.sort(arr);
 
        return arr[y - 1];
    }
 
    public static void main(String[] args)
    {
        Integer arr[] = new Integer[] { 12, 20, 50, 11, 199,46,90,176 };
        int y = 4;
 
        System.out.print("y'th smallest element is "
        + ythSmallest(arr, y));
}
}
