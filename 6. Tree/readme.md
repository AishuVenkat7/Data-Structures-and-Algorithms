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