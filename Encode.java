import java.util.*;
class Encode {
	public static void main (String[] args) {
		Scanner sr = new Scanner(System.in);
		char[] sb = sr.next().toCharArray();
		String s = ""; int count = 0;
		for(int i = 0; i<sb.length-1; i++)
		{
		    int x = (int)sb[i];
		    if((x>64 && x<92) && (x>96 && x<124))
		    {   count++;
		        if(x == 65) { s = s + 'Z'; }
		        else if(x == 97) { s = s + 'z'; }
		        else { s = s + (char)(x-1); }
		    }
		    else { break; }
		}
		if(count == sb.length)
		   { s = s + sb[sb.length-1];
		    System.out.println(s);}
		else
		    {System.out.println("-1");}
	}
}
