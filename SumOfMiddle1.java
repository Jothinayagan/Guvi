import java.io.*;
import java.util.*;
class SumOfMiddle1{
	public static void main (String[] args) {
	Scanner s=new Scanner(System.in);
    int n1=s.nextInt();
    int[] a1=new int[n1];
    int[] a2=new int[n1];
    int n2=n1+n1;
    int[] a3=new int[n2];
    
    for(int i=0;i<n1;i++)
    {
        a1[i]=s.nextInt();
    }
    
    for(int i=0;i<n1;i++)
    {
        a2[i]=s.nextInt();
    }
    
    for(int i=0;i<n2;i++)
    {
        if(i<n1)
        {
            a3[i]=a1[i];
            System.out.print(a3[i]+" ");
        }
        
        else if(i>=n1&&i<n2)
        {
            a3[i]=a2[i-n1];
            System.out.print(a3[i]+" ");
        }
        else
        {
            System.out.println("Not Exist");
        }
    }
    int t=n2/2;
    int z=a3[t-1]+a3[t];
    System.out.println(z);
}
}
