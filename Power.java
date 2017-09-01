import java.util.*;
class Power {
	public static void main (String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter two number with space separated : ");
		double n = sr.nextInt();
		double p = sr.nextInt();
		double r = Math.pow(n,p);
		System.out.println(r);
	}
}
