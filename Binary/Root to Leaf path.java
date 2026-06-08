import java.util.*;

public class Main {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }

        if (val < root.data) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }
    
    public static void printpath(ArrayList<Integer>path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+" ");
        }
        System.out.println("Null");
    }
    
    public static void rootToLeaf(Node root,ArrayList<Integer>arr){
        if(root==null){
            return;
        }
        arr.add(root.data);
        
        if(root.left==null && root.right==null){
            printpath(arr);
        }else{
            rootToLeaf(root.left,arr);
            rootToLeaf(root.right,arr);
        }
        
        arr.remove(arr.size()-1);
    }
    public static void main(String[] args) {
        
//         8
//       /   \
//      5     10
//     / \      \
//   3    6      11

        int[] values = {8, 5, 3, 6, 10, 11};

        Node root = null;

        for(int i=0;i<values.length;i++){
            root=insert(root,values[i]);
        }
        ArrayList<Integer>arr = new ArrayList<>();
        rootToLeaf(root,arr);
    }
}