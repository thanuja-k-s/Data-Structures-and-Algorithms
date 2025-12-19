import java.util.*;
public class CyclicSort{
    public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int arr1[]=new int[n];

     for(int i=0;i<n;i++){
        arr1[i]=arr[i];
    }
     
    int l=sc.nextInt();
    int r=sc.nextInt();

    // int low=l;
   
    // int mid=0;

    // while(l<r){
    //     if(arr[low]>mid){
    //         int temp=arr[low];
    //         arr[low]=arr[mid];
    //         arr[mid]=temp;
    //         low++;
    //         mid++;
    //     }
    //     else {
    //         mid++;
    //     }

    // }
    int i=l;

   while(i<=r){
    int index=arr[i]-1;
    if(arr[i]!=arr[index]){
        int temp=arr[i];
        arr[i]=arr[index]; 
        arr[index]=temp;
    }
    else{
        i++;
    }

   }

   for( i=0;i<n;i++){
    if((i+1)!=arr[i]){
        System.out.print("False");
        return;

    }
   }
      System.out.print("True");
}
}