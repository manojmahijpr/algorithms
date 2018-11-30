class ListOperations {

    LinkedList ll;

    ListOperations() {
        this.ll = LinkedList.createRandomLL();
    }

    public static void main(String [] args) {

        ListOperations operation = new ListOperations();
        operation.reverseList();
        //System.out.println(operation.getBackNode(2));
        System.out.println(operation.getNode(2));
        
        // operation.search(2);
        // operation.search(4);

        
        // System.out.println("length " + operation.findLength());
        // System.out.println("length " + operation.findLengthRec(operation.ll.head));
        
        
    }

    public int findLength() {
        LinkedList.Node temp = ll.head;
        int count=0;
        while(temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public int findLengthRec(LinkedList.Node node) {
        if(node == null)
            return 0;
        return 1 + findLengthRec(node.next);
    }

    public int getNode(int n) {
        
        LinkedList.Node node = ll.head;
        if(findLengthRec(node) < n) {
            System.out.println("Not Possible to Retrieve");
        }

        int count=1;
        while(count<=(n-1)) {
            node = node.next;
            count++;
        }
        return node.data;
    }

    public int getBackNode(int n) {
        
        LinkedList.Node node = ll.head;
        int newN = findLengthRec(node) - n + 1;
        return getNode(newN);
    }

    public void search(int data) {
        LinkedList.Node temp = ll.head;

        while(temp != null) {

            if(temp.data == data) {
                System.out.println(data + " Found");
                return;
            }
            temp = temp.next;
        }
        System.out.println(data + " Not Found");
    }


    public void reverseList() {

        LinkedList.Node currentPtr = ll.head;
        LinkedList.Node prevPtr = null;
        LinkedList.Node nextPtr;

        while(currentPtr != null) {

            nextPtr = currentPtr.next;
            currentPtr.next = prevPtr;
            prevPtr = currentPtr;
            currentPtr = nextPtr;
        }

        ll.head = prevPtr;
        ll.traverse();
    }

    public boolean detectCycleInList() {
        
        LinkedList.Node slow = ll.head, fast = ll.head;
        
        while(slow != null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                System.out.println("Loop Detected");
                return true;
            }
        }
        return false;
    }
}