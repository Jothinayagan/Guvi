import java.util.*;
import java.util.Arrays;
class Height50Student
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int[] arr=new int[50];
		for(int i=0;i<50;i++)
		{
			arr[i]=in.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("4th tallest member height is "arr[46]);
		int k=in.nextInt();
		System.out.println(k+"th member height is "+arr[k-1]);
	}
}
