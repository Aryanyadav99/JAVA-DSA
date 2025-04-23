package graphs;

import java.util.*;

public class bfs2 {
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
       Queue<Integer>q=new LinkedList<>();
       q.add(0);
       boolean isVisited[]=new boolean[v];
       isVisited[0]=true;
       while(!q.isEmpty()){
        int val=q.remove();
        System.out.println(val);
        //value ke sare neighbour trace karo 
        for(int i=0;i<graph[val].size();i++){
            int neighbour=graph[val].get(i).desti;
             if(!isVisited[neighbour]){
                q.add(neighbour);
                isVisited[neighbour]=true;
             }
        }
       }
    }
}
