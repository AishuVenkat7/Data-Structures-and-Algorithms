i. add() - Inserts the specified element into the queue. If the task is successful, add() returns true, if not it throws an exception.
ii. offer() - Inserts the specified element into the queue. If the task is successful, offer() returns true, if not it returns false.
iii. element() - Returns the head of the queue. Throws an exception if the queue is empty.
iv. peek() - Returns the head of the queue. Returns null if the queue is empty.
v. remove() - Returns and removes the head of the queue. Throws an exception if the queue is empty.
vi. poll() - Returns and removes the head of the queue. Returns null if the queue is empty.

In a regular queue, elements are added from the rear and removed from the front. However, in a deque, we can insert and remove elements from both front and rear.