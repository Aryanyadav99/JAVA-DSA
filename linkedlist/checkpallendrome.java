 package linkedlist;
public class checkpallendrome{
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
     public static boolean pallendrome(Node head){
      Node n1=head;
      if(n1==null){
          return true;
      }
      if(n1.next==null){
          return true;
      }
      Node mid=findmid(n1);
      // now revserse the second half
      Node sechead=rev(mid);
      Node n2=sechead;
      // here we take n1 because we didnt change it anywhere in program else you can take n3 =head;
        while(n2!=null){
          if(n1.data!=n2.data){
              return false;
          }
          n1=n1.next;
          n2=n2.next;
        }
        return true;
       }
       public static Node findmid(Node n1)
       {
          Node sp=n1;
          Node fp=n1;
          while(fp!=null && fp.next!=null){
             sp=sp.next;
             fp=fp.next.next;
          }
          return sp;
       }
       public static Node rev(Node mid){
          Node curr=mid;
          Node prev=null;
          Node ahead;
          while(curr!=null){
              ahead=curr.next;
              curr.next=prev;
              prev=curr;
              curr=ahead;
          }
          return prev;
       }
  public static void main(String[] args) {
       head=new Node(1);
       head.next=new Node(2);
       head.next.next=new Node(1);
       head.next.next.next=new Node(2);
       head.next.next.next.next=new Node(1);
       System.out.println(pallendrome(head));
   }
}