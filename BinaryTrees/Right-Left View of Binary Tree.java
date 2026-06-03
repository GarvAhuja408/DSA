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
    public static void rightview(Node root,int level,ArrayList<Integer>res){
        
        if(root==null){
            return;
        }
        if(res.size()==level){
            res.add(root.data);
        }
        rightview(root.right,level+1,res);
        rightview(root.left,level+1,res);
    }
    public static ArrayList<Integer> right(Node root){
        ArrayList<Integer>res=new ArrayList<>();
        rightview(root,0,res);
        return res;
    }
    
    
    public static void leftview(Node root,int level,ArrayList<Integer>leftres){
        
        if(root==null){
            return;
        }
        if(leftres.size()==level){
            leftres.add(root.data);
        }
        leftview(root.left,level+1,leftres);
        leftview(root.right,level+1,leftres);
    }
    
    public static ArrayList<Integer> left(Node root){
        ArrayList<Integer>leftres=new ArrayList<>();
        leftview(root,0,leftres);
        return leftres;
    }
    public static void main(String[] args) {
        /*
          1
        /   \
       2     3
      / \     \
     4   5     6
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        
        ArrayList<Integer>ans = left(root);
        System.out.println(ans);
        
        ArrayList<Integer>answer = right(root);
        System.out.println(answer);

    }
}
