public class shortestpath {
    public static void main(String args[])
    {
      String s="wneenesennn";
      double x=0,y=0;
      char a;
      int i;
      for(i=0;i<s.length();i++)
      {
        a = s.charAt(i);
        if(a=='n')
        {
        y++;
        }
        if(a=='s'){
        y--;
        }
        if(a=='w'){
        x--;
        }
        if(a=='e'){
        x++;
        }
      }
      double x2=x*x;double y2=y*y;
      double sd = Math.sqrt(x2+y2);
      System.out.println(sd);
    }
}