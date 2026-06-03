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
    public static boolean isMirror(Node root1,Node root2){
        if(root1==null && root2==null){
            return true;
        }
        if(root1==null || root2==null){
            return false;
        }
        if(root1.data != root2.data){
            return false;
        }
        boolean left = isMirror(root1.left,root2.right);
        boolean right = isMirror(root1.right,root2.left);
        
        return left&&right;
    }
    public static boolean Symmetrical(Node root){
        if(root==null){
            return true;
        }
        return isMirror(root.left,root.right);
    }
    public static void main(String[] args) {
        /*
                1
              /   \
             2     2
            / \   / \
           3   4 4   3
        */

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(2);

        root.left.left = new Node(3);
        root.left.right = new Node(4);

        root.right.left = new Node(4);
        root.right.right = new Node(3);
        
        System.out.print(Symmetrical(root));

    }
}