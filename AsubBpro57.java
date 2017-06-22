import java.io.*;
import java.util.*;
class AsubBpro57 
{
	public static void main (String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int count=0;
		String str=s.next();
		String str1=s.next();
		StringBuffer sb1=new StringBuffer(str);
		StringBuffer sb2=new StringBuffer(str1);
		for(int i=0;i<sb1.length();i++)
		{
		    for(int j=0;j<sb2.length();j++)
		    {
		        if(sb1.charAt(i)==sb2.charAt(j))
		        {
		            count++;
		        }
		    }
		}
		if(count>=2)
		    System.out.println("TRUE");
		else    
		    System.out.println("FALSE");
	}
}
