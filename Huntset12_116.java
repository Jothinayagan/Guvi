import java.util.*;
class Huntset12_116 {
	public static void main (String[] args) {
		Scanner sr = new Scanner(System.in);
		int m = sr.nextInt(); String str = String.valueOf(m);
		String[] st = str.split(""); int count = 0, co = 0;
		if(m>=1 && m<=999999){
		for(int i = 0; i<st.length; i++)
		{
		    int x = Integer.valueOf(st[i]);
		    co = (int)Math.pow(x,i); 
		    count += co;
		}}
		if(count > 0){ System.out.println(count); }
		else{ System.out.println("-1"); }
	}
}
