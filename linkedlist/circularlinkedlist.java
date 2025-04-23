package linkedlist;

public class circularlinkedlist {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static boolean iscircular(Node temp){
        Node slow=temp;
        Node fast=temp;
        while(fast!=null&&fast.next!=null  ){
            if(slow==fast){
                return true;
            }
            slow=slow.next;
            fast=fast.next.next;
        }
        return false;
    }
    public static void main(String[]args){
      Node head=new Node(1);
      head.next=new Node(2);
      head.next.next=null;
      boolean res=iscircular(head); 
      System.out.println(res);
    }
}
