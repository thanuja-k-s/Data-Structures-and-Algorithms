import java.util.*;
public class BinarySearch{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int search = sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int left=0;
        int right=n-1;
        int mid=0;
        int x=0;
        while(left<=right){
            mid=(left+right)/2;
            if(arr[mid]==search){
                x++;
                System.out.print("Element is found "+mid);
                break;
               
            }
            else if(arr[mid]<search){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        if(x==0){
            System.out.print("Element is not found");
        }
    }
}

/*best case: O(1)
time complexity worst case O(log n)

total =n
1.n/2
2.n/2/2== n/2^2
3.n/2^3
4.n/2^4.....continue dividing the array into half till only single element
 is left(worst case scenario)
 Lets say that kTh iteration only 1 element is left
 k. n/2^k
 n/2^k=1
 n=2^k
 log 2(n)=log2(2^k)....taking log2 both sides
 log 2(n)=k log2(2)....power of log become product
 log2(n)=k.............log2(2)=1
 
 Thus,worst case time complexity is O(log(n))
*/