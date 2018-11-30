import java.util.Stack;

/**
 * StackClass
 */
public class StackClass {

    Stack<Integer> min = new Stack<>();

    Stack<Integer> stack = new Stack<>();

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void push(int data) {

        stack.push(data);
        if(isEmpty()) {
            min.push(data);
            return;
        }
        int y = min.peek();
        if(data < y)
            min.push(data);
        else min.push(y);
    }

    public int pop() {
        min.pop();
        return stack.pop();
    }

    public int getMin() {
        return min.peek();
    }


    public static void main(String[] args) {


    }
}