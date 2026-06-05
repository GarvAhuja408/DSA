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
    public static Node search(Node root,int target){
        while(root != null && root.data != target){
            if(target<root.data){
                root=root.left;
            }else{
                root=root.right;
            }
        }
        return root;
    }
    public static void main(String[] args) {
        
    //    4
    //   / \
    //   2   7
    //  / \
    // 1   3
    
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(7);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        int target = 10;
        
        Node result = search(root,target);
        if(result!=null){
            System.out.print("Key is in the Tree");
        }else{
            System.out.print("Key is not in the Tree");
        }
    }
}