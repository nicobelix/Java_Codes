public class recurssion_decreasing {
    public static void printing(int n)
    {
        if(n==0)
        {
         return;
        }
     System.out.println(n);
     printing(n-1);
    }
    public static void main(String[] args) {
        int n=10;
        printing(n);
       
    }
    
}
