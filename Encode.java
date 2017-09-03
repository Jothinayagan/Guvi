import java.util.*;
class Encode {
	public static void main (String[] args) {
		Scanner sr = new Scanner(System.in);
		char[] sb = sr.next().toCharArray();
		String s = "";
		for(int i = 0; i<sb.length-1; i++)
		{
		    int x = (int)sb[i]; 
		    if(x == 65) { s = s + 'Z'; }
		    else if(x == 97) { s = s + 'z'; }
		    else { s = s + (char)(x-1); }
		}
		s = s + sb[sb.length-1];
		System.out.println(s);
	}
}
