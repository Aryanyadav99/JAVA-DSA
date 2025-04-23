package heaps;
import java.util.*;
public class priorityqueuejcf {
  public static void main(String[]args){
    PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
    // comparator reverse is for the reverse the priority(reverse the logic) for the desc order priority 
    pq.add(3);
    pq.add(4);
    pq.add(1);
    pq.add(7);
    while(!pq.isEmpty()){
        System.out.println(pq.peek());
        pq.remove();
    }
  }  
}
