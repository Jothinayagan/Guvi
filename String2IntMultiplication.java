import java.util.*;
class String2IntMultiplication
{
    public static void main(String mur[])
    {
       Scanner s=new Scanner(System.in);
       String s1=s.nextLine();
       String s2=s.nextLine();
       int s11=Integer.valueOf(s1);
       int s22=Integer.valueOf(s2);
       int f=s11*s22;
       String str=String.valueOf(f);
       System.out.print(str);
    }
}
