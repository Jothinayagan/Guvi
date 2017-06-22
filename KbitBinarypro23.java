import java.io.*;
import java.util.*;
class KbitBinarypro23 {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int ps=(int)Math.pow(2,size);
		String[] bitcount=new String[ps];
		for(int i=0;i<ps;i++)
		{
		    bitcount[i]=Integer.toBinaryString(i);
		    System.out.println(bitcount[i]);
		}
	}
}
