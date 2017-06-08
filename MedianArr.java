import java.util.*;
import java.io.*;
class MedianArr
{
    static public void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        float k=0;
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
            k=k+arr[i];
        }
        System.out.println(k);
        float med=(float)(k/n);
        System.out.println(med);
    }
}
