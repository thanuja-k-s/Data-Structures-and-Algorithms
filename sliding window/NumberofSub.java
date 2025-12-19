import java.util.*;

public class NumberofSub {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int t=sc.nextInt();
        int sum=0;
        int average=0;
        int count=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
            average=sum/k;
            if(average>=t){
                count++;
            }
        }
       
        
        for(int i=1;i<n-k+1;i++){
            sum=sum+arr[i+k-1]-arr[i-1];
            average=sum/k;
            if(average>=t){
                count++;
            }
        }
       
        System.out.print(count);
    }
    
}
