import java.util.*;
public class ThreeSum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int t=sc.nextInt();
       int x=0;
       
        for(int i=0;i<n-2;i++){
             int l=0;
             int r=n-1;
            
        while(1<r && x==0){
            int sum=arr[l]+arr[r]+arr[i];
            
             if(sum==t ){
                System.out.print(arr[l]+" "+arr[r]+" "+arr[i]);
               x=1;
                break;
            }
            else if(sum>t){
                r--;
            }
            else{
                l++;
            }
            
        
         }
      }
      if(x==0){
        System.out.print("Not found");
      }
        
    }
}
