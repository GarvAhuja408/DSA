class Main {
    public static class Node{
        int data;
        Node left;
        Node right;
        
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static Node lca(Node root,int n1,int n2){
        if(root==null||root.data==n1 || root.data==n2){
            return root;
        }
        Node left = lca(root.left,n1,n2);
        Node right = lca(root.right,n1,n2);
        
        if(left==null){
            return right;
        }
        if(right==null){
            return left;
        }
        return root;
    }
    public static int helper(Node root,int n){
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }
        int left = helper(root.left,n);
        int right = helper(root.right,n);
        
        if(left==-1&&right==-1){
            return -1;
        }else if(right==-1){
            return left+1;
        }else{
            return right+1;
        }
    }
    public static int distance(Node root,int n1,int n2){
        Node lca = lca(root,n1,n2);
        
        int dis1 = helper(lca,n1);
        int dis2 = helper(lca,n2);
        
        return dis1+dis2;
    }
    public static void main(String[] args) {
        
//         1
//       /   \
//      2     3
//     / \     \
//   4    5  6   7

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3); 
        root.left.left = new Node(4);
        root.left.right = new Node(5); 
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int n1 = 4;
        int n2 = 6;
        System.out.print(distance(root,n1,n2));
    }
}