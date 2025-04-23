package linkedlist;

public class reversedoubly {
    static class LinkedList{
        static class Node{
            int data;
            Node next;
            Node prev;
            public Node(int data){
              this.data=data;
              this.next=null;
              this.prev=null;
            }
        }
        public static Node head;
        public static Node tail;
        public static int size;
        // add first
        public void addFirst(int data){
             Node n1=new Node(data);
             if(head==null){
                head=tail=n1;
                size++;
                return;
            }
            n1.next=head;
            head.prev=n1;
            head=n1;
            head.prev=null;
            size++;
    
        }
        //add last
        public void addLast(int data){
              Node n1=new Node(data);
              size++;
              if(head==null){
                head=tail=n1;
              }
              tail.next=n1;
              n1.prev=tail;
              n1.next=null;
              tail=n1;
        }
        //remove first
        public int removeFirst(){
            if(head==null){
                return -1;
            }
            Node  temp=head;
            head=head.next;
            head.prev=null;
            size--;
            return temp.data;
    
        }
        // removelast
        public int removeLast(){
            if(head==null){
                return -1;
            }
            Node temp=tail;
            tail=tail.prev;
            tail.next=null;
            size--;
            return temp.data;
        }
        //print
        public void print(){
            if(head==null){
                System.out.println("ivalid ll");
            }
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"-><-");
                temp=temp.next;
            }
            System.out.println("null");
        }
        public void reverse(){
            if(head==null){
                return;
            }
            if(head.next==null){
                return;
            }
            Node curr=head;
            Node prev=head.prev;
            tail=curr;
            while(curr!=null){
                Node ahead=curr.next;
                curr.next=prev;
                curr.prev=ahead;
                prev=curr;
                curr=ahead;
            }
            head=prev;
        }
       }
         public static void main(String[] args) {
            LinkedList ll=new LinkedList();
            ll.addFirst(5);
           
            ll.addFirst(9);
            
            ll.addLast(10);
           
            ll.addLast(20);
            
            ll.print();

            ll.reverse();

            ll.print();
    
         }
}
