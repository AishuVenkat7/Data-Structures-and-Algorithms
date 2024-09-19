<h1 align="center">
  <br>
  Data Structures and Algorithms
  <br>
</h1>

## Introduction to Data Structures
<p align="center">
    <a href="#basics">Basics</a> •
    <a href="#stacks">Stacks</a> •
    <a href="#queues">Queues</a> •
    <a href="#linked-list">Linked List</a> •
    <a href="#tree">Tree</a> •
    <a href="#graph">Graph</a> •
    <a href="#search">Searching</a> •
    <a href="#sort">Sorting</a>
</p>

### Basics
* Data Structures are storage units used to store and organize data - done in a way so that data can be accessed and updated efficiently
* Types of data structures - Linear and Non-Linear
* Linear Data Structures - 
    - Elements are arranged in sequential order 
    - Easier to implement for less complex use cases
    - Arrays: Elements are arranged in continuous memory - all the elements that can be stored in an array are of the same type.
    - Stacks: Elements stored in LIFO (Last In First Out)
    - Queues: Elements stores in FIFO (First In First Out)
    - Linked List: Elements connected through a series of nodes, where each node contains item and address to the next node

* Non-Linear Data Structures - 
    - Non-sequential 
    - Arranged in hierarchical order - one element connected to one or multiple elements
    - Graphs: Each node is called a vertex and vertices are connected to each other via edges.
    - Trees: Similar to graphs, but there can only be one edge between two vertices.

| Linear Data Structures | Non-Linear Data Structures |
| :--------------------: | :-------------------------:| 
| Sequential             | Non-Sequential             | 
| All items present in single layer | In multiple layers | 
| Traversed in a single run | Requires multiple runs | 
| Inefficient memory utilization | Relatively efficient memory utilization |
| Time complexity increases with data | Time complexity remains the same | 

![dsa_img1](https://github.com/user-attachments/assets/d15d4b61-bbe5-4c81-8116-3a54892df4c8)

## Time and Space complexity

## Linear Data Structures

| **Data Structure**            | **Access** | **Search** | **Insertion** | **Deletion**  | **Space Complexity** |
|-------------------------------|------------|------------|---------------|---------------|----------------------|
| **Array**                     | O(1)       | O(n)       | O(n)          | O(n)          | O(n)                 |
| **String**                    | O(1)       | O(n)       | O(n)          | O(n)          | O(n)                 |
| **Linked List**               | O(n)       | O(n)       | O(1)          | O(1)          | O(n)                 |
| **Stack (Array/Linked List)** | O(1) (peek)| O(n)       | O(1) (Push)   | O(1) (Pop)    | O(n)                 |
| **Queue (Array/Linked List)** | O(1) (peek)| O(n)       | O(1) (Enqueue)| O(1) (Dequeue)| O(n)                 |



