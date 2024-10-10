import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Arrays;

public class Heap {
    public static void main(String[] args) {
        // In Java, a Heap is represented by a Priority Queue
        // Construct an instance of Min Heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Add 3，1，2 respectively to the Min Heap
        minHeap.add(3);
        minHeap.add(1);
        minHeap.add(2);

        // Check all elements in the Min Heap, the result is [1, 3, 2]
        System.out.println("minHeap: " + minHeap.toString());

        // Get the top element of the Min Heap
        int peekNum = minHeap.peek();

        // The result is 1
        System.out.println("peek number: " + peekNum);

        // Delete the top element in the Min Heap
        int pollNum = minHeap.poll();

        // The reult is 1
        System.out.println("poll number: " + pollNum);

        // Check the top element after deleting 1, the result is 2
        System.out.println("peek number: " + minHeap.peek());

        // Check all elements in the Min Heap, the result is [2,3]
        System.out.println("minHeap: " + minHeap.toString());

        // Check the number of elements in the Min Heap
        // Which is also the length of the Min Heap
        int heapSize = minHeap.size();

        // The result is 2
        System.out.println("minHeap size: " + heapSize);

        // Check if the Min Heap is empty
        boolean isEmpty = minHeap.isEmpty();

        // The result is false
        System.out.println("isEmpty: " + isEmpty);

        // -------------------------------------------
        // Construct an empty Max Heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        // Insert an element to the Max Heap
        maxHeap.add(5);
        // Get top element from the Max Heap
        // i.e. the largest element
        maxHeap.peek();
        // Delete top element from the Max Heap
        maxHeap.poll();

        // Length of the Max Heap
        maxHeap.size();

        // If there are no elements in the Heap, isEmpty() will return true;
        // If there are still elements in the Heap, isEmpty() will return false;
        maxHeap.isEmpty();

        // Construct a Heap with initial elements.
        // This process is named "Heapify".
        // The Heap is a Min Heap
        PriorityQueue<Integer> heapWithValues = new PriorityQueue<>(Arrays.asList(3, 1, 2));
    }

}
