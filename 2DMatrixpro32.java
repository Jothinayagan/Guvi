import java.io.*;
import java.util.*;
class 2DMatrixpro32 
{
	public static void main (String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a[][]=new int[2][3];
		ArrayList al=new ArrayList();
		int k=0;
		for(int i=0;i<2;i++)
		{
		    for(int j=0;j<3;j++)
		    {
		        a[i][j]=s.nextInt();
		        al.add(a[i][j]);
		    }
		}Collections.sort(al);
        for(int i=0;i<2;i++)
		{
		    for(int j=0;j<3;j++)
		    {
		        System.out.print(al.get(k));
		        k++;
		    }
		    System.out.println();
		}	    
	}
}
