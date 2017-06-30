import java.io.*;
import java.util.*;
class ReverseWrdStrHunt133
{
	public static void main (String[] args)
	{
	    Scanner s=new Scanner(System.in);
	    String[] a=s.nextLine().split(" ");
	    for(int i=a.length-1;i>=0;i--){System.out.print(a[i]+" ");}
	}
}
