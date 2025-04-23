package graphs;

import java.util.Arrays;
import java.util.Scanner;

public class floydwarshall {
    public static void shortestDistance(int[][] mat) {
        // Code here
        int n=mat.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==-1){
                    mat[i][j]=Integer.MAX_VALUE;
                }
            }
        }
        for(int via=0;via<n;via++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                  if((mat[i][via]!=Integer.MAX_VALUE) && (mat[via][j]!=Integer.MAX_VALUE)){
                       mat[i][j]=Math.min(mat[i][j],(mat[i][via]+mat[via][j]));
                  }
                }
            } 
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==Integer.MAX_VALUE){
                    mat[i][j]=-1;
                }
            }
        }
    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();// no of nodes 
        int e=sc.nextInt();// no of connections 
        int matrix[][]=new int[v][v];// matrix having nodes *nodes space
        for (int i = 0; i < v; i++) {
            Arrays.fill(matrix[i], -1);
        }
        for (int i = 0; i < v; i++) {
            matrix[i][i] = 0;
        }
        for(int i=0;i<e;i++){   // now we have to insert all the edges connection so loop goes till e
            int v1=sc.nextInt(); // str node
            int v2=sc.nextInt(); // end node
            int weight=sc.nextInt();
            matrix[v1][v2]=weight; 
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
         shortestDistance(matrix);
         for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
