import java.io.*;
import java.util.*;
class EncodeDecodeHunt83
{
	public static void main (String[] args)
	{
	    Scanner s=new Scanner(System.in);
	    String[] str=s.nextLine().split("");
	    int x=0;
	    for(int i=0;i<str.length;i++)
	    {if(str[i].equals("x")){x=i;break;}}
	    int a=Integer.valueOf(str[x-1]);String b="",c=str[x+1];
	    while(a!=0){b=b.concat(c);a--;}
	    for(int d=0;d<x;d++){System.out.print(str[d]);}
	    System.out.print(b);
	    for(int e=x+1;e<str.length;e++){System.out.print(str[e]);}
	}
}
