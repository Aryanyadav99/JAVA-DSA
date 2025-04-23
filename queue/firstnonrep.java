//objective :-> find all first non repeating letter in a  streams of string have continous characters
// use a freqency(count) array size 26 FOR a to z and all index tracking how many times ot repeating
//put a character in stream formtat in queue check front freq is lessthan or equal; to 1 ;
//if we add any at queue then must increae frequency if front is not first non repettaive then pop it out 
//if q become empty for a insatnt print -1 AS a result
package queue;
import java.util.*;
public class firstnonrep {
    public static void main(String[]args){
        String str="aabccxb";
        int frq[]=new int[26];//for char a to z all
        Queue<Character> q=new LinkedList<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            q.add(ch);
            frq[ch-'a']++;
            //formula for increment right index value gave result acoording to aaascii value
            //now check if that char have vlue 1 or less then print it otherwise pop it
            while(!q.isEmpty()&& frq[q.peek()-'a']>1){
                //jab tak hamari queue kkhali nhi ho jati tab tak ham chechk frq if frq is >1 then its a repeatitng char so remove it
                q.remove();
            }
            if(q.isEmpty()){
                System.out.println("-1");
            }
            else{
                System.out.println(q.peek());
            }

        }
    }
}
// noob best tc approach in leet code done by me

