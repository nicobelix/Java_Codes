public class sortedmatrixsearch {
    public static void main(String args[])
    {
        int a[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int n=a.length-1;int m=a[0].length-1;
        int i=0;int j=m;
        int b=37;
        while(i<=n&&j>=0)
        {
            if(a[i][j]==b)
            {
                System.out.print("element found at "+i+","+j);
                break;
            }
            else if(a[i][j]>b)
            {
                j--;
            }
            else if(a[i][j]<b)
            {
                i++;
            }
        }
    }
}
