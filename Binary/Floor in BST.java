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
    public static int floor(Node root,int key){
        int ans = -1;
        
        while(root!=null){
            if(root.data==key){
                ans=root.data;
                return ans;
            }
            if(root.data<key){
                ans = root.data;
                root=root.right;
            }else{
                root=root.left;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
//         8
//       /   \
//      4     12
//     / \   /  \
//   2   6 10    14
        Node root = new Node(8);
        root.left = new Node(4);
        root.right = new Node(12);
        root.left.left = new Node(2);
        root.left.right = new Node(6);
        root.right.left = new Node(10);
        root.right.right = new Node(14);
        
        int key = 14;
        
        System.out.print(floor(root,key));
    }
}
