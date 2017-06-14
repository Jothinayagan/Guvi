import java.util.Scanner;
import java.util.ArrayList;
public class Keypad 
{
	static public void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		ArrayList<String> al=new ArrayList<String>();
		int num=in.nextInt();
		al.add("no alphabet");
		al.add("no alphabet");
		al.add("ABC");
		al.add("DEF");
		al.add("GHI");
		al.add("JKL");
		al.add("MNO");
		al.add("PQRS");
		al.add("TUV");
		al.add("WXYZ");
		while(num>0)
		{
		    int temp=num%10;
		    num=num/10;
		    System.out.print(al.get(temp)+" ");
		}
	}
}
