import java.util.*;
class Main {
    public static boolean dfs(int node,int parent,int V,ArrayList<ArrayList<Integer>>graph,boolean visited[]){
        
        visited[node]=true;
        
        for(int j=0;j<graph.get(node).size();j++){
            int neighbor = graph.get(node).get(j);
            
            if(!visited[neighbor]){
                if(dfs(neighbor,node,V,graph,visited)){
                    return true;
                }
            }
            else if(neighbor != parent){
                return true;
            }
        }
        return false;
    }
    public static boolean isCycle(int V,ArrayList<ArrayList<Integer>>graph){
        
        boolean visited[]=new boolean[V];
        
        for(int i=0;i<V;i++){
            if(!visited[i]){
                if(dfs(i,-1,V,graph,visited)){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
         int V = 5;
         ArrayList<ArrayList<Integer>>graph = new ArrayList<>();
         
         for(int i=0;i<V;i++){
             graph.add(new ArrayList<>());
         }
         
        graph.get(0).add(1);
        graph.get(1).add(0);

        graph.get(1).add(2);
        graph.get(2).add(1);

        graph.get(2).add(3);
        graph.get(3).add(2);

        graph.get(3).add(4);
        graph.get(4).add(3);

        graph.get(4).add(1);
        graph.get(1).add(4);
        
        System.out.print(isCycle(V,graph));
        
    }
}