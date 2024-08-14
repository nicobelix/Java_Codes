public class rec_tiling_problem {
    public static int tiling(int n)
    {
      if(n==0)
      {
        return 1;
      }
      if(n==1)
      {
        return 1;
      }
      if(n==2)
      {
        return 2;
      }
      return tiling(n-1)+tiling(n-2);
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(tiling(n));
    }
}
