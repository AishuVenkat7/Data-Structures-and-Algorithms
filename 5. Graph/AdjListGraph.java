import java.util.*;

public class AdjListGraph {

    // Array of List
    private LinkedList<Integer>[] adj;
    private int V; // number of vertices
    private int E; // number of edges

    public AdjListGraph(int nodes) {
        this.V = nodes;
        this.E = 0;
        this.adj = new LinkedList[nodes];
        // initializing new list inside each array
        for (int v = 0; v < V; v++) {
            adj[v] = new LinkedList<>();
        }
    }

    public void addEdge(int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
        E++;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(V + " vertices, " + E + " edges " + "\n");
        for (int v = 0; v < V; v++) {
            sb.append(v + ": ");
            for (int w : adj[v]) {
                sb.append(w + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public void bfs(int s) {
        boolean[] visited = new boolean[V];

        Queue<Integer> q = new LinkedList<>();
        visited[s] = true;
        // s - source node
        q.offer(s);

        while (!q.isEmpty()) {
            int u = q.poll();
            System.out.print(u + " ");

            for (int v : adj[u]) {
                if (!visited[v]) {
                    visited[v] = true;
                    q.offer(v);
                }
            }
        }
    }

    // Note: In the iterative DFS, you are using a stack, which
    // follows Last In First Out (LIFO). The order of pushing
    // neighbors onto the stack affects the order of traversal
    // because the most recently added node is visited first.
    // In the recursive DFS, the nodes are processed in the order
    // they appear in the adjacency list. This is equivalent to
    // pushing nodes onto the stack in that same order during recursion.

    // Note: To make the iterative DFS behave more like the
    // recursive DFS, you should reverse the order of the neighbors
    // when you push them onto the stack. This will ensure that the
    // first neighbor is processed first (mimicking the recursive function call
    // order).

    // iterative - different from recursion
    public void dfs(int s) {
        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        stack.push(s);

        while (!stack.isEmpty()) {
            int u = stack.pop();
            if (!visited[u]) {
                visited[u] = true;
                System.out.print(u + " ");

                for (int v : adj[u]) {
                    if (!visited[v]) {
                        stack.push(v);
                    }
                }
            }
        }
    }

    // recursion
    public void dfs() {
        boolean[] visited = new boolean[V];
        for (int v = 0; v < V; v++) {
            if (!visited[v]) {
                dfs(v, visited);
            }
        }
    }

    // recursion
    public void dfs1(int start) {
        boolean[] visited = new boolean[V]; // To track visited nodes
        System.out.print("Recursive DFS traversal starting from node " + start + ": ");
        dfs(start, visited);
    }

    private void dfs(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");
        for (int w : adj[v]) {
            if (!visited[w]) {
                dfs(w, visited);
            }
        }
    }

    // iterative same as recursive method
    public void dfs2(int s) {
        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        stack.push(s);

        while (!stack.isEmpty()) {
            int u = stack.pop();
            if (!visited[u]) {
                visited[u] = true;
                System.out.print(u + " ");

                // To match the recursive DFS, we reverse the neighbor list before pushing
                List<Integer> neighbors = new ArrayList<>(adj[u]);
                Collections.reverse(neighbors); // Reverse the neighbor list

                for (int v : neighbors) {
                    if (!visited[v]) {
                        stack.push(v);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        AdjListGraph g = new AdjListGraph(5);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 0);
        g.addEdge(2, 4);
        g.bfs(0); // op: 0 -> 1 -> 3 -> 2 -> 4
        System.out.println(g);
        // iterative
        g.dfs(0); // op: 0 -> 3 -> 2 -> 4 -> 1
        // recursive
        g.dfs();
        // recursive
        g.dfs1(0);
    }
}