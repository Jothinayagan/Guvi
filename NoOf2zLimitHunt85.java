import java.io.*;
import java.util.*;
class NoOf2zLimitHunt85
{
	public static void main (String[] args)
	{
		Scanner sr=new Scanner(System.in);
		int n=sr.nextInt();int count=0;
		for(int i=1;i<=n;i++)
	    {
	        if(i<10)
	        {
	            if(i==2){count++;}
	        }
	        else 
	        {
	            String[] f=String.valueOf(i).split("");
	            for(int j=0;j<f.length;j++)
	            {
	                int l=Integer.valueOf(f[j]);
	                if(l==2){count++;}}
	            }
	        }
	    System.out.println(count);
	}
}
