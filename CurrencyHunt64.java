import java.util.*;
import java.io.*;
class CurrencyHunt64 {
    public static void main(String args[] ) throws Exception {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();int count=0;
        while(n!=0)
        {
            if(n>500)
            {
                n=n-500;count++;
            }
            else if(n>100)
            {
                n=n-100;count++;
            }
            else if(n>50)
            {
                n=n-50;count++;
            }
            else if(n>10)
            {
                n=n-10;count++;
            }
            else
            {
                n=n-1;count++;
            }
        }
        System.out.print(count);
    }
}
