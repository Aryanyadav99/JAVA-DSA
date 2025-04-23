package graphs;
import java.util.*;

// here we have to detect cyccle in directed graph through khans algo 
// for the dcg there is not any topo sort so that must our ans have some less elemnt 
//so we have to check that of countedans!=n means its always less than n so that refers the cycle exist 
public class detect_cycle_kahns {
    static class Edge {
        int dest;
        public Edge(int dest) {
            this.dest = dest;
        }
    }

    public static void findIndegree(List<Edge>[] graph, int[] indegree) {
        for (int i = 0; i < graph.length; i++) {
            for (Edge edge : graph[i]) {
                indegree[edge.dest]++;
            }
        }
    }

    public static void toposort(List<Edge>[] graph) {
        int n = graph.length;
        int[] indegree = new int[n];
        findIndegree(graph, indegree);

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) {
                queue.add(i);
            }
        }

        int processedCount = 0;
        while (!queue.isEmpty()) {
            int curr = queue.remove();
            System.out.print(curr + " ");
            processedCount++;
            for (Edge edge : graph[curr]) {
                indegree[edge.dest]--;
                if (indegree[edge.dest] == 0) {
                    queue.add(edge.dest);
                }
            }
        }

        // Check for cycles
        if (processedCount != n) {
            System.out.println("\nThe graph contains a cycle. Topological sort is not possible.");
        }
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int v = 7;
        List<Edge>[] graph = new ArrayList[v];
        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(1)); // 0 -> 1
        graph[0].add(new Edge(2)); // 0 -> 2
        graph[1].add(new Edge(3)); // 1 -> 3
        graph[2].add(new Edge(4)); // 2 -> 4
        graph[3].add(new Edge(4)); // 3 -> 4
        graph[3].add(new Edge(5)); // 3 -> 5
        graph[4].add(new Edge(5)); // 4 -> 5
        graph[5].add(new Edge(6)); // 5 -> 6

        toposort(graph);
    }
}
