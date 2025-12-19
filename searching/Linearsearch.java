import java.util.*;
public class Linearsearch{
    public static void main(String [] args){
        Scanner sc= new Scanner (System.in);
        int n = sc.nextInt();
        int search = sc.nextInt();
        int [] arr = new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int x=0;
        for(int i=0;i<n;i++){
            if(arr[i]==search){
                System.out.print(i);
                x=9;
                break;
            }
        }
        if(x==0){
            System.out.print("Element not found");
        }


    }
}

/*
time complexity worst case:O(n)
best case O(1)

print the element
sum of elements
max value finding
without knowing we are using the linear search algorithm in our day today problem solving
*/