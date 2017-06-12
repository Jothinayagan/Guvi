import java.util.Scanner;
class DoubleString
{
    public static void main(String mur[])
    {
       Scanner s=new Scanner(System.in);
       String str=s.nextLine();
       int l=str.length();
       String sb1=str.substring(0,l/2);
       String sb2=str.substring(l/2,l);
        if(sb1.equals(sb2))
        {
            System.out.println("Double String");
        }
        else
        {
             System.out.println("Not double String");
        }
    }
}
