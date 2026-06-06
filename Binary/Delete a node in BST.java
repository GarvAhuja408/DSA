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
    
    public static Node build(Node root,int val){
        if(root==null){
            root = new Node(val);
            return root;
        }
        if(val<root.data){
            root.left=build(root.left,val);
        }else{
            root.right=build(root.right,val);
        }
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
    
    public static Node delete(Node root,int val){
        if(root == null){
             return null;
            }
            
        if(val < root.data){
            root.left = delete(root.left,val);
        }
        else if(val > root.data){
            root.right=delete(root.right,val);
        }
        else{
            //leaf node
            if(root.left==null&&root.right==null){
                return null;
            }
            //one child
            if(root.right==null){
                return root.left;
            }
            else if(root.left==null){
                return root.right;
            }
            
            //two childs
            Node suc = findsucessor(root.right);
            root.data = suc.data;
            root.right = delete(root.right,suc.data);
        }
        return root;
    }
    public static Node findsucessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
    public static void main(String[] args) {
//        50
//       /  \
//      30    70
//     / \      \
//   20  30       80
        int[] values = {50, 30, 70, 20, 40, 60, 80};
        Node root = null;
        
        for(int i=0;i<values.length;i++){
            root= build(root,values[i]);
        }
        inorder(root);
        System.out.println();
        
        root=delete(root,30);
        inorder(root);
    }
}