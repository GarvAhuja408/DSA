class Main {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    public static int findMin(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root.data;
    }

    public static int findMax(Node root){
        while(root.right != null){
            root = root.right;
        }
        return root.data;
    }

    public static void main(String[] args) {

        //       4
        //      / \
        //     2   7
        //    / \   \
        //   1   3   9

        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(7);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.right = new Node(9);

        System.out.println("Minimum = " + findMin(root));
        System.out.println("Maximum = " + findMax(root));
    }
}
