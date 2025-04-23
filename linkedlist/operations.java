package linkedlist;

public class operations {
    static class linkedlist{
         class Node {
            int data;
            Node next;
            Node(int data){
                this.data=data;
                this.next=null;
            }
        }
        public static Node head;
        public static Node tail;
        public static int size=0;
         
        // add at first
         public void addFirst(int data){
            Node n1=new Node(data);
            size++;
            if(head==null){
                head=tail=n1;
                return;
            }
            n1.next=head;
            head=n1;
         }
       // add last
         public void addLast(int data){
            Node n1=new Node(data);
            size++;
            if(head==null){
                head=tail=n1;
                return;
            }
            tail.next=n1;
            n1.next=null;
            tail=n1;
         }    
       // remove first
          public int removeFirst(){
              if(head==null){
                System.out.println("empty ll");
                  return -1;
              }
              if(size==1){// head.next==null
                Node n1=head;
                head=null;
                size--;
                return n1.data;
              }
              Node n1=head;
              head=head.next;
                  size--;
              return n1.data;
          }
      // remove last
         public int removeLast(){
            if(head==null){
                System.out.println("empty list");
                return -1;
            }
            if(head.next==null){
                Node n1=head;
                head=null;
                size--;
                return n1.data;
            }
            Node n1=head;
            while(n1.next!=tail){
                n1=n1.next;
            }
            Node n2=tail;
            n1.next=null;
            tail=n1;
            size--;
            return n2.data;
         }
       // add at mid
         public void addMid(int data,int idx){
            int i=0;
            Node n1=new Node(data);
            size++;
            if(head==null){
                head=tail=n1;
                return ;
            }
            Node n2=head;
           while(i+1!=idx){
            n2=n2.next;
            i++;
           }
           n1.next=n2.next;
           n2.next=n1;
         }
       // remove from mid 
       public int removeMid(int idx){
        int i=0;
        if(head==null){
            System.out.println("empty list");
            return -1;
        }
        if(head.next==null){
            Node n1=head;
            head=null;
            size--;
            return n1.data;
        }
        Node n1=head;
        while(i+1!=idx){
            n1=n1.next;
            i++;
        }
        Node n2=n1.next;
        n1.next=n1.next.next;
        size--;
        return n2.data;
       }
       public void print(){
        if(head==null){
            System.out.println("empty ll");
        }
        Node n1=head;
        while(n1!=null){
            System.out.print(n1.data+"->");
            n1=n1.next;
        }
        System.out.println("null");
       }
    }
    public static void main(String[] args) {
        linkedlist ll =new linkedlist();
        ll.addFirst(3);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addMid(11,2);
        ll.print();
        ll.addLast(4);
        ll.print();
        ll.removeFirst();
        ll.print();
        ll.removeLast();
        ll.print();
        ll.removeMid(1);
        ll.print();
    }
}
