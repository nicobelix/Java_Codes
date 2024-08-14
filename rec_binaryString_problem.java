
import java.awt.SystemColor;

public class rec_binaryString_problem {
    public static void binary(int n,int c,int i)
    if(i==n)
    {
        {
         return;
        }
        if(c==0)
        {
            System.out.print(c);
            binary(n,1,i);
        }
        if(c==1)
        {
            System.out.print(c);
            binary(n,0,i+1);
        }
        }
    public static void main(String[] args) {
        int i=0;
        int c=0;
        binary(5,c,i);
    }
}
