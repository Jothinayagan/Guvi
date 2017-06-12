import java.util.Scanner;
class Leapyear20
{
    public static void main(String args[]) 
    {
       Scanner s=new Scanner(System.in);
       int year=s.nextInt();
       int roundoff=year%4;
       year=year+(4-roundoff);
       for(int i=0;i<20;i++)
       {
           System.out.println(year);
           year=year+4;   
       }
    }
}
