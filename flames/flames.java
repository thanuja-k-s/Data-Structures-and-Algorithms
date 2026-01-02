import java.util.*;

public class flames{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String st1= sc.next();
        String st2= sc.next();

        StringBuilder str1=new StringBuilder(st1);
        StringBuilder str2=new StringBuilder(st2);

        String str3= "FLAMES";

        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();

        for(int i=0;i<str1.length();i++){
            map1.put(str1.charAt(i),map1.getOrDefault(str1.charAt(i),0)+1);
        }

        int c=0;
        for(int i=0;i<str2.length();i++){
            if(!map1.containsKey(str2.charAt(i))){
                c++;
            }
            else{
                map1.put(str2.charAt(i),map1.get(str2.charAt(i))-1);
            }
        }

        for(char keys:map1.keySet()){
            if(map1.get(keys)>=1){
                c=c+map1.get(keys);
            }
        }

      System.out.print(c);

      for(int i=0;i<str3.length();i++){
        
      }





    }
    
}
