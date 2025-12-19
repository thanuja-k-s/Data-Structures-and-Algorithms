import java.util.*;
public class DutchNationalFlag{
    public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }

    int low=0;
    int high=n-1;
    int mid=0;

    while(mid<=high){
        if(arr[mid]<0){
            int temp=arr[low];
            arr[low]=arr[mid];
            arr[mid]=temp;
            low++;
            mid++;
        }
    else if(arr[high]<arr[mid] ){
        int temp=arr[high];
        arr[high]=arr[mid];
        arr[mid]=temp;
        high--;
    }
    else{
        mid++;
    }

    }


    for(int i=0;i<n;i++){
        System.out.println(arr[i]);
    }
}


}