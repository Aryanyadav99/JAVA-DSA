package graphs;

import java.util.*;
public class nonconnected {
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
    public static void dfs(ArrayList<info>graph[],int v){
        boolean []visit=new boolean[v];
        for(int i=0;i<v;i++){
            if(!visit[i]){
                dfsutil(graph,i,visit);
            }
        }
    }
    public static void dfsutil(ArrayList<info>graph[],int curr,boolean visit[]){
            visit[curr]=true;
            System.out.println(curr);
            for(int i=0;i<graph[curr].size();i++){
                int neighbour=graph[curr].get(i).desti;
                if(!visit[neighbour]){
                    dfsutil(graph, neighbour, visit);
                }
            }
    }
    public static void bfs(ArrayList<info>graph[],int v){
        boolean visit[]=new boolean[v];
       for(int i=0;i<v;i++){
               if(!visit[i]){
                 bfsutil(graph,i,visit);
               }
       }
    }
    public static void bfsutil(ArrayList<info>graph[],int curr,boolean visit[]){
        Queue<Integer>q=new LinkedList<>();
        if(!visit[curr]){
            q.add(curr);
        }
        while(!q.isEmpty()){
            int ele=q.remove();
            visit[ele]=true;
            System.out.println(ele);
            for(int i=0; i<graph[ele].size();i++){
               if(!visit[graph[ele].get(i).desti]){
                q.add(graph[ele].get(i).desti);
               }
            }
        }
    }
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int v=7;
        ArrayList<info>[]graph=new ArrayList[v];
       for(int i=0;i<v;i++){
        graph[i]=new ArrayList<>();
       } 
       graph[0].add(new info(0, 1, 1));
       graph[0].add(new info(0, 2, 1));
       graph[1].add(new info(1, 0, 1));
       graph[1].add(new info(1, 3, 1));
       graph[2].add(new info(2,0,1));
       graph[2].add(new info(2,4,1));
       graph[3].add(new info(3, 1, 1));
       graph[3].add(new info(3, 4, 1));
       graph[3].add(new info(3, 5, 1));
       graph[4].add(new info(4, 2, 1));
       graph[4].add(new info(4, 3, 1));
       graph[4].add(new info(4, 5, 1));
       graph[5].add(new info(5, 3, 1));
       graph[5].add(new info(5, 4, 1));
       graph[5].add(new info(5, 6, 1));
       graph[6].add(new info(6, 5, 1));
       dfs(graph,v);
    }
}
