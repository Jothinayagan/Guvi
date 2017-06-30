import java.io.*;
import java.util.*;
class StrOnceReverseHunt88
{
	public static void main (String[] args)
	{
	    Scanner s=new Scanner(System.in);
	    HashSet<String> l = new HashSet<>();
	    String[] str=s.nextLine().split("");
	    for(int i=(str.length-1);i>=0;i--)
	    {
	        if(l.add(str[i]))
	        System.out.print(str[i]);
	    }
	}
}
