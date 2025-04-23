package linkedlist;
public class removecycleinll {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static void delcycle(Node temp){
       // detect cycle 
      Node slow=temp;
      Node fast=temp;
      int count=0;
      while(fast!=null && fast.next!=null){
         
         slow=slow.next;
         fast=fast.next.next; 
         if(slow==fast){
            count++;
            break;
         }
      }
       if(count!=0){
          slow=head;
          Node prev=null;
          while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
          }
         prev.next=null;
       }
       
    }
    public static void print(){
       Node temp=head;
       while(temp!=null){
        System.out.println(temp.data);
        temp=temp.next;
       } 

    }
    public static void main(String[]args){
        head=new Node(1);
        Node temp=new Node(2);
        head.next=temp;
        head.next.next=new Node(3);
        head.next.next.next=temp;
       
        delcycle(head);
        print();
    }
}
