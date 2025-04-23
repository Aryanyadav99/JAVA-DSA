// (Deque refers to double ended queue but dequeue refers to removing something from quueue and enqueue refers adding something in queue
// in single ended queue all operation can be perform through single side but in doublue ended queue we can perfeom all operations fron both side 
// applying all opertions by jcf
//same as queue deque is also a interface
//addfirst means add from start or front 
//addlast means add from last same as normal queue
package queue;
import java.util.*;
public class deque {
    public static void main(String[]args){
        Deque<Integer> dq=new LinkedList<>();
        dq.addFirst(2);
      dq.addFirst(1);
      dq.add(9);
      dq.addLast(3);
      dq.addLast(4);
      System.out.println(dq);
      dq.removeFirst();
      System.out.println(dq);
      dq.removeLast();
      System.out.println(dq);
      dq.remove();
      System.out.println(dq);
      System.out.println(dq.getFirst()+" "+dq.getLast());
      System.out.println(dq.isEmpty());
      // here normal add and remove work as a normal queue
    }
   
}
