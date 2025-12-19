import java.util.*;
public class Sum{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        int k=sc.nextInt();
        for(int i=0;i<k;i++){
            sum+=arr[i];
            
        }
        System.out.println(sum);
       
        for(int i=1;i<n-k+1;i++){
            sum=sum-arr[i-1]+arr[i+k-1];
            System.out.println(sum);
        }
         
    }
}