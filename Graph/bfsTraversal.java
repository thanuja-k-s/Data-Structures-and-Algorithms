import java.util.*;

public class bfsTraversal {

    static HashMap<Integer,List<Integer>> map;
    public static void main(String [] args){
        map=new HashMap<>();
        int [][]arr={{0,1},{0,4},{1,2},{1,3},{2,3},{4,5}};

        for(int i=0;i<arr.length;i++){
            int u=arr[i][0];
            int v=arr[i][1];
            map.putIfAbsent(u,new ArrayList<>());
            map.putIfAbsent(v,new ArrayList<>());
            map.get(u).add(v);
            map.get(v).add(u);
        }

        System.out.println(map);
        System.out.println(map.get(3));

        Queue<Integer> q=new LinkedList<>();
         boolean[] vis=new boolean[6];
         for(int i=0;i<6;i++){
            vis[i]=false;
         }
             q.add(0);
             vis[0]=true;
             while(!q.isEmpty()){
                int x=q.poll();
                System.out.println(x);
                for(int i:map.get(x)){
                    if(vis[i]==false){
                        q.add(i);
                        vis[i]=true;
                    }
                }
             }
       

        
      }
    

       
    }
    

