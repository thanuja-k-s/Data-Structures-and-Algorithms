import java.util.*;
public class factorial{
public static int fact(int x)
{
if(x==1 || x==0){
    return x;
}
return x*fact(x-1);

}
  public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.print(fact(x));
    }
}