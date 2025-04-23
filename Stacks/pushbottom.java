//solve in linear time but not extra space
//logic : pahle stack se sab pop kara ke recursion wale stack me bhar do then
//        jo no dalna ho vo dal do aur recursion stack se elemnt org satck me dal do

package Stacks;
import java.util.*;
public class pushbottom {
    public static void pushAtBottom(Stack<Integer> s,int value){
        if(s.isEmpty()){
           s.push(4);
           return;
        }
        int top=s.pop();
        pushAtBottom(s, value);
        s.push(top);
    }
    public static void main(String[]args){
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushAtBottom(s,4);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
