package Implementation;

import com.sun.jdi.Value;

import java.util.ArrayList;



public class HashMap<K,V> {
    private static class Node<K,V>{
        K key;
        V value;
        Node<K,V> next;
        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
    private static int count=0;
    private int size;
    ArrayList<Node<K,V>> al;
    HashMap(){
        size=20;
        al=new ArrayList<>();
        for(int i=0;i<size;i++){
            al.add(null);
        }
    }
    //put method
    private void put(K key,V value){
        int idx = Math.abs(key.hashCode()) % size;
        //check if it aleady present then change value else add at first at ll
        Node<K,V>head=al.get(idx);
        while(head!=null){
            if(head.key.equals(key)){
                head.value=value;
                break;
            }
            head=head.next;
        }
        if(head==null){
            //means key not present
            //so we have to make a new Node and add at strt pos
            Node<K,V> newNode=new Node<>(key,value);
            head=al.get(idx);
            newNode.next=head;
            al.set(idx,newNode);
            count++;
        }
    }
    //get method
    private  V get(K key){
        int idx = Math.abs(key.hashCode()) % size;
        Node<K,V> head=al.get(idx);
        while(head!=null){
            if(head.key.equals(key)){
                return head.value;
            }
            head=head.next;
        }
        return null;
    }

    //delete method --used to delete key
    private V remove(K key){
        int idx = Math.abs(key.hashCode()) % size;
        Node<K,V> head=al.get(idx);

        if(head==null){
            return null;
        }
        //key on first pos
        if(head.key.equals(key)){
            V val=head.value;
            al.set(idx,head.next);
            count--;
            return val;
        }
        while(head!=null){
            if(head.next!=null && head.next.key.equals(key)){
                V value=head.next.value;
                head.next=head.next.next;
                count--;
                return value;
            }
        }
        return null;
    }

    //size
    private int getSize(){
        return count;
    }

    //isEmpty
    private boolean isEmpty(){
        return count==0;
    }
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        System.out.println("===== Inserting New Keys =====");
        hm.put("A", 1);
        hm.put("B", 2);
        hm.put("C", 3);
        System.out.println("Size after 3 inserts: " + hm.getSize()); // 3

        System.out.println("\n===== Updating Existing Key =====");
        hm.put("A", 100); // should update value
        System.out.println("A -> " + hm.get("A")); // 100
        System.out.println("Size should still be 3: " + hm.getSize());

        System.out.println("\n===== Get Non-existing Key =====");
        System.out.println("Z -> " + hm.get("Z")); // null

        System.out.println("\n===== Removing First Node in Bucket =====");
        System.out.println("Removed A: " + hm.remove("A")); // 100
        System.out.println("A after removal: " + hm.get("A")); // null
        System.out.println("Size after removing A: " + hm.getSize()); // 2

        System.out.println("\n===== Removing Key Not Found =====");
        System.out.println("Removed X: " + hm.remove("X")); // null
        System.out.println("Size still: " + hm.getSize()); // 2

        System.out.println("\n===== Testing Collision Handling =====");
        // Force collisions: create keys with same bucket index
        String k1 = "Aa"; // known hash collision in Java with "BB"
        String k2 = "BB"; // will map to same hash bucket as "Aa"
        hm.put(k1, 111);
        hm.put(k2, 222);
        System.out.println(k1 + " -> " + hm.get(k1)); // 111
        System.out.println(k2 + " -> " + hm.get(k2)); // 222

        System.out.println("\n===== Removing Middle Node in Collision Chain =====");
        hm.remove(k1); // remove first in that bucket
        System.out.println(k1 + " after removal: " + hm.get(k1)); // null
        System.out.println(k2 + " still exists: " + hm.get(k2)); // 222

        System.out.println("\n===== Final State =====");
        System.out.println("Size: " + hm.getSize());
        System.out.println("Is Empty? " + hm.isEmpty());

        System.out.println("\n===== Removing All Keys to Test isEmpty =====");
        hm.remove("B");
        hm.remove("C");
        hm.remove(k2);
        System.out.println("Size: " + hm.getSize()); // 0
        System.out.println("Is Empty? " + hm.isEmpty()); // true
    }
}
