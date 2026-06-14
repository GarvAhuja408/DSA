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
    public static int idx = 0; 
    
    public static Node construct(int preorder[],int bound){
        if(idx==preorder.length || preorder[idx]>bound){
            return null;
        }
        
        Node root = new Node(preorder[idx++]);
        
        root.left=construct(preorder,root.data);
        root.right=construct(preorder,bound);
        
        return root;
    }
    
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void main(String[] args) {
         int[] preorder = {5, 3, 2, 4, 6, 7};
         Node root = construct(preorder,Integer.MAX_VALUE);
         inorder(root);
    }
}