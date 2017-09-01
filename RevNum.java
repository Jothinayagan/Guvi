import java.util.*;
class RevNum {
	public static void main (String[] args) {
		Scanner sr = new Scanner(System.in);
		String sb = sr.next();
		StringBuffer s = new StringBuffer(sb);  
		s.reverse();
		System.out.println(s);
	}
}
