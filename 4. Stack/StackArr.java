package Stack;

public class StackArr {

    private int top;
    private int[] arr;

    public StackArr() {
        // default constructore calls parameterized constructor using this()
        this(10);
    }

    public StackArr(int capacity) {
        arr = new int[capacity];
        top = -1;
    }

    public void push(int data) {
        // coz top goes from 0 to capacity - 1
        if (arr.length == top + 1)
            throw new StackOverflowError("Stack is full");
        top++;
        arr[top] = data;
    }

    public int pop() {
        if (top < 0)
            throw new IndexOutOfBoundsException("stack is empty");
        int data = arr[top];
        top--;
        return data;
    }

    public int peek() {
        if (top < 0)
            throw new IndexOutOfBoundsException("stack is empty");
        return arr[top];
    }

    public static void main(String[] args) {

        StackArr st = new StackArr(3);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        System.out.println("before pop " + st.peek());

        st.pop();
        System.out.println("after pop " + st.peek());

    }

}
