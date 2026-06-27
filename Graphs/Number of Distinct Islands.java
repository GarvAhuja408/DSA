import java.util.*;
class Main {
    static int directions[][] = {
        {-1,0},
        {0,1},
        {1,0},
        {0,-1}
    };
    
    public static void dfs(int grid[][],boolean visited[][],int row,int col,int baseRow,int baseCol, List<String>shape){
        
        visited[row][col]=true;
        
        shape.add((row - baseRow) + "," + (col - baseCol));
        
        for(int i=0;i<directions.length;i++){
            int nr = row + directions[i][0];
            int nc = col + directions[i][1];
            
            if(nr>=0 && nc>=0 && nr<grid.length && nc < grid[0].length && grid[nr][nc]==1 && !visited[nr][nc]){
                
                dfs(grid,visited,nr,nc,baseRow,baseCol,shape);
            }
        }
    }
    public static int countDistinctIsland(int grid[][]){
        
        int n = grid.length;
        int m = grid[0].length;
        
        boolean visited[][]=new boolean[n][m];
        
        HashSet<List<String>> set = new HashSet<>();
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1 && !visited[i][j]){
                    
                    List<String>shape=new ArrayList<>();
                    dfs(grid,visited,i,j,i,j,shape);
                    
                    set.add(shape);
                }
            }
        }
        return set.size();
    }
    public static void main(String[] args) {
         int[][] grid = {
            {1, 1, 0, 0, 0},
            {1, 0, 0, 1, 1},
            {0, 0, 0, 1, 0},
            {1, 1, 0, 0, 0},
            {1, 0, 0, 0, 0}
        };
        
        System.out.print(countDistinctIsland(grid));
    }
}