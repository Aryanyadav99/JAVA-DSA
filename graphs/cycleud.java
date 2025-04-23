package graphs;

import java.util.ArrayList;


public class cycleud {
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
     public static boolean iscycle(ArrayList<info>[]graph,int v){
        boolean visited[]=new boolean[v];
        for(int i=0;i<v;i++){
            if(!visited[i]){
                if(iscycleutil(graph,i,i,visited)){
                    return true;
                }
            }
        }
        return false;
     }
    public static boolean iscycleutil(ArrayList<info>[]graph,int source,int parent,boolean[]visited){
        visited[source]=true;
        for(int i=0;i<graph[source].size();i++){
            int neighbour=graph[source].get(i).desti;
            if(visited[neighbour]){
                if(parent!=neighbour){
                    return true;
                }
            }
            else{
                if(iscycleutil(graph, neighbour, source, visited)){
                    return true;
                }
            }
        }
        return false;
    }
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int v=7;
        ArrayList<info>[]graph=new ArrayList[v];
       for(int i=0;i<v;i++){
        graph[i]=new ArrayList<>();
       } 
   
    graph[0].add(new info(0, 1, 1)); // 0 -> 1
    graph[1].add(new info(1, 0, 1)); // 1 -> 0
    
    graph[0].add(new info(0, 2, 1)); // 0 -> 2
    graph[2].add(new info(2, 0, 1)); // 2 -> 0
    
    graph[1].add(new info(1, 3, 1)); // 1 -> 3
    graph[3].add(new info(3, 1, 1)); // 3 -> 1
    
    graph[2].add(new info(2, 4, 1)); // 2 -> 4
    graph[4].add(new info(4, 2, 1)); // 4 -> 2
    
    graph[3].add(new info(3, 5, 1)); // 3 -> 5
    graph[5].add(new info(5, 3, 1)); // 5 -> 3
    
   // graph[4].add(new info(4, 5, 1)); // 4 -> 5
   // graph[5].add(new info(5, 4, 1)); // 5 -> 4
    
    graph[5].add(new info(5, 6, 1)); // 5 -> 6
    graph[6].add(new info(6, 5, 1)); // 6 -> 5
    
      boolean ans=iscycle(graph, v);
      System.out.println(ans);
    }
}
