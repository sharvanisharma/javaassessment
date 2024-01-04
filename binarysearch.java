class binarysearch {
    int binarysearch(int arr[], int l, int r, int x)
    {
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] > x) {
                r = mid - 1;
            } else {
              l = mid + 1;
            }  
        }

        return -1;
    }
 
    public static void main(String args[])
    {
        binarysearch ob = new binarysearch();
 
        int arr[] = { 123, 33, 41, 1990, 403 };
        int n = arr.length;
        int x = 41;
        int result = ob.binarysearch(arr, 0, n - 1, x);
 
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index "+ result);
    }
}
