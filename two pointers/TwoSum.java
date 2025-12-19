import java.util.*;
public class TwoSum{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int target = sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int left=0;
        int right = n-1;
        int x=0;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                System.out.print(arr[left]+" "+arr[right]);
                x=9;
                break;
            }
            else if(sum>target){
                right--;
            }
            else {
                left++;
            }
        }
        if(x==0){
            System.out.print("Element not found");
        }
    }
}