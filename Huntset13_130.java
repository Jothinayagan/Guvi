import java.util.*;

class Huntset13_130 {
	public static void main (String[] args) {
		//code
		Scanner sr = new Scanner (System.in);
		String a = sr.next().toLowerCase(); 
		String[] c = {"sunday","saturday"};
		if(a.equals(c[0]) || a.equals(c[1])) { System.out.println("false"); }
		else { System.out.println("true"); }
	}
}
