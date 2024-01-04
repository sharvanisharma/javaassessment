import java.util.Arrays;
 
class exponentialSearch
{
    // Returns position of 
    // first occurrence of
    // x in array
    static int exponentialSearch(int arr[],
                                 int n, int x)
    {
        if (arr[0] == x)
            return 0;
        int i = 1;
        while (i < n && arr[i] <= x)
            i = i*2;
        return Arrays.binarySearch(arr, i/2, 
                              Math.min(i, n-1), x);
                              }
    public static void main(String args[])
    {
        int arr[] = {2121, 31, 324, 1440, 4440};
        int x = 1440;
        int result = exponentialSearch(arr, 
                                  arr.length, x);
         
        System.out.println((result < 0) ? 
          "Element is not present in array" :
          "Element is present at index " + 
                             result);
    }
}
