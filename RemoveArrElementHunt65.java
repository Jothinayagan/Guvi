import java.io.*;
import java.util.*;
class RemoveArrElementHunt65 {
	public static void main (String[] args) {
		Scanner sr=new Scanner(System.in);
		int[] a={10,10,12,13,14};int c=sr.nextInt();
		for(int i=0;i<a.length;i++)
		{
		    if(c!=a[i])
		    {
		        System.out.print(a[i]+" ");
		    }
		}
	}
}
