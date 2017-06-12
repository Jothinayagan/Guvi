import java.util.Scanner;
public class Pattern12321 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
		int i,j,k,l=0;
	    for(i=1;i<=n;i++)
	    {
	        for(j=1;j<=i;j++)
	        {
	            System.out.print(j);
	            l=j;
	        }
	        for(k=l-1;k>=1;k--)
	        {
	            System.out.print(k);
	        }
	        System.out.print(" ");
	    }
	}
}
