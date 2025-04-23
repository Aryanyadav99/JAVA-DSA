package queue;

public class queuell {
        static class Node{
            int data;
            Node next;
            Node(int data){
                this.data=data;
                this.next=null;
            }
        }
         
        static class queue{
         public static Node head=null;
         public static Node tail=null;
         public static int  size =0;
         //check is empty
         public boolean isEmpty(){
            return (head==null&&tail==null);
         }
         //add in queue
         public void add(int data){
            Node n1=new Node(data);
            if(size==0){
               head=tail=n1;
               size++;
               return;
            } 
                tail.next=n1;
                tail=n1;
                size++;
          }
         // remove in queue
         public int remove(){
            int front;
            if ((size==0)) {
                System.out.println("ll doesnt exist");
                return -1;          
            }
            if(size==1){
                 front=head.data;
                head=tail=null;
                size--;
                return front ;
            }
            else{
                front=head.data;
                head=head.next;
                size--;
               return front;
            }
         }
         // peek in queue
         public int peek(){
            return head.data;
         }

        }
        public static void main(String[]args){
            queue q =new queue();
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            q.remove();
            while(!q.isEmpty()){
                System.out.println(q.peek());
                q.remove();
            }
        }
     
}
