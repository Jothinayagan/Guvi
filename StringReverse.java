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
        System.out.print(strbld);  
    }
}
