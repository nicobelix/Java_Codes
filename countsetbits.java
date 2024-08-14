public class countsetbits {
    public static void main(String args[])
    {
        int n=5,ex=3;
        int ans=1;
        while(ex>0)
        {
            if((ex & 1)!=0)
            {
                ans=ans*n;
            }
            else
            {
                ans=ans*1;
            }
            ex=ex>>1;
            n=n*n;
        }
        System.out.println(ans);   //125 binary = 1111101 , 5 binary = 101 , 2 binary 010 ;
        int m=2;int count=0;int mod;
        int a=ans;
        int k=m;
        while(m>0)
        {
            count++;
            m=m>>1;
        }
        int b=~(~0<<count); 
        mod = (a & b)^k;
        System.out.println(a&b);
        System.out.println(count);
        System.out.println("modulus = "+mod);
    }
}
