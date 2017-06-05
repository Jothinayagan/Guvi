import java.util.Scanner;
class PosNeg
{
	static public void main(String[] args)
  	{	
  		Scanner s=new Scanner(System.in);
  		int a=s.nextInt();
  		if(a!=0)
  		{
    		if(a>0)
    			System.out.print("postive");
    		else
    			System.out.print("negative");
  		}
  		else
    		System.out.print("zero");
  	}		
}
