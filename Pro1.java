import java.util.*;
class Pro1 {
	public static void main (String[] args) {
		Scanner sr = new Scanner(System.in);
		String[] st = sr.next().split("");
		String res = ""; String k = "";
		for(int i=0, j=1; i<st.length && j<st.length; i++,j++)
		{
		    if(i==0)
		    {
		        //System.out.println("LOL");
		        if(st[i].equals(st[j]))
		            res += st[i] + st[j];
		    }
		    else
		    {
		        //System.out.println("jot"+" "+st[i]+" "+st[j]);
		        if(st[i].equals(st[j]))
		        {
		            res += st[i];
		            k = st[i];
		        }   
		    }
		}
		res += k;
		System.out.println(res);
	}
}
