public class chechpoweroftwo {
    public static void main(String args[])
    {
        int n=15;
        if((n&(n-1)) ==0 )
        {
            System.out.println("number is a power of two");
        }
        else
        {
            System.out.println("number is not a power of two");
        }
    }
    
}
