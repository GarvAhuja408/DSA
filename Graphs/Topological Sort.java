import java.util.*;

class Main {
    public static void dfs(int node,Stack<Integer>stack,ArrayList<ArrayList<Integer> > graph,boolean visited[]){
        
        visited[node]=true;
        
        for(int j=0;j<graph.get(node).size();j++){
            int neighbor = graph.get(node).get(j);
            
            if(!visited[neighbor]){
                dfs(neighbor,stack,graph,visited);
            }
        }
        stack.push(node);
    }
    public static ArrayList<Integer> topologicalSort(ArrayList<ArrayList<Integer> > graph,int V){
        
        boolean visited[]=new boolean[V];
        Stack<Integer>stack=new Stack<>();
        
        for(int i=0;i<V;i++){
            if(!visited[i]){
                dfs(i,stack,graph,visited);
            }
        }
        
        ArrayList<Integer>ans=new ArrayList<>();
        
        while(!stack.isEmpty()){
           ans.add( stack.pop() );
        }
        return ans;
    }
    public static void main(String[] args) {
         int V = 6;
         ArrayList<ArrayList<Integer> > graph = new ArrayList<>();
         
         for(int i=0;i<V;i++){
             graph.add(new ArrayList<>());
         }
         
        graph.get(5).add(2);
        graph.get(5).add(0);

        graph.get(4).add(0);
        graph.get(4).add(1);

        graph.get(2).add(3);

        graph.get(3).add(1);
        
        ArrayList<Integer>res = topologicalSort(graph,V);
        
        System.out.println(res);
    }
}