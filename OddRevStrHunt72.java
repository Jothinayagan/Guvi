import java.io.*;
import java.util.*;
class OddRevStrHunt72 
{
	public static void main (String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String[] str=s.nextLine().split(" ");
		for(int i=0;i<str.length;i++)
		{
		    if(i==0||i%2==0)
		    {
		        StringBuffer sb=new StringBuffer(str[i]);
		        System.out.print(sb.reverse()+" ");
		    }
		    else
		    {
		        System.out.print(str[i]+" ");
		    }
		}
	}
}
