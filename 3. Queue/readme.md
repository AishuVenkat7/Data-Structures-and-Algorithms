# Queue

* add() - Inserts the specified element into the queue. If the task is successful, add() returns true, if not it throws an exception.
* offer() - Inserts the specified element into the queue. If the task is successful, offer() returns true, if not it returns false.
* element() - Returns the head of the queue. Throws an exception if the queue is empty.
* peek() - Returns the head of the queue. Returns null if the queue is empty.
* remove() - Returns and removes the head of the queue. Throws an exception if the queue is empty.
* poll() - Returns and removes the head of the queue. Returns null if the queue is empty.

<img width="492" alt="queue-interface" src="https://github.com/user-attachments/assets/973c0cc3-2d6f-4409-ab0b-4d32c80700fe">

# Priority Queue

There are multiple ways to implement a Priority Queue, such as array and linked list. However, these implementations only guarantee O(1) time complexity for either insertion or deletion, while the other operation will have a time complexity of O(N). On the other hand, implementing the priority queue with Heap will allow both insertion and deletion to have a time complexity of 
O(logN).

# Dequeue

In a regular queue, elements are added from the rear and removed from the front. However, in a deque, we can insert and remove elements from both front and rear.

<img width="420" alt="deque-implemention-classes" src="https://github.com/user-attachments/assets/db07f884-f55b-4e63-a01c-630df4511acc">
