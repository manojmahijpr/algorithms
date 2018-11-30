class Deletion {
    
    LinkedList ll;
    public Deletion() {

        this.ll = LinkedList.createRandomLL();
    }

    public void deleteList() {
        ll.head = null;
    }


    public static void main(String [] args) {

        Deletion delObj = new Deletion();

        //delObj.deleteList();
        delObj.deleteHead();
        delObj.deleteData(3);
        delObj.deleteLast();
        
        delObj.ll.traverse();
    }

    public void deleteHead() {
        ll.head = ll.head.next;
    }

    public void deleteLast() {
        LinkedList.Node temp = ll.head;
        
        while(temp.next.next!=null) {
            temp = temp.next;
        }
        temp.next=null;
    }

    public void deleteData(int data) {
        LinkedList.Node temp = ll.head;
        
        while(temp.next.data != data) {
            temp = temp.next;
        }
        temp.next= temp.next.next;
    }

}