import java.util.Collections;
import java.util.*;
public class Stackc {
    public static void main(String [] args){
     Scanner sc=new Scanner(System.in);
     Stack<Integer> stack = new Stack<>();
     int n = sc.nextInt();
     int [] arr = new int[n];
     for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
     }
     for(int i=0;i<n;i++){
        stack.add(arr[i]);
     }
     int m = stack.size();
     for(int i=0;i<n;i++){
        System.out.print(stack.pop());
     }
    }
    
}
