import java.util.*;
class Huntset11_102 {
	public static void main (String[] args) {
		Scanner sr = new Scanner(System.in);
		int m = sr.nextInt(); String str = String.valueOf(m);
		String[] st = str.split(""); int count = 0, co = 0;
		if(m >= 9){
		for(int i = 0; i<st.length; i++)
		{
		    for(int j = i; j<i+1; j++)
		    {   int x = Integer.valueOf(st[j]);
		        co += x;
		    }
		    count += co;
		}}
		if(count > 0){ System.out.println(count); }
		else{ System.out.println("-1"); }
	}
}
