public class countsort {
    public static void main(String args[])
    {
        int a[]={3,7,1,6,0,3,7,9};
        int b[]={0,0,0,0,0,0,0,0,0,0};
        for(int i=0;i<=7;i++)
        {
            for(int j=0;j<=9;j++)
            {
             if(a[i]==j)
             {
                b[j]++;
             }
            }
        }
        int c=0;
        for(int j=0;j<=9;j++)
        {
        for(int i=1;i<=b[j];i++)
        {
           a[c]=j;
           c++; 
        }
        }
        for(int i=0;i<=7;i++)
        {
            System.out.print(a[i]);
        }
    }
}
