package graphs;
// basically dijkshtra is an algo which is used to calculate the shortest distance of alll the nodes from the single source node 
// this is the process for abtainng the result in (v*v)+2E for adjacecy list or v'sqr time complexity for the all adjmatrix
//but the tc can further be optimised by converting the findmid into the the prioirity queue logic so can remove the vsqr by sorting the leapify with nlogn meatheod 
import java.util.*;
public class dijkstra_core {
     static class edge{
        @SuppressWarnings("unused")
        int source;
        int desti;
        int weight;
        public edge(int source,int desti,int weight){
            this.source=source;
            this.desti=desti;
            this.weight=weight;
        }
    }
    
    public static int findmidis(boolean[]visited,int []dis){
        int min=Integer.MAX_VALUE;
        int val=-1;
        for(int i=0;i<dis.length;i++){
            if(!visited[i] && dis[i]<min){
                min=dis[i];
                val=i;
            }
        }
        return val;
    }
    public static void shortestpath(ArrayList<edge>graph[],int source){
       int []distance=new int[graph.length];
       boolean[]visited=new boolean[graph.length];
       for(int i=0;i<graph.length;i++){
        distance[i]=Integer.MAX_VALUE;
       }
       distance[source]=0;
       for(int i=0;i<graph.length;i++){
          int curr=findmidis(visited,distance);
          if(curr==-1){
            break;
          }// that means we are unable to reach at component means if all nodes are visited or unreachable then return -1 ,so we cannot tak visited[-1] out of bound error!! so break before it ;
          visited[curr]=true;
         for(int j=0;j<graph[curr].size();j++){
              int neighbour=graph[curr].get(j).desti;
                if(!visited[neighbour]){
                   int weight=graph[curr].get(j).weight+distance[curr];
                    if(weight<distance[neighbour]){
                      distance[neighbour]=weight;
                    }
                }

            }
        }
        for(int i=0;i<distance.length;i++){
            System.out.println(distance[i]);
        }

    }
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
