import java.util.*;
public class Occurence {
    public  static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int i=0;
        int j=n-1;
        int x=0;
        int count=0;
        while(i<j){
            int sum=arr[i]+arr[j];
            if(arr[i]==target && arr[j]==target){
             System.out.println(i+" "+j);
             while(i<=j){
                count++;
                i++;
             }
             System.out.print(count);
             x=9;
             break;
            }
            else if(arr[i]==target){
                j--;
            }
            else if(arr[j]==target){
                i++;
            }
            else if(sum>target){
                j--;
            }
            else{
                i++;
            }
        }
        if(x==0){
            System.out.print("-1 -1");
        }
    }
}
