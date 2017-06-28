import java.io.*;
import java.util.*;
class AlphabetsBegin108 
{
	public static void main (String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n>0&&n<27){
		System.out.println((char)(n+64));
		}
		else{
		    System.out.println("Not Valid : Number must between 1 to 26");
		}
	}
}
