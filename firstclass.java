public class firstclass {
public static void main(String args[])
    {
        Pen p1 = new Pen();
        p1.setcolour("red");
        p1.settip(5)  ;
        System.out.println(p1.colour);
        System.out.println(p1.tip);
    }
}
    class Pen 
    {
        String colour;
        int tip;
        void setcolour(String newString)
        {
            colour = newString;
        }
        void settip(int newtip)
        {
           tip = newtip;
        }
    }

