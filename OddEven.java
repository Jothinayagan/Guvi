import java.io.*;
import java.util.*;
class OddEven 
{
	public static void main (String[] args) 
	{
	      Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        if(num%2==0)
        {
            System.out.println("EVEN");
        }
        else
        {
            System.out.println("FALSE");
        }
	}
}
