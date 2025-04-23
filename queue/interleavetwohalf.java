// interleave -> jaisde moti rassi banti hai kuch patli rassi interleave karke
//objective -> interleave 2 half of a queen (even lenght)
//eg -> q=1 2 3 4 5 . 6 7 8 9 10
//output   1 6 2 7 3 8 4 9 5 10
//easily can be done by making a new queue and store frist half and add on a new quee 
//for division in half amke size /2;
// ** new ka frist utaho org que me add kar do then org que ka first uthao then again org quue me add kar do 
package queue;
import java.util.*;
public class interleavetwohalf {
    public static void main(String[]args){
        Queue<Integer>oq=new LinkedList<>();
        Queue<Integer>tq=new LinkedList<>();
        oq.add(1);
        oq.add(2);
        oq.add(3);
        oq.add(4);
        oq.add(5);
        oq.add(6);
        oq.add(7);
        oq.add(8);
        //og - orginal queue  tq -temporary queue
        int newsize=oq.size()/2;
        while(oq.size()!=newsize){
             tq.add(oq.remove());
        }
        //two half queues made successfully 
        // now interleave the orginal queue with tq;
        while(!tq.isEmpty()){
            oq.add(tq.remove());
            oq.add(oq.remove());
        }
        while(!oq.isEmpty()){
            System.out.println(oq.remove());
        }

    }
}
