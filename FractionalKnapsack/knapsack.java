import java.util.*;
public class knapsack {
    public static void main(String[] args){
        int W=20;
        int profit=0;
        int w[]={7,11,3,4,5};
        int p[]={40,60,0,45,70};
        Integer ind[]=new Integer[w.length];
        for(int c=0;c<w.length;c++){
            ind[c]=c;
        }

        Arrays.sort(ind,(i,j)->{
            double r1=(double)p[i]/w[i];
            double r2=(double)p[j]/w[j];
            return Double.compare(r2,r1);
        });

        for(int i:ind){
            if(w[i]<W){
                W-=w[i];
                profit+=p[i];

            }
            else{
                profit+=(double)p[i]/w[i]*W;
                W=0;
            }
        }
        System.out.println(profit);
    }
    
}
