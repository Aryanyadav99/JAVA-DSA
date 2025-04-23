package graphs;

import java.util.*;
public class cycledirected{
    static class edge{
         int source;
         int desti;
         public edge(int source,int desti){
            this.source=source;
            this.desti=desti;
         }
    }
    public static boolean iscycle(ArrayList<edge>graph[]){
        boolean [] visited=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            boolean [] stackdata=new boolean[graph.length];
            if(!visited[i]){
                if(iscycleutil(graph,i,visited,stackdata)){
                    return true;
                }
            }
        }
        return false;
    }
          public static boolean iscycleutil(ArrayList<edge>graph[],int curr,boolean visited[],boolean stackdata[]){
           visited[curr]=true;
           stackdata[curr]=true;
           for(int i=0;i<graph[curr].size();i++){
            int neighbour=graph[curr].get(i).desti;
            if(visited[neighbour]){
               if(stackdata[neighbour]){
                return true;
               }
            }
            else{
                 if(iscycleutil(graph, neighbour, visited, stackdata)){
                    return true;
                 }
                }
           }
           stackdata[curr]=false;
           return false;
      }
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int v=4;
        ArrayList<edge>graph[]=new ArrayList[v];
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[2].add(new edge(2, 0));
        graph[1].add(new edge(1, 0));
        graph[2].add(new edge(2, 3));
        graph[3].add(new edge(3, 0));
        System.out.println(iscycle(graph));
    }
}
