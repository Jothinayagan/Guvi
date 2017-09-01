import java.util.*;
class Fact {
	public static void main (String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int f = sr.nextInt(); int s = 1;
		for(int i = f; i!=0; i--)
		{ s = s * i; }
		System.out.println(s);
	}
}
