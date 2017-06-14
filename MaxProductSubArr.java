import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class MaxProductSubArr 
{
	 static public void main(String[] args) 
	 {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=s.nextInt();
		}
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int k=0;k<size;k++)
		{   
			int sum=1; 
			for(int j=k;j<size;j++)
			{
				sum=sum*arr[j];
			}
			al.add(sum);
		}
		Collections.sort(al);
	    System.out.print(al.get(al.size()-1));
	}
}
