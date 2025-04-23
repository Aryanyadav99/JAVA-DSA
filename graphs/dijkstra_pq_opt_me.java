package graphs;
// basically dijkshtra is an algo which is used to calculate the shortest distance of alll the nodes from the single source node 
// this is the process for abtainng the result in v*v+2E for adjacecy list or v'sqr time complexity for the all adjmatrix
//but the tc can further be optimised by converting the findmid into the the prioirity queue logic so can remove the vsqr by sorting the leapify with nlogn meatheod 
import java.util.*;
public class dijkstra_pq_opt_me {
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
     static class info implements Comparable<info>{
        int node;
        int dis;
        public info(int node,int dis){
            this.node=node;
            this.dis=dis;
        }
        @Override
        public int compareTo(info i2){
           return this.dis-i2.dis;
        }
    }
    public static void shortestpath(ArrayList<edge>graph[],int source){
       int []distance=new int[graph.length];
       boolean[]visited=new boolean[graph.length];
       for(int i=0;i<graph.length;i++){
        distance[i]=Integer.MAX_VALUE;
       }
       distance[source]=0;
       PriorityQueue<info>pq=new PriorityQueue<>();
       pq.add(new info(source, 0));
        while(!pq.isEmpty()){
            info i=pq.remove();
          int curr=i.node;
          if(!visited[curr]){
            visited[curr]=true;
          }
         for(int j=0;j<graph[curr].size();j++){
              int neighbour=graph[curr].get(j).desti;
                if(!visited[neighbour]){
                   int weight=graph[curr].get(j).weight+distance[curr];
                    if(weight<distance[neighbour]){
                      distance[neighbour]=weight;
                      pq.add(new info(neighbour, distance[neighbour]));
                    }
                }

            }
        }
        for(int i=0;i<distance.length;i++){
            System.out.println(distance[i]);
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
