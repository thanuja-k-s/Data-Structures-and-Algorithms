import java.util.*;

public class dfsTraversal {

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
       

        
         boolean[] vis=new boolean[6];
         for(int i=0;i<6;i++){
            vis[i]=false;
         }
       dfs(0,vis);
        
      }

      static void dfs(int start,boolean[] vis){
        vis[start]=true;
        System.out.println(start);
        for(int i:map.get(start)){
            if(vis[i]==false){
                dfs(i,vis);
            }
        }
      }
    

       
    }
    

