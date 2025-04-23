package heaps;

import java.util.PriorityQueue;

public class kmaxfun {
   public static PriorityQueue<Integer>pq=new PriorityQueue<>();
    public static void findmax(int array[],int k){
        for(int i=0;i<k;i++){
            pq.add(array[i]);
        }
        for(int i=k;i<array.length;i++){
            if(array[i]>pq.peek()){
                pq.remove();
                pq.add(array[i]);
            }
        }
        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }
    }
    public static void main(String[]args){
        int array[]={3,2,5,7,3,2,5,8,9};
        int k=4;
        findmax(array,k);
    }
}
