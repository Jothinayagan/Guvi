import java.util.*;
class Odd {
	public static void main (String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter two intervels : ");
		int f = sr.nextInt(); int s = sr.nextInt();
		int count = 0;
		for(int i = f; i<=s; i++)
		{ if(i%2 != 0){ count+=i; } }
		System.out.println(count);
	}
}
