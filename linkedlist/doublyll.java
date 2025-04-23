package linkedlist;

public class doublyll{
    static class linkedlist{
        class Node{
            int data;
            Node next;
            Node prev;
            public Node(int data){
                this.data=data;
                this.next=null;
                this.prev=null;
            }
        }
        public  Node head;
        public  Node tail;
        public  int size=0;

        // add first
        public void addfirst(int data){
            Node n1=new Node(data);
            size++;
            if(head==null){
             head=tail=n1;
             return;
            }
              n1.next=head;
              head.prev=n1;
              n1.prev=null;
              head=n1;
        }

        // add last

        public void addlast(int data){
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
        // remove first

         public int removefirst(){
            if(head==null){
                System.out.println("ll empty");
                return-1;
            }
            if(head.next==null){
                Node n1=head;
                head=tail=null;
                size--;
                return n1.data;
            }
            Node dummy=head;
            head=head.next;
            head.prev=null;
            size--;
            return dummy.data;
         }

         // remove last

         public int removelast(){
            if(head==null){
                return -1;
            }
            if(head.next==null){
                Node n1=head;
                head=tail=null;
                size--;
                return n1.data;
            }
            Node dummy =tail;
            tail=tail.prev;
            tail.next=null;
            size--;
            return dummy.data;
         }
          // add in between 
          public void add(int data,int idx){
            Node n1=new Node(data);
            int i=1 ;// so we go previous where we have  to add 
            // or we can take  it zero so we have to add node at preivous pf dummy for proper index connection
            size++;
            if(head==null){
                head=tail=n1;
                return;
            }
            Node dummy=head;
            while(i!=idx){
                dummy=dummy.next;
                i++;
            }
            Node ahead=dummy.next;
            n1.next=ahead;
            dummy.next=n1;
            n1.prev=dummy;
            ahead.prev=n1;
          }
          // remove in between 

          public int remove(int idx){
            if(head==null){
                return -1;
            }
            int i=1;
            Node dummy=head;
            while(i!=idx){
                dummy=dummy.next;
                i++;
            }
            Node n1=dummy.next;
            Node ahead=dummy.next.next;
            dummy.next=ahead;
            ahead.prev=dummy;
            return n1.data;
          }
         // print
         public void  print(){
            if(head==null){
                System.out.println("no ll");
                return;
            }
            Node temp=head;
            while(temp!=null){
                 System.out.print(temp.data+"-><-");
                 temp=temp.next;
            }
            System.out.println("null");
         }
    }
    public static void main(String[] args) {
        linkedlist ll=new linkedlist();
        ll.addfirst(5);
        ll.print();
        ll.addfirst(9);
        ll.print();
        ll.addlast(10);
        ll.print();
        ll.addlast(20);
        ll.print();
        ll.add(0, 2);
        ll.print();
        ll.remove(3);
        ll.print();
        ll.removefirst();
        ll.print();
        ll.removelast();
        ll.print();
    }
}