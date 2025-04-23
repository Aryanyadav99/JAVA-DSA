package Leetcode.interstectionpointinll;
// we kow if we are at same level in both ll so teace it and compare thats why we have comapre the distance between them and move the differnvce of dis of
// big list to ahead for mainyaing that levle    it doesnt take any space complexity but it take take tc0(n+2*somenthing)overall 0(n).. 
// but we have one more method or algo for implement in pure 0(n) without any extra space
public class method3 {

    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
        }
    }
    static class LinkedList{
    public  Node head;
        public  Node tail;
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
    public static Node findconnection(Node head1,Node head2){
        if(head1==null || head2==null){
            return null;
        }
        // find dis
        int dis1=0,dis2=0;
        Node temp1=head1;
        Node temp2=head2;
        while(temp1!=null){
            temp1=temp1.next;
             dis1++;
        }
        while(temp2!=null){
            temp2=temp2.next;
            dis2++;
        }
        temp1=head1;
        temp2=head2;
        if(dis1>dis2){
           temp1= balanceNode(temp1,dis1-dis2);
        }
        else if(dis1<dis2){
            temp2=balanceNode(temp2,dis2-dis1);
        }
        while(temp1!=temp2){
              temp1=temp1.next;
              temp2=temp2.next;
        }
           return temp1;
    } 
    public static Node balanceNode(Node temp,int d){
        while(d!=0){
            d--;
            temp=temp.next;
        }
        return temp;
    }
    public static void main(String[] args) {
         LinkedList ll=new LinkedList();
         ll.addLast(2);
         ll.addLast(3);
         ll.addLast(4);
         ll.addLast(5);
         ll.addLast(6);
         ll.addLast(7);
         LinkedList ll2=new LinkedList(); 
         ll2.addLast(4);
         ll2.addLast(5);
         ll2.head.next=ll.head.next.next.next.next;    
         // interconnecrion of 6 and so on
         Node res=findconnection(ll.head,ll2.head); 
         if(res==null){
            System.out.println("no linkage");
         }
         else{
            System.out.println(res.data);
         }
    }
}


