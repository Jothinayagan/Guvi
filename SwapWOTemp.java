import java.io.*;
import java.util.*;
class SwapWOTemp 
{
	public static void main (String[] args) 
	{
	    Scanner s=new Scanner(System.in);
	    int a=s.nextInt();
	    int b=s.nextInt();
	    a=a+b;
	    b=a-b;
	    a=a-b;
	    System.out.println(a);
	    System.out.println(b);
	}
}
