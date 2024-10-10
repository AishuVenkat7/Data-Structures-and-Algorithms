import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.ArrayDeque;

public class QueueDS {

    public static void main(String[] args) {
        // Creating Queue using the LinkedList class
        Queue<Integer> numbers = new LinkedList<>();
        // Queue<Integer> arrNum = new ArrayDeque<>();

        // offer(add) elements to the Queue
        numbers.offer(1);
        numbers.offer(2);
        numbers.offer(3);
        System.out.println("Queue: " + numbers);

        // Access elements of the Queue
        int accessedNumber = numbers.peek();
        System.out.println("Accessed Element: " + accessedNumber);

        // Remove elements from the Queue
        int removedNumber = numbers.poll();
        System.out.println("Removed Element: " + removedNumber);

        System.out.println("Updated Queue: " + numbers);

        // Creating a priority queue
        PriorityQueue<Integer> numbers2 = new PriorityQueue<>();

        // Using the add() method
        numbers2.add(4);
        numbers2.add(2);
        System.out.println("PriorityQueue: " + numbers2);

        // Using the offer() method
        numbers2.offer(1);
        System.out.println("Updated PriorityQueue: " + numbers2);
    }

}
