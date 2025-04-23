package hashing;
import java.util.*;

public class ownhashmap {
    static class MapNode<k,v>{ // since all the elemnts in thw list are of node format k,v so make a node class 
        k key;
        v value;
        MapNode<k,v> next;
        public MapNode(k key,v value){
            this.key=key;
            this.value=value;
        }
    }
    static class HashMap<k,v>{  // make a generic class because k and v are of any type
         ArrayList<MapNode<k,v>> al;  //hashmap implemented through array of buckets (nodes) but array cannt be generic type in java
                                       // thats why we implemet through arraylist;;
         int bucketsize; // but  in al we didnt have trace of size for compression adn also for the index thats why we fix the al size  20 
         int size=0;
         public HashMap(){  // now initlise thee all elemnts in list by null 
            al=new ArrayList<>();
            bucketsize=20;
            for(int i=0;i<bucketsize;i++){
                al.add(null);
            }
         }


    
 // insert 
    private int getbi(k key){
        int hc=key.hashCode(); // find hash code first every object has its own hashcode 
        int index=hc%bucketsize; // compression 
        return index;
    }
    public void insert(k key,v value){  // here we have to insert k key and v value make 
          int bi=getbi(key); // firstly we have to find the bucket index 
          // now we have to insert key adn value node as ll but forst have to search is there is node present or not 
          MapNode<k,v>head=al.get(bi);
          // when key is already presennt in list
          while(head!=null){
            if(head.key.equals(key)){
                head.value=value;
                return;
            }
            head=head.next;
          }
          // for new key 

          head =al.get(bi);
          // again find head because prev one is destroyed
          MapNode<k,v> n1=new MapNode<>(key,value);
          // insert at start 
          n1.next=head;
          head=n1;
          // set al this node
          al.set(bi, n1);
          // increse size
          size++;
    }

  //size
     public int size(){
        return size;
     }

  // get value
     public v getValue(k key){
        int bi=getbi(key);
        MapNode<k,v>head=al.get(bi);
        while(head!=null){
            if(head.key.equals(key)){
                
                return head.value;
            }
            head=head.next;
        }
        return null;
     }


   // remove
     
      public v removeKey(k key){
        int bi=getbi(key);
        MapNode<k,v>head=al.get(bi);
       // removal is same as remaval the idx from the list or mid from the list
       if(head.key==key){
        MapNode<k,v> n1=head;
        al.set(bi, head.next);
        size--;
        return n1.value;
        
       } 
       MapNode<k,v>prev=null;
        while(head!=null){
            if(head.key.equals(key)){
                MapNode<k,v> n1=head;
              prev.next=head.next;
              size--; 
                return n1.value; 
            }
            prev=head;
            head=head.next;
        }
          return null;
      }

   // isempty
    public boolean isempty(){
        if(size==0){
            return true;
        }
        return false;
    }  
    
    // print 
    public void print(){
       for(int i=0;i<al.size();i++){
        System.out.println(al.get(i));
       }
    }
}
public static void main(String[] args) {
    HashMap<String,Integer>map=new HashMap<>();
    map.insert("china", 100);
    map.insert("India", 150);
    map.insert("pakistan",50);
    map.print();
}
}
