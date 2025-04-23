package queue;
import java.util.*;
public class queuejcf {
   public static void main(String []args){
    // queue is not a class its generally a interface so we cannt make direct object for it 
    //thats why we have to implement object of queue by Linked list or Array Deque class
     Queue<Integer>q=new LinkedList<>();
 // we can use ArrayDeque intesdof linkedlist in this object other thing are same 
  //the only differnece is t 
  //q.clear(); is used to clear the complete queue
     q.add(1);
     q.add(2);
     q.add(3);
     q.remove();
     while(!q.isEmpty()){
        System.out.println(q.peek());
        q.remove();
     }
   } 
}
