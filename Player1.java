import java.util.*;
class Player1
{
	public static void main (String[] args) 
	{
		Scanner sr = new Scanner(System.in);
		String[] st = sr.next().split("");
		Collections.reverse(Arrays.asList(st));
		for(String x:st)
		    System.out.print(x);
	}
}
