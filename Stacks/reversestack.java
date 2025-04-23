//object-> reverse the stack with no extra space creation wtih 0(1)tc
//if we didnt have to use extra memorey use recursion beacuse it has inbuilt stack so store there
package Stacks;
import java.util.*;
public class reversestack {
    public static void revstack(Stack<Integer>s){
        if (s.isEmpty()) {
            return;
        }
        int top=s.pop();
        revstack(s);
        //we have push not normally we have to push at bottom by creating botoom fun
        pushbottom(s,top);
    }
    public static void pushbottom(Stack<Integer>s,int value){
      if(s.isEmpty()){
        s.push(value);
        return;
      }
      int top=s.pop();
      pushbottom(s, value);
      s.push(top);
    }
    public static void main(String[]args){
     Stack<Integer> s=new Stack<>();
     s.push(1);
     s.push(2);
     s.push(3);
     //oringinal 3 2 1 
     //reversed 1 2 3 
     revstack(s);
     while(!s.isEmpty()){
       System.out.println(s.peek());
       s.pop();
     }
    }
}
