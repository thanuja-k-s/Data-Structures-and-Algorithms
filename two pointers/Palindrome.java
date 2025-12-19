import java.util.*;
public class Palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int i=0;
        int j=n-1;
        int x=0;
        while(i<j){
            if(arr[i]==arr[j]){
                i++;
                j--;
            }
            else{
                System.out.print("Not a Palindrome");
                x=9;
                break;
            }

        }
        if(x==0){
            System.out.print("Palindrome");
        }
    }
}
