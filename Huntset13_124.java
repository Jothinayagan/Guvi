import java.io.*;
class Huntset13_124 {
	public static void main (String[] args) {
		//code
		Scanner sr = new Scanner (System.in);
		char[] a = sr.next.toCharArray(); int count = 0;
		for(char x:a)
		{
		    int c = Integer.valueOf(x);
		    if(c>=65 && c<=91) { count++; }
		}
		if(count > 1) { System.out.println("CamelCase"); }
		else { System.out.println("-1"); }
	}
}
