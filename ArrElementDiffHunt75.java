import java.io.*;
import java.util.*;
class ArrElementDiffHunt75 
{
	public static void main (String[] args)
	{
		Scanner sr=new Scanner(System.in);
		int n=sr.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=sr.nextInt();
		}
		for(int j=0;j<n;j++)
		{
		    if(j<n-1)
		    {if(a[j]>a[j+1]){System.out.print(a[j+1]+" ");}
		    else{System.out.print("-1"+" ");}}
		    
		    else{if(a[j]>a[0]){System.out.print(a[j]+" ");}
		    else{System.out.print("-1"+" ");}}
		}
	}
}
