import java.util.Scanner;
class SimpleInterest
{
    public static void main(String args[]) 
    {
        float principle,rate,time;
        Scanner s = new Scanner(System.in);
        principle=s.nextFloat();
        rate=s.nextFloat();
        time=s.nextFloat();
        float si;
        System.out.print("The Simple Interest is :"+si(principle,rate,time));
    }
    public static float si(float a,float b,float c)
    {
        float si=(float)((a*b*c)/100);
        return si;
    }
}
