import java.util.*;
public class BrindhaOccurence{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int t=sc.nextInt();
        int l=0;
        int r=n-1;
        int f=0;
        while(l<=r){
            if(arr[l]==t&&arr[r]==t){
                f=1;
                break;
            }
            if(t>arr[l]){
                l++;
            }
            if(t<arr[r]){
                r++;
            }
        }
        if(f==0){
            System.out.println("-1 -1");
        }
        else
        System.out.println(l+" "+r);
    }
}