import java.util.*;

class Hunt104 {
	public static void main (String[] args) {
		Scanner sr = new Scanner(System.in);
		String[] st1 = sr.nextLine().split("");
		String[] st2 = sr.nextLine().split("");
		int k = 0;
		if(st1.length > st2.length)
		    k = st1.length;
		else
		    k = st2.length;
		for(int i = 0; i<k; i++)
		{
		    String x = "";
		    if(i<st1.length)
		        x += st1[i];
		    if(i<st2.length)
		        x += st2[i];
		        
		    System.out.println(x);
		} 
	}
}
