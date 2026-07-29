class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Main {

    static Node insertAtHead(Node head, int data) {

        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

        return head;
    }

    static void printList(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        Node head = new Node(20);
        head.next = new Node(30);
        head.next.next = new Node(40);

        head = insertAtHead(head, 10);

        printList(head);
    }
}
