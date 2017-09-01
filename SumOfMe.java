import java.util.*;
class SumOfMe {
	public static void main (String[] args) {
		Scanner sr = new Scanner(System.in);
		int s = 0;
		for(int i = 1, ii = 15; ((i<=15) && (ii<=45)); i++,ii--)
		{ s = s + i; if(ii%2 != 0){ s = s + ii; } }
		System.out.println(s);
	}
}
