// this is bellman ford algo 
//upgraded version of dijkstra
//as we know dijkstra fail at -ve edges and also for -ve cycle it gave use tle beacuse the path distance is contii reduces 
// but bellman ford work for -ve edges and also we can detect the -ve cycle through bellman ford  
package graphs;
import java.util.*;
public class bellmanford {
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
      public static void shortestpath(ArrayList<edge>graph[],int src){
        int distance[]=new int[graph.length];
        Arrays.fill(distance, Integer.MAX_VALUE); 
        distance[src]=0;
        for(int i=0;i<graph.length-1;i++){
            // let a graoph 0-1-2-3-4 edge 3,4 - 2,3 - 1,2 - 0,1 four edges 
            // itertatie over n-1 times beacuse there is a case when src is at last edge  and we have to use the src distnace first to update the other to chnage from infinty 
            // in first iteration we have to for complete down for getting the 1 dis through 0 
            // in second i find the distnace of 2 through 1 beacuse other then 0 and 1 are infinty 
            // in third i find distance of 3 through 2 
            // in fourth i find dis of 4 htough 3 
            //in four iteration we got the required (n-1)
            
            //find all edges 
            //tc -0(n*e)  e may goes to n2  so there we got cubic typ tc for matix 
            //in dikstra there is only square type tc so dikstra better but for -ve edges we have to use bellman ford 
            for(int j=0;j<graph.length;j++){
                for(int k=0;k<graph[j].size();k++){
                   edge e=graph[j].get(k);
                   int source=e.source;
                   int desti=e.desti;
                   int weight=e.weight;
                   //does the relaxation process for every edge 
                   if(distance[source]!=Integer.MAX_VALUE && distance[source]+weight<distance[desti]){
                    // first check integer max reason -- crazy infinty problem 
                      distance[desti]=distance[source]+weight;
                   }
                }
            }
            
        }
        //print the output 
        for(int i=0;i<distance.length;i++){
           System.out.println(distance[i]);     
        }

        // check for -ve cycle 
        // we can perform one more relaxation 
        // if cycle exist then our graph alter more and more 
        // if not then realation is already complete previously 
        for(int j=0;j<graph.length;j++){
            for(int k=0;k<graph[j].size();k++){
               edge e=graph[j].get(k);
               int source=e.source;
               int desti=e.desti;
               int weight=e.weight;
               //does the relaxation process for every edge 
               if(distance[source]!=Integer.MAX_VALUE && distance[source]+weight<distance[desti]){
                 System.out.println("cycle exist");
                 return ;
               }
            }
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
        graph[1].add(new edge(1, 2, -1));
        graph[1].add(new edge(1, 3, 7));
        graph[2].add(new edge(2,4, -3));
        graph[3].add(new edge(3, 5, 1));
        graph[4].add(new edge(4, 3, 2));
        graph[4].add(new edge(4,5,-5));
        int src=0;
       shortestpath(graph,src);
        
    }
}