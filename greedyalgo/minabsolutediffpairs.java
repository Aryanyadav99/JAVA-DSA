//ABSOLUTE DIFF -> |A-B| =A-B=B-A; absolute value is alwayas positive we remove -ve sign
//given -> two array are given with equal length 
//objective-> we have to pair elemnts such that sum s of absolute diff of all pair is min
//the minimest diff is goes till 0;
//greedy approach:-> if two no are more closer to themselve then absolute diff is more min so choose no thtas is more closer to that no
// sorting on both occur first becuase we want overall global min
//so compare with same index with min diff|
package greedyalgo;
 import java.util.*;
public class minabsolutediffpairs {
    public static void main(String[]args){
        int a[]={1,2,3};
        int b[]={2,1,3};
        Arrays.sort(a);
        Arrays.sort(b);
        int mindiff=0;//to sum the diff
        for(int i=0;i<a.length;i++){
          mindiff=mindiff+Math.abs(a[i]-b[i]);
          //thiis makes our diff absolute
        }
        System.out.println("the min absolute diff is " +mindiff);
    }
}
