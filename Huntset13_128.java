import java.util.*;

class Huntset13_128 {
	public static void main (String[] args) {
		//code
		Scanner sr = new Scanner (System.in);
		int n = sr.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++){ a[i] = sr.nextInt(); }
		Arrays.sort(a); 
		for(int i = 0,j = a.length-1; i<=a.length/2 && j>=a.length/2; i++,j--)
		{
		    System.out.print(a[j]+" "+a[i]+" ");
		}
	}
}
