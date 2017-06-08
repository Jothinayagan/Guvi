import java.util.*;
import java.io.*;
class FirstRepeat
{
    static public void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        String str=Integer.toString(num);
        char[] a=str.toCharArray();
        Arrays.sort(a);
        int arrSize=a.length;
        int del=s.nextInt();
        if(del<arrSize)
        {
            int z=arrSize-del;
            for(int i=0;i<z;i++)
            {
                System.out.print(a[i]);
            }
        }
        else
        {
            System.out.println("Can't delete."+"\n"+"Check the Delete size");    
        }
    }
}
