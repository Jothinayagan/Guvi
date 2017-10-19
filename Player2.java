import java.util.*;
class Player2
{
	public static void main (String[] args) 
	{
		Scanner sr = new Scanner(System.in);
		int n = sr.nextInt();
		long x = 1;
		for(int i=n; i!=0; i--)
		    x *= i;
		System.out.println(x);
	}
}
