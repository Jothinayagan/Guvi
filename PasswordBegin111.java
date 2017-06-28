import java.io.*;
import java.util.*;
class PasswordBegin111 
{
	public static void main (String[] args) 
	{
		Scanner s=new Scanner(System.in);
        String n=s.next();int k=0,j=0;
        char[] arr=n.toCharArray();
        for(int i=0;i<n.length();i++)
        {
            k=k+(int)arr[i];
            j=k/n.length();
        }
        System.out.println((char)j);
	}
}
