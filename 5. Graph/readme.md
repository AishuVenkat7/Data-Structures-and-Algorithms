# Graph:

It is a non-linear data structure used for storing the data.
A **graph** is a data structure consisting of a set of nodes (also called vertices) connected by edges. Graphs are used to model pairwise relationships between objects, making them suitable for representing various real-world scenarios like social networks, maps, or the web of linked pages.

## Graph Terminology

- **Vertex (Node):** The fundamental unit of a graph that holds data. A graph consists of multiple vertices. It is also known as also known as vertex or nodes.
- **Edge:** A connection between two vertices. An edge can be directed or undirected.
- **Adjacency:** Two vertices are said to be adjacent if there is an edge directly connecting them.
- **Path:** A sequence of edges that connects two vertices. If you can traverse from vertex A to vertex B by following edges, the sequence of these edges is called a path.
- **Directed Graph:** A graph where the edges have a direction. If there is an edge from vertex `u` to vertex `v`, it doesn't imply that there is an edge from `v` to `u`. Directed edges are usually represented by arrows.

## Graph Representation

Graphs can be represented in two common ways:

### 1. Adjacency Matrix

An adjacency matrix is a 2D array where each element represents the presence of an edge between two vertices.

- **Size:** The matrix is of size `V x V`, where `V` is the number of vertices.
- **Edge Representation:** If there is an edge between vertex `i` and vertex `j`, then `adjMatrix[i][j] = 1` and  `adjMatrix[j][i] = 1`; otherwise, it is `0`.

#### Example:

For a graph with vertices 0, 1, 2 and 3.
Edges 0->1->2->3->0. the adjacency matrix looks like:

```

   0  1  2  3
0 [0, 1, 0, 1]
1 [1, 0, 1, 0]
2 [0, 1, 0, 1]
3 [1, 0, 1, 0]

```

### 2. Adjacency List

An adjacency list represents a graph as an array of linked lists.
The index of the array represents a vertex and each element in its linked list represents the other vertices that form an edge with the vertex.

#### Example:

```

Array -> LinkedList
  0   -> [1, 3]
  1   -> [0, 3]
  2   -> [1, 3]
  3   -> [0, 2]

```

