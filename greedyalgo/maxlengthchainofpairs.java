//Given:->  n no pairs , first no is alwyas smaller than second no
//Objective -> we have to find the longest chain from that set of pairs 
//condition -> we can add a new apir in chain if its strt no is gretaer than its previou ending no(no overllaping )(disjoint)
//this is similar to activity selection condition same no overallping
//we sort based on second no
//always selelct the pair fair because it finish fast in no line 
package greedyalgo;
import java.util.*;
public class maxlengthchainofpairs {
    public static void main(String[]args){
        // tc=0(nlogn)
        int pairs[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};

        Arrays.sort(pairs,Comparator.comparingDouble(o->o[1]));
        //sorting based on col 1 acc to sec no
        int chainlen=1;
        //1 always contain like prog 1 
        int pairend=pairs[0][1];//last selected end //chain end
        for (int i=1;i<pairs.length;i++){
            if(pairs[i][0]>pairend){
                chainlen++;
                pairend=pairs[i][1];
            }
        }
        System.out.println("max length of chain = "+chainlen);
    }
}
