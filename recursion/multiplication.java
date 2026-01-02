import java.util.*;
public class multiplication{
public static void multiply(int x,int i)
{
if(i==0){
    return ;
}
multiply(x,i-1);
System.out.println(x+" * "+i+" = "+ x*i);
}
  public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        multiply(x,10);
    }
}