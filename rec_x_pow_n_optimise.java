public class rec_x_pow_n_optimise {
    public static int power(int x , int n)
    {
     if(n==1)
     {
      return x;
     }
    if(n%2==0)
    {
        return power(x,n/2)*power(x,n/2);
    }
        return x *power(x,n/2)* power(x,n/2);
    }
public static void main(String args[])
{
    int x=2;
    int n=10;
    System.out.println(power(x,n));
}
}
