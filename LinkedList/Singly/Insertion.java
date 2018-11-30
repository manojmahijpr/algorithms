class Insertion {

    LinkedList ll;

    Insertion() {
        this.ll = LinkedList.createRandomLL();
    }


    public static void main(String[] args) {
        Insertion insert = new Insertion();

        insert.headInsert(00);
        insert.beforeInsert(-4,2);
        insert.afterInsert(-2,3);
        insert.LastInsert(99);

        insert.ll.traverse();
    }
    
    public void headInsert(int value) {

        LinkedList.Node newHead = new LinkedList.Node(value);
        newHead.next = ll.head;
        ll.head = newHead;
    }

    public void beforeInsert(int value, int llData) {

        LinkedList.Node newNode = new LinkedList.Node(value);
        
        LinkedList.Node temp = ll.head;

        if(ll.head.data == llData) {
            headInsert(value);
        }


        while((temp.next.data != llData) && temp != null) {
            temp = temp.next;
        }

        if(temp == null) {
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void afterInsert(int value, int llData) {

        LinkedList.Node newNode = new LinkedList.Node(value);
        
        LinkedList.Node temp = ll.head;

        if(ll.head.data == llData) {
            headInsert(value);
        }


        while((temp.data != llData) && temp != null) {
            temp = temp.next;
        }

        if(temp == null) {
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void LastInsert(int value) {

        LinkedList.Node temp = ll.head;

        while(temp.next != null){
            temp = temp.next;
        }
        LinkedList.Node newNode = new LinkedList.Node(value);
        temp.next = newNode;
    }

}