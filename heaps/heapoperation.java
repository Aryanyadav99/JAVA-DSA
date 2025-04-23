// shradhha way
package heaps;

import java.util.ArrayList;

public class heapoperation {
    static class heap{
        ArrayList<Integer>al=new ArrayList<>();
      //operations   
        // 1.for add in heap
        public void add(int data){
            al.add(data);
            int idx=al.size()-1;
            int pidx=(idx-1)/2;
            while(al.get(idx)<al.get(pidx)){
                int temp=al.get(idx);
                al.set(idx,al.get(pidx));
                al.set(pidx,temp);
                idx=pidx;
                pidx=(idx-1)/2;
            }
        }
        //2.peek-- find min elemrnt form al
        public int peek(){
            return al.get(0);
        }
       // 3.delete the min
       public int remove(){// remove first value becausse first is min in heap min goes first
        int data=al.get(0);
        //firstly swap from last because remove last with constant tc
       int temp= al.get(0);
       al.set(0,al.get(al.size()-1));
       al.set(al.size()-1,temp);
       // now remove last
       al.removeLast();
       //but due to swapping our heap may be not be min or max so we have to heapyify it 
       heapify(0);
       return data;
       }
       // heapify  :- make it private for the remove 
       private void heapify(int i){// idx is root
           int minidx=i;
           int leftidx=((2*i)+1);
           int rightidx=((2*i)+2);
           if(leftidx<al.size()&&al.get(leftidx)<al.get(minidx)){
               minidx=leftidx;
           }
           if(rightidx<al.size()&&al.get(rightidx)<al.get(minidx)){
            minidx=rightidx;
           }
           if(minidx!=i){
            //swap
            int temp=al.get(i);
            al.set(i,al.get(minidx));
            al.set(minidx,temp);
            heapify(minidx);
           }
       }
       // function to check is our heap empty or not
       public boolean isEmpty(){
        return al.size()==0;
       }
    }
    public static void main(String[]args){
        heap h=new heap();
        h.add(8);
        h.add(2);
        h.add(3);
        h.add(4);
        h.add(2);
   //     h.add(2);
         while(!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
         }
    }
}
