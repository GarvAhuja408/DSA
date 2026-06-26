import java.util.*;

class Main {
    public static class Cell{
        int row;
        int col;
        
        public Cell(int row,int col){
            this.row=row;
            this.col=col;
        }
    }
    public static int[][] floodfill(int image[][],int sr,int sc,int newColor){
        
        int originalcolor = image[sr][sc];
        
        if(originalcolor == newColor){
            return image;
        }
        
        Queue<Cell>q=new LinkedList<>();
        q.add(new Cell(sr,sc));
        
        image[sr][sc]=newColor;
        
        int directions[][]={
            {-1,0},
            {1,0},
            {0,-1},
            {0,1}
        };
        
        while(!q.isEmpty()){
            Cell curr = q.remove();
            
            for(int d=0;d<directions.length;d++){
                int nr = curr.row + directions[d][0];
                int nc = curr.col + directions[d][1];
                
                if(nr< image.length &&  nc < image[0].length && nr>=0 && nc >=0 && image[nr][nc]==originalcolor){
                    
                    image[nr][nc]=newColor;
                    q.add(new Cell(nr,nc));
                }
            }
        }
        return image;
    }
    public static void main(String[] args) {
        int[][] image = {
                {1, 1, 1},
                {1, 1, 0},
                {1, 0, 1}
        };

        int sr = 1;
        int sc = 1;
        int newColor = 2;
        
        int res[][] = floodfill(image,sr,sc,newColor);
        
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[0].length;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}