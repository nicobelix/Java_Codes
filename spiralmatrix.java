public class spiralmatrix {
    public static void main(String args[])
    {
        int a[][]={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        int n=a.length-1;int m=a[0].length-1;int c=0,b=0;
        for(;c<=n&&b<=m;)
        {
        for(int i=c;i<=n;i++)
        {
            for(int j=b;j<=m;j++)
            {
              if(i==c||j==m)
              {
                System.out.print(a[i][j]+" ");
              }
            }
        }
        for(int i=n;i>c;i--)
        {
            for(int j=m-1;j>=b;j--)
            {
                if(i==n||j==b)
                {
                    System.out.print(a[i][j]+" ");
                }
            }
        }
                m--;
                n--;
                c++;
                b++;
    }
    }
}
