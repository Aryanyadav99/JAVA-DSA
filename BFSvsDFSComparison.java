import java.util.*;

public class BFSvsDFSComparison {
    static class Graph {
        private int vertices; // Number of vertices
        private LinkedList<Integer>[] adjList; // Adjacency List

        Graph(int vertices) {
            this.vertices = vertices;
            adjList = new LinkedList[vertices];
            for (int i = 0; i < vertices; i++) {
                adjList[i] = new LinkedList<>();
            }
        }

        // Add an edge to the graph
        void addEdge(int src, int dest) {
            adjList[src].add(dest);
            adjList[dest].add(src); // Undirected Graph
        }

        // BFS Implementation
        void bfs(int start) {
            boolean[] visited = new boolean[vertices];
            Queue<Integer> queue = new LinkedList<>();
            queue.add(start);
            visited[start] = true;

            while (!queue.isEmpty()) {
                int node = queue.poll();
                for (int neighbor : adjList[node]) {
                    if (!visited[neighbor]) {
                        visited[neighbor] = true;
                        queue.add(neighbor);
                    }
                }
            }
        }

        // DFS Implementation (Recursive)
        void dfsRecursive(int start, boolean[] visited) {
            visited[start] = true;
            for (int neighbor : adjList[start]) {
                if (!visited[neighbor]) {
                    dfsRecursive(neighbor, visited);
                }
            }
        }

        // DFS Wrapper
        void dfs(int start) {
            boolean[] visited = new boolean[vertices];
            dfsRecursive(start, visited);
        }
    }

    public static void main(String[] args) {
        int V = 10000; // Large number of nodes to compare performance
        Graph graph = new Graph(V);

        // Creating a random sparse graph
        Random rand = new Random();
        for (int i = 0; i < V - 1; i++) {
            graph.addEdge(i, i + 1);
            if (rand.nextBoolean()) {
                graph.addEdge(i, rand.nextInt(V));
            }
        }

        // Measure BFS time
        long startTime = System.nanoTime();
        graph.bfs(0);
        long endTime = System.nanoTime();
        System.out.println("BFS Execution Time: " + (endTime - startTime) / 1e6 + " ms");

        // Measure DFS time
        startTime = System.nanoTime();
        graph.dfs(0);
        endTime = System.nanoTime();
        System.out.println("DFS Execution Time: " + (endTime - startTime) / 1e6 + " ms");
    }
}
