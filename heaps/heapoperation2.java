package heaps;
import java.util.*;
public class heapoperation2 {
   
    static class priorityqueue{
        ArrayList<Integer>heap=new ArrayList<>();
        //add
        public void add(int data){
           if(heap.isEmpty()){
            heap.add(data);
            return ;
           }  
           heap.add(data);
           // on adding data apply bottom to top heapify
           int ci=heap.size()-1;
           int pi=(ci-1)/2;
          while(ci>0){
            if(heap.get(pi)>heap.get(ci)) {
                int temp=heap.get(pi);
                heap.set(pi,heap.get(ci));
                heap.set(ci,temp);
                ci=pi;
               pi=(ci-1)/2;
             }
             else{
              break;
             }
             
          }
        }   
        //remove
        public int remove(){
          if(heap.isEmpty()){
            System.out.println("emprty heap");
            return -1;
          }
          int data=heap.get(0);
          heap.set(0,heap.get(heap.size()-1));
          heap.remove(heap.size()-1);
          // heapify 
          int pi=0;
          int li=2*pi+1;
          int ri=2*pi+2;
          while(li<heap.size()){
           int min=pi;
           if(heap.get(min)>heap.get(li)){
            min=li;
           }
           if(ri<heap.size() && heap.get(min)>heap.get(ri)){
            min=ri;
           }
            if(pi==min){
                return data;
            }
            int t=heap.get(pi);
            heap.set(pi,heap.get(min));
            heap.set(min,t);
            pi=min;
            li=2*pi+1;
            ri=2*pi+2;
          }
          return data;
        }
        //peek
        public int peek(){
            return heap.get(0);
        }
        //size
        public int size(){
            return heap.size();
        }
        //isempty
        public boolean isEmpty(){
             return heap.isEmpty();
        }
    }
   public static void main(String[] args) {
    priorityqueue pq=new priorityqueue();
    pq.add(8);
    pq.add(2);
    pq.add(3);
    pq.add(4);
    pq.add(2);
    //pq.add(2);
    while(!pq.isEmpty()){
        System.out.println(pq.peek());
        pq.remove();
    }
   }
    
}
