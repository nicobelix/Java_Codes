public class shreyash {
    public static void main(String args[]){
       int a[]={5,7,1,3,7};
       for(int i=0;i<=3;i++)
       {
        for(int j=0;j<=3-i;j++)
        {
        if(a[j]>a[j+1])
        {
        int temp=a[j+1];
        a[j+1]=a[j];
        a[j]=temp;
        }
       }
    }
    for(int i=0;i<=4;i++)
    {
        System.out.print(a[i]);
    }

    }
}
