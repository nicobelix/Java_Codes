public class rec_find_first_occurence {
    public static int check(int a[],int n, int c)
    {
     if(a[n]==c)
     {
        return n;
     }
     else if(n>a.length)
     {
        System.out.println("element not found");
     }
     return check(a,n+1,c);
    }
    public static void main(String[] args) {
        int a[]={0,1,2,4,3};
        int c=5;
        int n=0;
        System.out.print(check(a,n,c));
}
}
