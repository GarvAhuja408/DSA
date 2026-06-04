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
    static int maxsum = Integer.MIN_VALUE;
    
    public static int maxSumPath(Node root){
        helper(root);
        return maxsum;
    }
    public static int helper(Node root){
        if(root==null){
            return 0;
        }
        int left = Math.max(0,helper(root.left));
        int right =Math.max(0,helper(root.right));
        
        int curr = root.data + left + right;
        maxsum = Math.max(curr,maxsum);
        
        return root.data +Math.max(left,right);
    } 
    public static void main(String[] args) {
         /*
                  10
                 /   \
                -9     20
                     
        */
        Node root = new Node(-10);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);
        System.out.print(maxSumPath(root));
    }
}
