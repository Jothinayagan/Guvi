import java.util.*;
import java.io.*;
class ReverseStringWords
{
    static public void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String[] str=s.nextLine().split(" ");
        String str1="";
        for(int i=str.length-1;i>=0;i--)
        {
            str1+=str[i]+" ";
        }
        System.out.print(str1);
    }
}
