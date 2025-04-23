package heaps;
import java.util.ArrayList;

public class maxheap {
    static class heap{
        ArrayList<Integer>al=new ArrayList<>();
 // add
      public void add(int data){
       al.add(data);
       //check heap order property (with up heapify)
       int c=al.size()-1;
       int p=(c-1)/2;
       while(al.get(c)>al.get(p)){
        int temp=al.get(c);
        al.set(c,al.get(p));
        al.set(p,temp);
        c=p;
        p=(c-1)/2;
       }
      }
      //peek
      public  int peek(){
        return al.get(0);
      }
      // remove
      public  int remove(){
        // swap to maintain principle of complete binary trree
        int del=al.get(0);
         int temp=al.get(0);
         al.set(0,al.get(al.size()-1));
         al.set(al.size()-1,temp);
         al.removeLast();
         // heap order property (with down heapify)
         //p->c
         heapify(0);
         return del;
      }
      private void heapify(int i){
        int p=i;
        int temp;
         int lc=2*p+1;
         int rc=2*p+2;
         // find the right parent (index) for our heap
         if(lc<al.size() && al.get(p)<al.get(lc)){
             p=lc;
         }
         if(rc<al.size() && al.get(p)<al.get(rc)){
            p=rc;
         }
         // swap it with first index
             if(p!=i){
            temp=al.get(i);
            al.set(i,al.get(p));
            al.set(p,temp);
            heapify(p);
         }
         
      }
      public boolean isEmpty(){
        return al.isEmpty();
      }
    }
    public static void main(String[]args){
   heap h=new heap();
   h.add(5);
   h.add(9);
   h.add(45);
   h.add(1);
   h.add(100);
   h.add(90);
 
   while(!h.isEmpty()){
    System.out.println(h.peek());
    h.remove();
   }
    }
}
