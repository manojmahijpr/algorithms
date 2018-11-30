/**
 * LoopLinkList
 */
public class LoopLinkList {

    LinkedList ll;

    public LoopLinkList() {
        ll.head = LinkedList.createRandomLL();
    }

    public static void main(String[] args) {
        
        LoopLinkList obj = new LoopLinkList();


    }

    public boolean detectLoop() {

        LinkedList.Node slow = ll.head, fast = ll.head;

        while(slow != null && fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {
                System.out.println("Loop Detected");
                return true;
            }
        }
        return false;
    }

    public int findLoopSize() {

        LinkedList.Node slow = ll.head, fast = ll.head;

        while(slow != null && fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if( slow == fast)
                return getLoopSize(slow);
        }
        return -1;
    }

    public int getLoopSize(LinkedList.Node slow) {

        int res = 0;
        LinkedList.Node temp = slow;
        while(temp.next != slow) {
            res++;
            temp = temp.next;
        }
        return res;
    }

    public void removeLoop() {

        LinkedList.Node slow = ll.head, fast = ll.head;

        while(slow != null && fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if( slow == fast)
                break;
        }

        if(slow == fast) {
            slow = head;
            while( slow.next != fast.next ) {
                slow = slow.next;
                fast = fast.next;
            }
        }
        fast.next = null;
    }
}