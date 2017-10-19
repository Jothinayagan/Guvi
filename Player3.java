import java.util.*;
class Player3
{
	public static void main (String[] args) 
	{
		Scanner sr = new Scanner(System.in);
		int n = sr.nextInt();
		String x = "";
		while(n!=0)
		{
		    int c = n%10;
		    x += String.valueOf(c);
		    n = n/10;
		}
		System.out.println(x);
	}
}
