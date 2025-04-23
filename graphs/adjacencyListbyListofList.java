package graphs;
import java.util.ArrayList;

public class adjacencyListbyListofList
 {
    static class Edge{
        int source;
        int desti;
        int weight;
        public Edge(int source,int desti,int weight){
            this.source=source;
            this.desti=desti;
            this.weight=weight;
        }
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Edge>>al=new ArrayList<>();
        for(int i=0;i<5;i++){
            al.add(new ArrayList<>());
        }
        al.get(0).add(new Edge(0, 1, 5));
        al.get(1).add(new Edge(1,0,5));
        al.get(1).add(new Edge(1, 2, 1));
        //find all child of 1 
        for(int i=0;i<al.get(1).size();i++){
            System.err.println(al.get(1).get(i).desti);
        }
    }
}
