import java.util.*;
import java.io.*;
class 
{
    static public void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        int flag=0;
        int[] arr=new int[size];
        int target=s.nextInt();
        for(int i=0;i<size;i++){
            arr[i]=s.nextInt();}
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    System.out.println(arr[i]);
                    System.out.println(arr[j]);
                    flag+=1;
                }
            }
        }
        if(flag==0)
        {
            System.out.println("Please enter the valid target");
        }
    }
}
