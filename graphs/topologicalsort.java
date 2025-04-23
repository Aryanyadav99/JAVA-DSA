package graphs;
import java.util.*;
public class topologicalsort {
    static class info{
        int source;
        int desti;
        int weight;
        public info(int source,int desti,int weight){
            this.source=source;
            this.desti=desti;
            this.weight=weight;
        }
    }
        public static void toposort(ArrayList<info>graph[]){
            boolean visit[]=new boolean[graph.length];
            Stack<Integer>s =new Stack<>();
            for(int i=0;i<graph.length;i++){
                if(!visit[i]){
                    toposortutil(graph,i,visit,s);
                }
            }
            while(!s.isEmpty()){
                System.out.println(s.pop());
            }
        }
        public static void toposortutil(ArrayList<info>graph[],int curr,boolean visit[],Stack<Integer>s){
            visit[curr]=true;
            for(int i=0;i<graph[curr].size();i++){
                int neighbour=graph[curr].get(i).desti;
                if(!visit[neighbour]){
                    toposortutil(graph, neighbour, visit, s);
                }
            }
            s.push(curr);
        }
        @SuppressWarnings("unchecked")
        public static void main(String[] args) {
        int v=7;
        ArrayList<info>[]graph=new ArrayList[v];
       for(int i=0;i<v;i++){
        graph[i]=new ArrayList<>();
       } 
       graph[0].add(new info(0, 1, 1)); // 0 -> 1
       graph[0].add(new info(0, 2, 1)); // 0 -> 2
       graph[1].add(new info(1, 3, 1)); // 1 -> 3
       graph[2].add(new info(2, 4, 1)); // 2 -> 4
       graph[3].add(new info(3, 4, 1)); // 3 -> 4
       graph[3].add(new info(3, 5, 1)); // 3 -> 5
       graph[4].add(new info(4, 5, 1)); // 4 -> 5
       graph[5].add(new info(5, 6, 1)); // 5 -> 6
       toposort(graph);
}
    
}
