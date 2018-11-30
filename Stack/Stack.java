/**
 * Stack
 */
public class Stack {

    static final int MAX = 1000;
    int top;
    int array[] = new int[MAX];

    public boolean isEmpty() {
        return top < 0;
    }

    Stack() {
        top = -1;
    }

    public boolean push(int data) {

        if((top+1) == MAX) {
            System.out.println("Stack Overflow");
            return false;
        }
        array[++top] = data;
        return true;
    }

    public int pop() {
        if(top=-1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return array[top--];
    }

    public int peek() {
        if(top==-1) {
            System.out.println("Stack Empty");
            return -1;
        }
        return array[top];
    }



    public static void main(String[] args) {
    
        Stack stack = new Stack();
    }
}