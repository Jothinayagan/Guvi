import java.util.Scanner;
class Leapyear20
{
    public static void main(String args[]) 
    {
       Scanner s=new Scanner(System.in);
       int year=2016;
       if(year%4==0)
       {
           for(int i=0;i<20;i++)
           {
               year=year+4;
               System.out.println(year);
           }
       }
       else
       {
           System.out.println(year +" is not a leap year");
       }
    }
}
