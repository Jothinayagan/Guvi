import java.io.*;
import java.util.*;
class RemoveArrElementHunt65 {
	public static void main (String[] args) {
		Scanner sr=new Scanner(System.in);
		int n=sr.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=sr.nextInt();
		}
		int c=sr.nextInt();
		for(int i=0;i<a.length;i++)
		{
		    if(c!=a[i])
		    {
		        System.out.print(a[i]+" ");
		    }
		}
	}
}
