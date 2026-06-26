import java.util.*;

public class RottenOranges {
    public static class Cell{
        int row;
        int col;
        
        public Cell(int row,int col){
            this.row=row;
            this.col=col;
        }
    }
    public static int orangesRotting(int grid[][]){
        if(grid.length==0) return -1;
        
        Queue<Cell> q = new LinkedList<>();
        int fresh = 0;
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                
                if(grid[i][j]==2){
                    q.add(new Cell(i,j));
                }else if(grid[i][j]==1){
                    fresh++;
                }
                
            }
        }
        
        if(fresh==0) return 0;
        
        int directions[][]={
            {-1, 0},
            {1, 0},
            {0, -1},
            {0, 1}
        };
        
        int minutes = 0;
        
        while(!q.isEmpty() ){
            int size = q.size();
            boolean rotten = false;
            
            for(int i=0;i<size;i++){
                Cell curr = q.remove();
                
                int r = curr.row;
                int c = curr.col;
                
                for(int d=0;d<directions.length;d++){
                    
                    int nr = r + directions[d][0];
                    int nc = c + directions[d][1];
                    
                    if(nr>=0 && nc>=0 && nr < grid.length && nc < grid[0].length && grid[nr][nc]==1){
                        
                        grid[nr][nc]=2;
                        fresh--;
                        rotten=true;
                        q.add(new Cell(nr,nc));
                    }
                }
            }
            if(rotten){
                minutes++;
            }
        }
        return (fresh==0) ? minutes : -1; 
    }                                                      

    public static void main(String[] args) {
        
        int[][] grid = {
            {2, 1, 1},
            {0, 1, 1},
            {0, 0, 1}
        };

        System.out.println(orangesRotting(grid)); // -1
    }
}