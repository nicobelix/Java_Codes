public class rec_TowerfHanoi {
    public static void hanoi(char p1,char p2,char p3,int n)
    {
        if(n==0)
        {
            return;
        }
        hanoi(p1, p2, p3, n);
        System.out.println("move "+p1+" TO "+p3);
    }
    public static void main(String[] args) {
        char p1 = 'A';
        char p2 = 'B';
        char p3 = 'C';
        hanoi(p1,p2,p3,3);
    }
}
