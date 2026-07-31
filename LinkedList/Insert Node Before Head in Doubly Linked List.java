class Node {

    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class Main {

    static Node insertBeforeHead(Node head, int data) {

        Node newNode = new Node(data);

        if (head == null) {
            return newNode;
        }

        newNode.next = head;
        head.prev = newNode;

        return newNode;
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
        head.next.prev = head;

        head = insertBeforeHead(head, 10);

        printList(head);
    }
}