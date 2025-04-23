package Stacks;

public class Stacklinkedlist {
    static class Node{
        int data;
        Node next;
       Node(int data){
        this.data=data;
        this.next=null;}

    }
    public static Node head;
  //here top variable is our head because on doing all operation with head we got tc o(1);
    public static class Stack{
     // is empty function
        public  boolean isempty(){
            if(head==null){
                return true;
            }
            return false;
        }
     // push function
        public  void push(int data){
            Node n1=new Node(data);
            if(isempty()){
                //list empty
                head=n1;
                return;
            }
            n1.next=head;
            head=n1;
        }
     // pop function
        public int pop(){
          if(isempty()){
            System.out.println("ll is empty");
            return -1;
          }
             int top=head.data;
             head=head.next;
             return top;
        }
        public  int peek(){
           if(isempty()){
            System.out.println("ll is empty");
            return -1;
           }
           int top=head.data;
           return top;
        }
        public static void main(String[]args){
            Stack s=new Stack();
            s.push(3);
            s.push(2);
            s.push(1);
            while(!s.isempty()){
                int k=s.peek();
                System.out.println(k);
                s.pop();
            }
            if(s.isempty()){
                System.out.println("now empty");
            }
        }
    }
}
