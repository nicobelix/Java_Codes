public class rec_nth_fabonicci {
    public static int sum(int n)
    {
        if(n==0)
        {
         return 0;
        }
        if(n==1)
        {
         return 1;
        }
     return sum(n-1)+sum(n-2);
    }
    public static void main(String[] args) {
        int n=7;
       System.out.println(sum(n));
    }
}
