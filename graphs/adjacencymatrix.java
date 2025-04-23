package graphs;
import java.util.*;
public class adjacencymatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();// no of nodes 
        int e=sc.nextInt();// no of connections 
        int amatrix[][]=new int[v][v];// matrix having nodes *nodes space
        for(int i=0;i<e;i++){   // now we have to insert all the edges connection so loop goes till e
            int v1=sc.nextInt(); // str node
            int v2=sc.nextInt(); // end node
            amatrix[v1][v2]=1; // since our graph is non directional or bidirectional so we have to insert the edge form 1 to 0 and 0 to 1 both
            amatrix[v2][v1]=1;
        }
        for(int i=0;i<amatrix.length;i++){
            for(int j=0;j<amatrix[0].length;j++){
                System.out.print(amatrix[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
        
    }
}
