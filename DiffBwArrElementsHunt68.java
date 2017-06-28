import java.util.*;
import java.io.*;
class DiffBwArrElementsHunt68 {
    public static void main(String args[] ) throws Exception {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();int l=0,h=0,k=0;
        int[] a=new int[n];
        int[] b=new int[n-1];
        for(int j=0;j<n;j++)
        {
            a[j]=s.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            if(a[i]>a[i+1])
            {
                l=a[i]-a[i+1];
            }
            else
            {
                l=a[i+1]-a[i];
            }
            b[i]=l;
        }Arrays.sort(b);
        System.out.println(b[b.length-1]);
    }
}
