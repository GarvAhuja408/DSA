import java.util.*;

class Main {
    
    public static boolean dfs(int node,int currcolor,ArrayList<ArrayList<Integer>>adj,int color[]){
        
        color[node]=currcolor;
        
        for(int j=0;j<adj.get(node).size();j++){
            
            int neighbor = adj.get(node).get(j);
            
            if(color[neighbor]==-1){
                dfs(neighbor,1-currcolor,adj,color);
            }
            else if(color[neighbor]==currcolor){
                return false;
            }
        }
        return true;
    }
    public static boolean isBiparte(int V,ArrayList<ArrayList<Integer>>adj){
        
        int color[]=new int[V];
        Arrays.fill(color,-1);
        
        for(int i=0;i<V;i++){
            if(color[i]==-1){
                
                if(!dfs(i,0,adj,color)){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        
         /*
              0 ------- 1
              |         |
              |         |
              3 ------- 2
        */
        
        int V = 4;
        
        ArrayList<ArrayList<Integer>>adj = new ArrayList<>();
        
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(3).add(2);
        adj.get(3).add(0);
        adj.get(0).add(3);

        System.out.print(isBiparte(V,adj));
        
    }
}