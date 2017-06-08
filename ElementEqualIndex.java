import java.io.*;
import java.util.*;
class ElementEqualIndex 
{
	public static void main (String[] args) 
	{
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int k=0;
	    int a[]=new int[n];
	    for(int i=0;i<n;i++)
	    {   
	        a[i]=s.nextInt();
	    } 
	    Arrays.sort(a);
	    //System.out.println(a[24]);
	    for(int i=0;i<n;i++)
	    {
	        if(i==a[i])
	        {
	            k=+1;
	            System.out.println("Number "+a[i]+" is equal to its index "+i);
	        }
	    }     
	   if(k==0)
	   {
	        System.out.println("No elements matches its index");
	   }
	}
}
