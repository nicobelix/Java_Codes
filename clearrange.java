public class clearrange {
    public static void main(String args[])
    {
        int i=2,j=4;int  n=15;
        int bitwise = (~0)<<j|~((~0)<<i-1);
        System.out.println(n & bitwise);
    }
    
}
