package graphs;
// in prev code i not used visited array but we have to use it there also beacuse if graph has the cycle then there are chances for infinte recursion tends to stackoverflow 
// so hwew we have to visit thw array but after removing from the list we also have to remove from the visited beacuse if we not did that then no way to get all path 
// ans why we remove beacuse for each path from source to desti in single way then after removing from list it acted as a newly node
import java.util.ArrayList;

public class sourcetotarget_List {
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
    public static void pathfinder(ArrayList<info>graph[],int source,int desti,ArrayList<Integer>al,ArrayList<ArrayList<Integer>>ans,boolean []visited){
       if(source==desti){
        al.add(source);
        ans.add(new ArrayList<>(al));
        visited[source]=false;
        al.remove(al.size()-1);
        return ;
       }
       int curr=source;
       visited[curr]=true;
       al.add(curr);
       for(int i=0;i<graph[curr].size();i++){
        int neighbour=graph[curr].get(i).desti;
         pathfinder(graph, neighbour, desti, al, ans,visited);
       }
       visited[curr]=false;
       al.remove(al.size()-1);
       
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
       ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
       boolean[]visited=new boolean[v];
        pathfinder(graph,5,3,new ArrayList<>(),ans,visited);
        for(int i=0;i<ans.size();i++){
           System.out.println(ans.get(i));
        }
        
    }
}
