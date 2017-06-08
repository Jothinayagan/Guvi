import java.io.*;
import java.util.*;
class StringReverse
{
    static public void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        StringBuilder strbld = new StringBuilder();
        strbld.append(str);
        strbld=strbld.reverse(); 
        for(int i=0;i<strbld.length();i++)
        System.out.print(strbld.charAt(i));  
    }
    
}
