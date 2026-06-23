class Main {
    public static int numProvinces(int[][] adj){
        int n = adj.length;
        boolean visited[]=new boolean[n];
        int count =0 ;
        
        for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs(i,adj,visited);
                count++;
            }
        }
        return count;
    }
    
    public static void dfs(int curr,int[][] adj,boolean visited[]){
        visited[curr]=true;
        
        for(int j=0;j<adj.length;j++){
            if(adj[curr][j]==1 && !visited[j]){
                dfs(j,adj,visited);
            }
        }
    }
    public static void main(String[] args) {
        int[][] adj = {
            {1, 0, 0, 1},
            {0, 1, 1, 0},
            {0, 1, 1, 0},
            {1, 0, 0, 1}
        };

        int result = numProvinces(adj);
        System.out.println("Number of Provinces: " + result);
    }
}
