import java.util.*;
import java.io.*;
class FirstRepeat
{
    static public void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        GOTO:
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println(arr[i]);
                    break GOTO;
                }
            }
        }
    }
}
