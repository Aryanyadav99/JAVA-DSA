package linkedlist;
import java.util.*;
public class iterativesearch {
    
  public static void main(String[]args){
    LinkedList<Integer> ll=new LinkedList<>();
    ll.addFirst(5);
    ll.addFirst(10);
    ll.addFirst(16);
    ll.addLast(14);
    ll.addLast(13);
    ll.addLast(19);
    System.out.println(ll);
    int i;
    int target=13;
    for( i=0;i<ll.size();i++){
        if(ll.get(i)==target){
               break;
        }
    }
      System.out.println(i); 
  }  
}
