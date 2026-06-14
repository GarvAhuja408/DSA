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
    public static boolean twoSum(Node root,int k){
        HashSet<Integer>set=new HashSet<>();
        return helper(root,k,set);
    }
    public static boolean helper(Node root,int k,HashSet<Integer>set){
        if(root==null){
            return false;
        }
        if(set.contains(k-root.data)){
            return true;
        }
        set.add(root.data);
        
        return helper(root.left,k,set) || helper(root.right,k,set);
        
    } 
    public static void main(String[] args) {
         /*
                  5
                 / \
                3   6
               / \   \
              2   4   7
        */
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(6);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right.right = new Node(7);

        int k = 40;
        System.out.print(twoSum(root,k));
    }
}