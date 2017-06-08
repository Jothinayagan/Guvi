import java.util.*;
import java.io.*;
class Subseta1a2
{
    static public void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int n2=s.nextInt();
        int[] arr=new int[n1];
        int[] brr=new int[n2];
        int k=0;
        for(int i=0;i<n1;i++)
        {
            arr[i]=s.nextInt();
        }
        for(int i=0;i<n2;i++)
        {
            brr[i]=s.nextInt();
        }
        for(int i=0;i<n1;i++)
        {
            for(int j=0;j<n2;j++)
            {
                if(arr[i]==brr[j])
                {
                    k=k+1;    
                }
            }
        }
        if(k>=n1)
        {
            System.out.println("a1 is subset of a2");
        }
        else
        {
            System.out.println("a1 is not subset of a2");
        }
    }
}
