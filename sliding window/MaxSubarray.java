import java.util.*;

public class MaxSubarray {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        double sum=0;
        double average=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
            average=sum/k;
        }
        double max=average;
        
        for(int i=1;i<n-k+1;i++){
            sum=sum+arr[i+k-1]-arr[i-1];
            average=sum/k;
            if(max<average){
                max=average;
            }
        }
        System.out.print(max);
    }
    
}
