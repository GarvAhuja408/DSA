import java.util.*;

class Main {
    public static boolean dfs(int node,boolean visited[],boolean pathvisited[],ArrayList<ArrayList<Integer> > graph){
        
        visited[node]=true;
        pathvisited[node]=true;
        
        for(int j=0;j<graph.get(node).size();j++){
            int neighbor = graph.get(node).get(j);
            
            if(!visited[neighbor]){
                if(dfs(neighbor,visited,pathvisited,graph)){
                    return true;
                }
            }
            else if(pathvisited[neighbor]){
                return true;
            }
        }
        pathvisited[node]=false;
        return false;
    }
    public static boolean hasCycle(int V,ArrayList<ArrayList<Integer> > graph){
        
        boolean visited[]=new boolean[V];
        boolean pathvisited[]=new boolean[V];
        
        for(int i=0;i<V;i++){
            if(!visited[i]){
                if(dfs(i,visited,pathvisited,graph)){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int V = 4;
        ArrayList<ArrayList<Integer> > graph = new ArrayList<>();
        
        for(int i=0;i<V;i++){
            graph.add(new ArrayList<>());
        }
        
        graph.get(0).add(1);
        graph.get(1).add(2);
        graph.get(2).add(3);
        graph.get(3).add(1);
        
        System.out.print(hasCycle(V,graph));
    }
}