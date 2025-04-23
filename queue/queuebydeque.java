package queue;
import java.util.*;
public class queuebydeque {
   static class queue{
    Deque<Integer>dq=new LinkedList<>();
    public void add(int data){
        dq.addLast(data);
    }
    public int remove(){
        return dq.removeFirst();
    }
    public int peek(){
        return dq.peek();
    }
    public boolean isEmpty(){
        return dq.isEmpty();
    }
   }
   public static void main(String[]args){
    queue q=new queue();
    q.add(1);
    q.add(2);
    q.add(3);
    while(!q.isEmpty()){
        System.out.println(q.remove());
    }
   }
}
