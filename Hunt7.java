import java.util.*;
class Hunt7 {
	public static void main (String[] args) {
		Scanner sr = new Scanner(System.in);
		int n = sr.nextInt();
		List<Integer> a = new ArrayList<Integer>();
		for(int i = 0; i<n; i++)
		{
		    a.add(sr.nextInt());
		}
		//System.out.println(a);
		for(int j = 0; j<n; j++)
		{
		    int x = Collections.frequency(a,a.get(j));
		    if( x == 1){ System.out.print(a.get(j)+" "); }
		}
	}
}
