public class rec_check_sorted_array {
    public static boolean check(int a[], int n)
    {
        if(n==1)
        {
            return true;
        }
     if(a[n-1]>=a[n-2])
     {
        return check(a,n-1);
     }
        return false;
    }
    public static void main(String[] args) {
        int a[]={0,1,2,4,3};
        int n=5;
        System.out.print(check(a,n));
}
}
