import java.util.Scanner;
class isNumericStr 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		char[] c = str.toCharArray();
		boolean b1 = false;
		for (int i = 0; i < str.length(); i++) 
		{
			if (!(Character.isAlphabetic(c[i]))) 
			{
				b1 = true;
			}
		}
		System.out.println(b1);
	}
}
