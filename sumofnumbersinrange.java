public class sumofnumbersinrange {
    static int sumofNatural(int n)
{
    int sum = (n * (n + 1)) / 2;
    return sum;
}

static int sumofnumbersinRange(int l, int r)
{
    return sumofNatural(r) - sumofNatural(l - 1);
}
public static void main(String[] args)
{
    int l = 29, r = 76;
    System.out.println("Sum of Natural numbers from L to R is "+sumofnumbersinRange(l, r));
 
}
}


    

