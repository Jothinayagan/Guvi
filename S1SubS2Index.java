import java.util.Scanner;
class S1SubS2Index
{
    public static void main(String mur[])
    {
       Scanner s=new Scanner(System.in);
       String str=s.nextLine();
       String substr=s.nextLine();
       int index=str.indexOf(substr);
        System.out.println(index);
    }
}
