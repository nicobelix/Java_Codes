public class selectionsort {
    public static void main(String args[])
    {
        int a[]={5,1,7,3,2};
        int p=0;
        for(int i=1;i<=4;i++)
        {
          int c=a[i];
          for(p=i-1;p>=0 && a[p]>c;p--)
          {
              a[p+1]=a[p];
          }
           a[p+1]=c;
        }
        for(int i=0;i<=4;i++)
        {
            System.out.print(a[i]);
        }
    }
    
}
