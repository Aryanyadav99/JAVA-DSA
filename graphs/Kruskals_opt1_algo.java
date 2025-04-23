// not the most optimal but better one than prev one 
// more optimisation done path compression 
// in this code we have to move entire parent array and one rank array so rank array make the mst in every step in balanced format so it time complexity beacome 0(logv)
//but using this compression we can done it in constatny time
package graphs;

import java.util.Arrays;
import java.util.Scanner;

public class Kruskals_opt1_algo{
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
        int [] rank=new int[v];
        Arrays.fill(rank, 0);
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
            int p1=findparent(parent,v1); //0(logv)
            int p2=findparent(parent,v2); //0(logv)
            if(p1!=p2){
                mst[count++]=new edge(v1, v2, weight);
              if(rank[p1]>rank[p2]){
                parent[p2]=p1;
              }
              else if(rank[p1]<rank[p2]){
                parent[p1]=p2;
              }
              else {
                parent[p1]=p2;
                rank[p2]++;
              }
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
//0(eloge+e*2logv)
//0(v2logv2+v2*2logv)
//o(v2logv2+v2logv)
//O(v2logv) ----


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
