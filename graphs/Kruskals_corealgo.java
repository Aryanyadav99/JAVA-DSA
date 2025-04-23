// not the most optimal but better one 
// more optimisation done by parent by rank 
// in this code we have to move entire parent array if our parent are skewed so overall tc for it 0(v)
//but using this union rank algo we can traverse the array through 0(logn) beacuse it continously convert skewed to balanced
package graphs;

import java.util.Arrays;
import java.util.Scanner;

public class Kruskals_corealgo{
    static class edge implements Comparable<edge>{
        int vertex1;
        int vertex2;
        int weight;
        public edge(int v1,int v2,int weight){
            this.vertex1=v1;
            this.vertex2=v2;
            this.weight=weight;
        }
        @Override
        public int compareTo(edge e2){
            return this.weight-e2.weight;
        }
    }
    public static int findparent(int []parent,int v){
        if(parent[v]==v){
            return v;
        }
        return findparent(parent, parent[v]);

    }
    public static edge[] kruskal(edge[]Edge,int v,int e){
        edge[]mst=new edge[v-1];
        int[] parent =new int[v];
        for(int i=0;i<parent.length;i++){
            parent[i]=i;
        }
        Arrays.sort(Edge); //o(eloge)
        int count=0;
        for(int i=0;i<Edge.length;i++){ //o(e)
            if(count==v-1){
               break;
            }
            edge ed=Edge[i];
            int v1=ed.vertex1;
            int v2=ed.vertex2;
            int weight=ed.weight;
            int p1=findparent(parent,v1); //0(v)
            int p2=findparent(parent,v2); //0(v)
            if(p1!=p2){
               mst[count++]=new edge(v1, v2, weight);
               parent[p1]=p2;
            }
        }
        return mst;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        int e=sc.nextInt();
        edge[]Edge=new edge[e];
        for(int i=0;i<e;i++){
           int v1=sc.nextInt();
           int v2=sc.nextInt();
           int weight=sc.nextInt();
           Edge[i]=new edge(v1, v2, weight);
        }
        edge[]mst=kruskal(Edge,v,e);
        for(int i=0;i<mst.length;i++){
            edge ed=mst[i];
            int v1=ed.vertex1;
            int v2=ed.vertex2;
            int weight=ed.weight;
            System.out.println( v1+" "+v2+" "+weight);
        }
        sc.close();
    }
    
}
//tc
//0(eloge+e*2v)
//0(v2logv2+v2*2v)
//o(v2logv2+v3)
//O(v3) ----final tc which is bad we can convert it to 0(v2logv)thriugh rank mehtod


// 6 11
// 0 1 1
// 0 2 5
// 0 3 4
// 1 3 3
// 2 4 8
// 3 5 6
// 3 4 7
// 4 5 2
// 1 2 6
// 2 5 9
// 2 3 10
