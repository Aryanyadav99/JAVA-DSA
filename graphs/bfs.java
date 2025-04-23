package graphs;
import java.util.*;

public class bfs {
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
       boolean visit[]=new boolean[v];
       q.add(0);
       while(!q.isEmpty()){
        int curr=q.remove();
        if(!visit[curr]){
            System.out.println(curr+" ");
            visit[curr]=true;
            for(int i=0;i<graph[curr].size();i++){
                q.add(graph[curr].get(i).desti);
            }
        }
       }
    }
}
