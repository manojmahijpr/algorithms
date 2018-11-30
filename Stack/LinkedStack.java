/**
 * LinkedListStack
 */
public class LinkedStack {

    Node head;

    public LinkedStack(int data) {
        head = new Node(data);
    }

    static class Node {
        
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void push(int data) {

        Node node = new Node(data);
        node.next=head;
        head = node;
    }

    public int pop() {

        if(head == null) {
            System.out.println("Underflow");
            return -1;
        }

        int data = head.data;
        head = head.next;
        return data;
    }

    public int peek() {
        return head.data;
    }

    public boolean isEmpty() {
        return (head == null);
    }
    
    public static void main(String[] args) {
        LinkedStack ls = new LinkedStack(10);
        ls.push(12);
    }
}