import java.util.*;
import java.io.*;
class DupRemoveStr
{
    static public void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        StringBuffer str=new StringBuffer();
        str.append(in.nextLine());
        for(int i=0;i<str.length()-1;i++)
        {
            for(int j=i+1;j<str.length();j++)
            {
                if (str.charAt(i)==str.charAt(j))
                str.deleteCharAt(j);
            }   
        }
        System.out.println(str);
    }
}
