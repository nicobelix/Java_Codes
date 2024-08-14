public class rec_friendsPairing_problem {
    public static int pairing(int n)
    {
      if(n==1)
      {
        return 1;
      }
      if(n==2)
      {
        return 2;
      }
      return pairing(n-1)+pairing(n-2)*(n-1);
    }
    public static void main(String[] args) {
        int n=3;
        System.out.println(pairing(n));
    }
}
