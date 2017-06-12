import java.util.Scanner;
import java.util.Arrays;
public class Max1sBinary
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String c = Integer.toBinaryString(n);
        String[] a=c.split("0");
        Arrays.sort(a);
        int n1=a.length;
        System.out.print(a[n1-1]);
	}
}
