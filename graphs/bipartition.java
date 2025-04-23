package graphs;

import java.util.*;

public class bipartition {
    static class Info{
        int source;
        int desti;
        int weight;
        public Info(int source,int desti,int weight){
            this.source=source;
            this.desti=desti;
            this.weight=weight;
        }
    }
    public static boolean isbipart(ArrayList<Info>graph[],int v){
        int color[]=new int[v];
        for(int i=0;i<v;i++){
            color[i]=-1;
        }
        for(int i=0;i<v;i++){
            if(color[i]==-1){
                if(!isbipartutil(graph,i,color,-1)){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isbipartutil(ArrayList<Info>graph[],int current,int color[],int parent){
        Queue<Integer>q=new LinkedList<>();
        color[current]=0;
        q.add(current);
        while(!q.isEmpty()){
            int curr=q.remove();
            for(int i=0;i<graph[curr].size();i++){
                int neighbour=graph[curr].get(i).desti;
                //case1
                if(color[neighbour]==-1){
                    if(color[curr]==0){
                        color[neighbour]=1;
                    }
                    else{
                        color[neighbour]=0;
                    }
                    q.add(neighbour);
                }
                // case 2 
                if(color[neighbour]!=-1){
                    if(color[neighbour]==color[curr]){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
         int v=5;
        ArrayList<Info>[]graph=new ArrayList[v];
       for(int i=0;i<v;i++){
        graph[i]=new ArrayList<>();
       } 
      graph[0].add(new Info(0, 1, 1));
      graph[0].add(new Info(0, 2, 1));
      graph[1].add(new Info(1, 0, 1)) ; 
      graph[1].add(new Info(1, 3, 1)) ;
      graph[2].add(new Info(2, 0, 1)); 
      graph[2].add(new Info(2, 4, 1));
      graph[3].add(new Info(3, 1, 1)) ; 
    //  graph[3].add(new Info(3, 4, 1));
      graph[4].add(new Info(4, 2, 1));
     // graph[4].add(new Info(4, 3, 1));
      boolean ans= isbipart(graph, v);
      System.out.println(ans);
    }
}
