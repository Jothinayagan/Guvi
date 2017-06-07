import java.util.*;
import java.io.*;
class SecondSmall
{
    static public void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        Arrays.sort(a);
        System.out.print(a[1]);
    }
}
