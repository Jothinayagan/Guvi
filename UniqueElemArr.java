import java.util.*;
import java.io.*;
class UniqueElemArr
{
    static public void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k,l=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            k=0;
            for(int j=0;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    k=k+1;
                }
            }
            if(k==1){
            System.out.println(arr[i]);
                
            }
        }
    }
}
