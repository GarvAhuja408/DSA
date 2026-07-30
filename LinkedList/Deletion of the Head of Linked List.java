class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Main {

    static Node deleteHead(Node head) {

        if (head == null) {
            return null;
        }

        return head.next;
    }

    static void printList(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        head = deleteHead(head);

        printList(head);
    }
}