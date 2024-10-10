# Binary Tree

A binary tree is a tree data structure in which each node has at most two children: a left child and a right child.

## Traversal Methods

### 1. Depth-First Search (DFS)
* **Preorder**: Visit the node, then the left subtree, followed by the right subtree.  
  _Order: Node → Left → Right_
* **Inorder**: Visit the left subtree, then the node, followed by the right subtree.  
  _Order: Left → Node → Right_
* **Postorder**: Visit the left subtree, then the right subtree, followed by the node.  
  _Order: Left → Right → Node_

### 2. Breadth-First Search (BFS)
* **Level Order**: Visit all nodes at each level from left to right.


# Binary Search Tree

A **Binary Search Tree (BST)** is a type of binary tree where each node follows a specific ordering property:
* The left subtree of a node contains only nodes with values less than the node’s key.
* The right subtree of a node contains only nodes with values greater than the node’s key.
* Both the left and right subtrees must also be binary search trees.

This property allows efficient searching, insertion, and deletion operations with an average time complexity of O(log n).

The **inorder traversal** of the BST gives the values of the nodes in **sorted order**

# Heap:

a Heap is a special type of binary tree. A heap is a binary tree that meets the following criteria:

Is a complete binary tree;
The value of each node must be no greater than (or no less than) the value of its child nodes.
A Heap has the following properties:

Insertion of an element into the Heap has a time complexity of 
O(logN);
Deletion of an element from the Heap has a time complexity of 
O(logN);
The maximum/minimum value in the Heap can be obtained with 
O(1) time complexity because it always present in the root.

## Methods
add() - Inserts the specified element to the queue. If the queue is full, it throws an exception.
offer() - Inserts the specified element to the queue. If the queue is full, it returns false.
remove() - removes the specified element from the queue
poll() - returns and removes the head of the queue
peek() - Returns the head of the queue. Returns null if the queue is empty.