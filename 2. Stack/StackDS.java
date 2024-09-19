import java.util.Stack;

public class StackDS {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<Integer>();
        stack.push(100);
        stack.push(200);
        stack.push(300);
        stack.push(400);

        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());

        System.out.println("search ele 200 -- at position " + stack.search(200));

        System.out.println(stack);

    }

}
