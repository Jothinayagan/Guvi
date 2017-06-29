import java.io.*;
import java.util.*;
class JumpingNumberHunt80
{
	public static void main (String[] args)
	{
		Scanner sr=new Scanner(System.in);
		String n=sr.next();int k=0;
		char[] a=n.toCharArray();
		for(int i=0;i<n.length()-1;i++)
		{
		    int j=(int)a[i+1]-(int)a[i];if(j==-1){j=j*-1;}
		    k=k+j;
		}
		if(k==n.length()-1){System.out.println("YES");}
		else{System.out.println("NO");}
	}
}
