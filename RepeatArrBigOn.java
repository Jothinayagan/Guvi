import java.util.HashSet;
import java.util.Set;
public class RepeatArrBigOn
{
    public static void main(String[] args) 
    {
        int[] arr={5,5,7,8,7,4,1,2,4};
        Set<Integer> j=new HashSet<Integer>();
        for(int i=0;i<arr.length;i++) 
        { 
            if(j.add(arr[i]) == false) 
            {
                System.out.println("Repeated element : " + arr[i]);
            }
        }
    }
}
