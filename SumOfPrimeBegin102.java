import java.io.*;
import java.util.*;
class SumOfPrimeBegin102 
{
	public static void main (String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();int count=0,k=0;
        for(int i=1;i<=num;i++) 
        {
            count = 0;
            for (int j=2;j<=i/2;j++) 
            {
                if(i%j==0) 
                {
                count++;
                break;
                }
            }
            if(count==0) 
            {
                k=k+i;
            }
        }
        System.out.println(k);
	}
}
