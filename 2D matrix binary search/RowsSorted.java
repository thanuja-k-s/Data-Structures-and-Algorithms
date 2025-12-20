import java.util.*;
public class RowsSorted{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int [n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int target=sc.nextInt();

        for(int i=0;i<n;i++){
            if(arr[i][0]<=target && target<=arr[i][m-1]){
                int left=0;
                int right=m-1;
                while(left<=right){
                    int mid=left+right/2;
                    if(arr[i][mid]==target){
                        System.out.print("true");
                        return;
                    }
                    else if(arr[i][mid]>target){
                        right--;
                    }
                    else{
                        left++;
                    }
                }

            }
        }
        System.out.print("false");


    }
}

