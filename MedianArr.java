import java.util.*;
import java.io.*;
class MedianArr
{
    static public void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        float k=0;int j=0;
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
         int l=n/2;
       System.out.println(l);
        if(n%2!=0)
        {
        System.out.println(arr[l]);
        }
        else
        {
            System.out.println((arr[l-1]+arr[l])/2);
        }
    }
}
