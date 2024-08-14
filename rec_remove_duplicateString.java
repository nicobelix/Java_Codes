public class rec_remove_duplicateString {
    public static void remove(boolean a[],String str,StringBuilder newstr , int i )
    {
    if(i==str.length())
    {
        System.out.println(newstr);
        return;
    }
    char c = str.charAt(i);
    if(a[c-'a']==true)
    {
        remove(a, str, newstr, i+1);
    }
    else{
    a[c-'a']=true;
    remove(a, str, newstr.append(c), i+1);
    }
}
    public static void main(String[] args) {
        String str="appnnacollege";
        remove(new boolean[26],str,new StringBuilder(""),0);
    }
}
