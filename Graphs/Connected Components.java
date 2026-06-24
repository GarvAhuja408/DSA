import java.util.*;

public class ConnectedComponents {
    public static void dfs(int curr,ArrayList<List<Integer>>adj,boolean visited[]){
        
        visited[curr]=true;
        
        for(int i=0;i<adj.get(curr).size();i++){
            int neighbor = adj.get(curr).get(i);
            
            if(!visited[neighbor]){
                dfs(neighbor,adj,visited);
            }
        }
    }
    public static int countComponents(int V, int[][] edges) {
        
        ArrayList<List<Integer> >adj = new ArrayList<>();
        
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>() );
        }
        
        for(int i=0;i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        
        boolean visited[]=new boolean[V];
        int components = 0;
        
        for(int i=0;i<adj.size();i++){
            if(!visited[i]){
                dfs(i,adj,visited);
                components++;
            }
        }
        return components;
    }
    
    public static void main(String[] args) {

        int V = 4;
        int[][] edges = {
            {0, 1},
            {1, 2}
        };

        int result = countComponents(V, edges);
        System.out.println(result); 
    }
}