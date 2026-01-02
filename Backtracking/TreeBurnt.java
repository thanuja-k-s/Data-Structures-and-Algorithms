import java.util.*;
public class TreeBurnt {
    public static void 
     tree(int[] arr,int i,int j){
        if(a[i][j]==0){
            return ;



        if(i<n)
          tree(i-1,j);
          tree(i,j-1);
          tree(i+1,j);
          tree(arr,i-1,j);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
          for(int k=0;k<n;k++){
            for(int c=0;c<m;c++){
                if(arr[k][c]==1){

                }
               
            }
          }
        }
    }
     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int [n][m];
        int t=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
                if(arr[i][j]==1){
                    t++;
                }
            }
        }
        int c=0;
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(arr[i][j]==1){
        
                c++;
                break;
            }           

        }
    }

    System.out.print(t-c);
}
}
