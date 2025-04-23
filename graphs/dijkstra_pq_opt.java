package graphs;
import java.util.*;
public class dijkstra_pq_opt {
    static class edge{
        int source;
        int desti;
        int weight;
        public edge(int source,int desti,int weight){
            this.source=source;
            this.desti=desti;
            this.weight=weight;
        }
    }
    static class info implements Comparable<info>{// sort the pq on bases of paths
        int n;
        int path;
        public info(int n,int path){
            this.n=n;
            this.path=path;
        }
        @Override
        public int compareTo(info i2){
            return this.path-i2.path;
        }
    }
    
    public static void shortestpath(ArrayList<edge>graph[],int src){
         int path[]=new int[graph.length];
         boolean visited[]=new boolean[graph.length];
         PriorityQueue<info>pq=new PriorityQueue<>();
         for(int i=0;i<graph.length;i++){
            if(i!=src){
                path[i]=Integer.MAX_VALUE;
            }
         }
         pq.add(new info(src, 0));
         // find neighbour
         while(!pq.isEmpty()){
            info curr=pq.remove();
            if(!visited[curr.n]){
                visited[curr.n]=true;
              for(int i=0;i<graph[curr.n].size();i++){
                edge neighbour=graph[curr.n].get(i);
                int source=neighbour.source;
                int desti=neighbour.desti;
                int weight=neighbour.weight;
                if(path[source]+weight<path[desti]){
                    path[desti]=path[source]+weight;
                    pq.add(new info(desti, path[desti]));
                }
              }
            }
         }
         for(int i=0;i<path.length;i++){
            System.out.println(path[i]);
         }
    }
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int v=6;
        ArrayList<edge>graph[]=new ArrayList[v];
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new edge(0, 1, 2));
        graph[0].add(new edge(0, 2, 4));
        graph[1].add(new edge(1, 2, 1));
        graph[1].add(new edge(1, 3, 7));
        graph[2].add(new edge(2,4,3));
        graph[3].add(new edge(3, 5, 1));
        graph[4].add(new edge(4, 3, 2));
        graph[4].add(new edge(4,5,5));
        int src=0;
        shortestpath(graph,src);

    }
}
