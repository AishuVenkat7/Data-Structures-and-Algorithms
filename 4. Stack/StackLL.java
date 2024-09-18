import java.util.EmptyStackException;

public class StackLL {

    // implementation of stack using linkedlist
    private Node top;
    private int length;

    public StackLL() {
        top = null;
        length = 0;
    }

    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void push(int data) {
        Node node = new Node(data);
        node.next = top;
        top = node;
        length++;
    }

    public int pop() {
        if (top == null || length == 0)
            throw new EmptyStackException();
        int data = top.data;
        top = top.next;
        length--;
        return data;
    }

    // shows the top element without removing it
    public int peek() {
        if (top == null || length == 0)
            throw new EmptyStackException();
        return top.data;

    }

    public static void main(String[] args) {

        StackLL st = new StackLL();
        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println("before pop " + st.peek());

        st.pop();
        System.out.println("after pop " + st.peek());

    }

}
