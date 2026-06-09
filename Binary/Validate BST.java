public class Main {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left=null;
            this.right=null;
        }
    }
    public static boolean isValid(Node root, Node min,Node max){
        if(root==null){
            return true;
        }
        if(min!=null && root.data <= min.data ){
            return false;
        }
        else if(max!=null && root.data >= max.data ){
            return false;
        }
        return isValid(root.left,min,root) && isValid(root.right,root,max);
    }
    public static void main(String[] args) {

    //    8
    //   / \
    //  5   10
    //  / \    \
    // 3   6    11
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);

        System.out.println(isValid(root,null,null)); // true

        // Invalid BST
        Node root2 = new Node(5);
        root2.left = new Node(1);
        root2.right = new Node(4);
        root2.right.left = new Node(3);
        root2.right.right = new Node(6);

        System.out.println(isValid(root2,null,null)); // false
    }
}