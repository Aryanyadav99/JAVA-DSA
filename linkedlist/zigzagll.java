package linkedlist;

public class zigzagll {
    static class LinkedList{
        static class Node{
            int data;
            Node next;
            public Node(int data){
               this.data=data;
               this.next=null;
            }
        }
        public Node head;
        public Node tail;
        public int size=0;
        // operations 
        //1,.. addFirst
        public void addFirst(int data){
            Node n1 = new Node(data);
           if(head==null){
            head=tail=n1;
            size++;
            return;
           } 
           n1.next=head;
           head=n1;
           size++;
        }
        //2.. add Last
         public void addLast(int data){
            Node n1 =new Node(data);
            if(head==null){
                head=tail=n1;
                size++;
                return;
            }
            tail.next=n1;
            tail=n1;
            size++;
         }
         //3..print
         public void print(){
             if(head==null){
                System.out.println("ll is empty");
                return;
             }
             Node temp=head;
             while(temp!=null){
                  System.out.print(temp.data+"->");
                  temp=temp.next;
             }
             System.out.println("null");
         }
         //4 add in middle
         public void add(int idx,int data){
            Node n1 =new Node(data);
            if(head==null && idx>=0){
               System.out.println("innvalid index due ro empty ll");
               return;
            }
            int i=0;
            Node temp=head;
             while(i!=(idx-1)){
                temp=temp.next;
                i++;
             }
            n1.next=temp.next;
           temp.next=n1;
           size++;
         }
         // removefirst
         public int removeFirst(){
            if(head==null){
                System.out.println("emptyll");
                return -1;
            }
            else if(size==1){
                Node temp=head;
                head=tail=null;
                return temp.data;
            }
            Node temp=head;
            head=head.next;
            size--;
            return temp.data;
         }
         // remove last
         public int removeLast(){
            if(head==null){
                System.out.println("empty ll");
                return -1;
            }
            else if(size==1){
                Node temp=head;
                head=tail=null;
                return temp.data;
            }
            Node temp =head;
            while(temp.next!=tail){
             temp=temp.next;
            }
            Node n1=temp.next;
            temp.next=null;
            return n1.data;
    
         }
          public void zigzag(){
            if(head==null){
                System.out.println("emptyll");
                return;
            }
            // find mid
            Node slow=head;
            Node fast=head;
            while(fast!=null &&fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            Node mid=slow;
            // reverse the second half 
             Node curr=mid.next;// here we strt from mid.next because we have to seperatr the list to get rif from infinte list because we have acces of mid so prevuious of mid.next ie mid can be contted to null
             mid.next=null; // here we seperate 
             Node prev=null;
            while(curr!=null){
                Node ahead=curr.next;
                curr.next=prev;
                prev=curr;
                curr=ahead;
            }
            Node lh=head;
            Node rh=prev;
            Node nlh;
            Node nrh;
            // alternate merging for zig zag
            while(lh!=null && rh!=null){
               nlh=lh.next;
               lh.next=rh;
               nrh=rh.next;
               rh.next=nlh;
               lh=nlh;
               rh=nrh;
            }

         }
       }
        public static void main(String[]args){
         LinkedList ll= new LinkedList();
         ll.addFirst(3);
         ll.print();
         ll.addFirst(2);
         ll.print();
         ll.addFirst(1);
         ll.print();
         ll.addLast(4);
         ll.print();
         ll.zigzag();
         ll.print();
        }
}
