/// objetive -> implement queue(fifo) by help of two stacks(lifo+lifo)
//methods -> there are two methods first by help of add(push) its tc0(n)here and remove pop hac 0(1)
 // 2.. second method is by the help of remove(pop) its tc0(n) thtas why peek also have0(n) tc and add has 0(1)
 // approach method 1 is used here;
 // here we have to amke new fun for add remove for queue by 2 stack not to just print ans by trnasfering 
package queue;
import java.util.*;
public class queuebytwostacks {
   static class queue{
     Stack <Integer>s1=new Stack<>();
     Stack <Integer>s2=new Stack<>();
     //approach -> firstly add at s1 then is s1 is not empty transer all to s2 till s1 became empty  when s1 became empty add that elemt and then transferr all from s2 to s1;     public void add(int data){
       public void add(int data){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
         }
        s1.push(data);
        while(!s2.isEmpty()){
          s1.push(s2.pop());    
         }
       } 
       public int remove(){
         return s1.pop();
       }
       public int peek(){
        return s1.peek();
       }
       public boolean isEmpty(){
        return s1.isEmpty();
       }
    }
    public static void main(String[]args){
        queue q=new queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.remove();
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
   
}
