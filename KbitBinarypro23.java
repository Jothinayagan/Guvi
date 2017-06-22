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
            	    while(bitcount[i].length()!=size)
            	    {
                	bitcount[i]="0"+bitcount[i];
            	    }
             	    if(i!=ps-1)
		    	System.out.print(bitcount[i]+",");
		    else
		    	System.out.println(bitcount[i]);
        	}
	}
}
