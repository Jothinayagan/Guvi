import java.util.Scanner;
import java.lang.Integer.*;
class BitCountArr {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int size=in.nextInt();
        int i,j;
        int arr[]=new int[size];
        int bitcount[]=new int[size];
        for(i=0;i<size;i++){
            arr[i]=in.nextInt();
            bitcount[i]=Integer.bitCount(arr[i]);
      }
        for(i=0;i<size;i++){
            for(j=i+1;j<size;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    temp=bitcount[i];
                    bitcount[i]=bitcount[j];
                    bitcount[j]=temp;
                }
            }
        }    
        for(i=0;i<size;i++){
            for(j=i+1;j<size;j++){
                if(bitcount[i]<bitcount[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    temp=bitcount[i];
                    bitcount[i]=bitcount[j];
                    bitcount[j]=temp;
                }
            }
        }    
        for(i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }                       
    }
}
