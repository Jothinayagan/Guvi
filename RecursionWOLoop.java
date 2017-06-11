import java.util.Scanner;
public class RecursionWOLoop 
{
    public static void main(String[] args) 
    {
		Scanner s = new Scanner(System.in);
		RecursionWOLoop j=new RecursionWOLoop();
		j.size(s.nextInt());
	}
	public static int size(int k) {
		System.out.println(k);
		if(k==0)
		{
			return 0;
		}
		k--;
		return size(k);
	}
}
