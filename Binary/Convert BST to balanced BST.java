import java.util.*;
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
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void getinorder(Node root,ArrayList<Integer>arr){
        if(root==null){
            return;
        }
        getinorder(root.left,arr);
        arr.add(root.data);
        getinorder(root.right,arr);
    }
    
    public static Node createBST(ArrayList<Integer>arr,int st,int end){
        if(st>end){
            return null;
        }
        int mid= (st+end)/2;
        Node root = new Node(arr.get(mid));
        root.left=createBST(arr,st,mid-1);
        root.right=createBST(arr,mid+1,end);
        return root;
    }
    
    public static Node balancedBST(Node root){
        ArrayList<Integer>arr=new ArrayList<>();
        getinorder(root,arr);
        
        Node newRoot = createBST(arr,0,arr.size()-1);
        return newRoot;
    }
    public static void main(String[] args) {
        
//           8
//         /   \
//       6     10
//       /        \
//      5          11
//     /             \
//   3               12
        Node root = new Node(8);
        root.left=new Node(6);
        root.left.left=new Node(5);
        root.left.left.left=new Node(3);
        root.right =new Node(10);
        root.right.right= new Node(11);
        root.right.right.right = new Node(12);
        root = balancedBST(root);
        preorder(root);
    }
}