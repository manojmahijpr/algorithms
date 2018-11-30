
public class LinkedList {

    Node head;

    static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void traverse() {

        Node node = this.head;

        while(node != null) {
            System.out.println(node.data);
            node = node.next;
        }

    }

    public static LinkedList createRandomLL() {
        
        LinkedList ll = new LinkedList();
        ll.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node forth = new Node(4);
        Node fifth = new Node(5);
        Node sixth = new Node(6);
        
        
        ll.head.next = second;
        second.next = third;
        third.next = forth;
        forth.next = fifth;
        fifth.next = sixth;

        return ll;
    }

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node forth = new Node(4);
        
        ll.head.next = second;
        second.next = third;
        third.next = forth;

        ll.traverse();
    }
}