package Stacks;
import java.util.ArrayList;

public class Stacksarraylist {
    static class Stack{
        //class for stack formation
        //with help of arraylist
        static ArrayList<Integer> al=new ArrayList<>();
         //for stack creation we make four fun push,pop,peak,isempty;
        //all functions are related to top value
        //  push--add at top   pop--remove from top   peak--get the top   isempty--check stack is empty or not 
        
     //is empty fun
       public  boolean isempty(){
           return al.size()==0;
        }
     //push function
       public  void push(int data){
        al.add(data);
       }
     //pop function  -->in default implemetation it removes and send whath you are removing
       public  int pop(){
        if(al.size()==0){
          System.out.println("al is empty");
          return -1;
        }
          int top=al.get(al.size()-1);
          al.remove(al.size()-1);
          return top;
       }
     //peek function
         public  int peek(){
          if(al.size()==0){
            System.out.println("list is empty");
            return -1; 
          }
            int top=al.get(al.size()-1);
            return top;
         }    
    }
    public static void main(String[]args){
        Stack s=new Stack();
         s.push(1);
         s.push(2);
         s.push(3);
        while(!s.isempty()){
            int k=s.peek();
            System.out.println(k);
            int a=s.pop();
            System.out.println(a);
        }
        if(s.isempty()){
          System.err.println("yes it is empty now");
        }
    
    }

    
}
