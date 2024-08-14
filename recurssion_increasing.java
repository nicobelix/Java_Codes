public class recurssion_increasing {

    public static void printing(int n)
    {
        if(n==0)
        {
            return;
        }
      printing((n-1));
      System.out.print(n);
    }
    public static void main(String[] args) {
        int n=10;
        printing(n);
    }
    
}
