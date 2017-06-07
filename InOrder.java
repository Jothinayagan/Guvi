import java.io.*;
import java.util.*;
class InOrder{
	public static void main (String[] args) {
	 Scanner sr=new Scanner(System.in);
   int[] a=new int[10];
   int n2=sr.nextInt();
   for(int i=0;i<n2;i++){
   a[i]=sr.nextInt();
   }
	 int i,j,c=0,n=0;
	 for(i=0,j=i+1;(i<n2)&&(j<n2);i++,j++)
	 {
	     if(a[i]<=a[j])
	     {
	         c=c+1;
	         n=c;
	     }
	     else
	     {
	         c=0;
	     }
	 }
	 n=n+1;
	 System.out.println(n);
	}
}
