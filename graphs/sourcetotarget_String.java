package graphs;

import java.util.ArrayList;

public class sourcetotarget_String {
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
    public static void pathfinder(ArrayList<info>graph[],int curr,int target,String str){
        if(curr==target){
            str=str+target;
            System.out.println(str);
            return ;
        }
        for(int i=0;i<graph[curr].size();i++){
             int neighbour=graph[curr].get(i).desti;
             pathfinder(graph, neighbour, target, str+curr);
        }
    }
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int v=7;
        ArrayList<info>[]graph=new ArrayList[v];
       for(int i=0;i<v;i++){
        graph[i]=new ArrayList<>();
       } 
        graph[0].add(new info(0, 3, 1));
       graph[2].add(new info(2, 3, 1));
       graph[3].add(new info(3, 1, 1));
       graph[4].add(new info(4, 1, 1)); 
       graph[5].add(new info(5, 0, 1)); 
       graph[5].add(new info(5, 2, 1)); 
        pathfinder(graph,5,1,"");
    }
}
