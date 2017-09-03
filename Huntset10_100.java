import java.util.*;
class Huntset10_100 {
	public static void main (String[] args) {
		Scanner sr = new Scanner(System.in);
		int m = sr.nextInt(); String str = String.valueOf(m);
		String[] st = str.split(""); int count = 0;
		for(int i = 0; i<st.length; i++)
		{
		    if(m>0 && m<999999){
		    if(i < st.length-1)
		    {   int x = Integer.valueOf(st[i]), xx = Integer.valueOf(st[i+1]);
		        count += Math.pow(x,xx);
		    }
		    else
		    {   int xxx = Integer.valueOf(st[i]);
		        count += Math.pow(xxx,0);
		    }}
		    else { break; }
		}
		if(count > 0){ System.out.println(count); }
		else{ System.out.println("-1"); }
	}
}
