package queue;
import java.util.*;
public class stackbydeque {
    static class stack{
      Deque<Integer>dq=new LinkedList<>();
      public void push(int data){
        dq.addLast(data);
      }
      public int pop(){
        return dq.removeLast();
      }
      public int peek(){
        return dq.getLast();
      }
      public boolean isEmpty(){
        return dq.isEmpty();
      }
      
    }
        public static void main(String[]args){
        stack s=new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
