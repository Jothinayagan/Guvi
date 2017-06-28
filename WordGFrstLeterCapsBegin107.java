import java.io.*;
import java.util.*;
class WordGFrstLeterCapsBegin107
{
	public static void main (String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String[] a=s.nextLine().split(" ");
		for(int i=0;i<a.length;i++){
		    String a1[]=a[i].split("");
		    a1[0]=a1[0].toUpperCase();
		    for(String c1:a1)
		    System.out.print(c1);
		    System.out.print(" ");	}
}
}
