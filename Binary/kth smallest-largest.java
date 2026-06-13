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
    public static int count;
    public static int smallest;
    public static int largest;
    
    public static void kthLargestAndSmallest(Node root,int k){
        count=0;
        inorder(root,k);
        
        count=0;
        reverseinorder(root,k);
    }
    
    public static void inorder(Node root,int k){
        if(root==null){
            return;
        }
        inorder(root.left,k);
        
        count++;
        if(count==k){
            smallest = root.data;
            return;
        }
        inorder(root.right,k);
    }
    
     public static void reverseinorder(Node root,int k){
        if(root==null){
            return ;
        }
        reverseinorder(root.right,k);
        
        count++;
        if(count==k){
            largest = root.data;
            return;
        }
        reverseinorder(root.left,k);
    }
    public static void main(String[] args) {
        /*
                  5
                 / \
                3   7
               / \ / \
              2   4 6  8
        */

        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(7);

        root.left.left = new Node(2);
        root.left.right = new Node(4);

        root.right.left = new Node(6);
        root.right.right = new Node(8);

        int k = 3;
        kthLargestAndSmallest(root,k);
        
        System.out.println("Kth Smallest = " + smallest);
        System.out.println("Kth Largest = " + largest);
    }
}