package graphs;
import java.util.*;
public class adjacencylist {
    static class edge{
        int source;
        int desti;
        int weight;
        public edge(int source,int desti,int weight){
            this.source=source;
            this.desti=desti;
            this.weight=weight;
        }
        //In Java, you cannot directly create arrays of generic types (like ArrayList<Edge>[]). This is because of something called type erasure thtas why vsd give yellow line means warning 
        // for removing this warning we use supress warning annotation 
        // annotaion helps to tranfer instruction to the compiler
        //supresswarnings means ignore the warning  
        @SuppressWarnings("unchecked")
        public static void main(String[] args) {
            int v=5;
            ArrayList<edge> alist[]=new ArrayList[v];// now every index store null for making then a space we have to intilise every value as arraylist
            //null->empty Arraylist
            for(int i=0;i<v;i++){
                alist[i]=new ArrayList<>();
            }
            // form graph 
            // for 0
            alist[0].add(new edge(0,1,5));
            // for 1
            alist[1].add(new edge(1, 0, 5));
            alist[1].add(new edge(1, 2, 1));
            alist[1].add(new edge(1, 3, 3));
            // for 2
            alist[2].add(new edge(2, 1, 1));
            alist[2].add(new edge(2, 3, 1));
            alist[2].add(new edge(2, 4, 2));
            // for 3
            alist[3].add(new edge(3, 2, 1));
            alist[3].add(new edge(3, 1, 3));
            // for 4
            alist[4].add(new edge(4, 2, 2));

            // find the neighbours of 2
            for(int i=0;i<alist[2].size();i++){
                System.out.println(alist[2].get(i).desti +" ");
            }
        }
    }
}
