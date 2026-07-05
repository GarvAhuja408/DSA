
class Main {
    public static class UnionFind{
        int parent[];
        
        public UnionFind(int n){
            parent = new int[n];
            for(int i=0;i<n;i++){
                parent[i]=i;
            }
        }
    
    public int find(int x){
        if(parent[x]==x){
            return x;
        }
        return find(parent[x]);
    }
    
    public void unionFind(int x,int y){
        int px = find(x);
        int py = find(y);
        
        if(px!=py){
            parent[py]=px;
        }
    }
    
    public void print(){
        for(int i=0;i<parent.length;i++){
            System.out.print(parent[i]+" ");
        }
        System.out.println();
    }
    }
    public static void main(String[] args) {
        UnionFind uf = new UnionFind(5);
        
        uf.print();
        uf.unionFind(0,1);
        uf.print();
        
        System.out.println(uf.find(1));
        uf.print();
        
        uf.unionFind(2,3);
        uf.print();
        System.out.println(uf.find(3));
        
    
    }
}