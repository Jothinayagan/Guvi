import java.util.Scanner;
class SeedPro
{
    public static void main(String mur[])
    {
       Scanner in=new Scanner(System.in);
       int X=in.nextInt();
       int Y=in.nextInt();
       int temp=X;
       while(X>0)
       {
           int t=X%10;
           X=X/10;
           temp=temp*t;
       }
       if(temp==Y)
       {
           System.out.print("seed");
       }
       else
       {
            System.out.println("Not seed");   
       }
    }
}
