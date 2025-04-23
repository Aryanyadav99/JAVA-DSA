package queue;
import java.util.*;
public class queuereverse {
    public static void main(String[]args){
        Queue<Integer> q=new LinkedList<>();
          Stack<Integer> s=new Stack<>();
        q.add(2);
        q.add(3);
        q.add(4);
          while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        //now your queue become reverse 
        while(!q.isEmpty()){
            System.out.println(q.remove());
        } 
        
        
    }
}
