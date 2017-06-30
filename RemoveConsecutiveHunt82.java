import java.io.*;
import java.util.*;
class RemoveConsecutiveHunt82
{
	public static void main (String[] args)
	{
	    Scanner s=new Scanner(System.in);
	    String[] a=s.nextLine().split("");
	    for(int i=0,j=1;i<a.length-1&&j<a.length;i++,j++)
	    {
	        if(a[i].equals(a[j])){a[j]="0";}
	    }
	    Arrays.sort(a);
	    System.out.print(a[a.length-1]);
	}
}
