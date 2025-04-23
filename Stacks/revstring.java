//object-> reverse the string by using stack and print string not stack
package Stacks;
import java.util.*;
public class revstring {
    public static void main(String[]args){
        Stack<Character>s=new Stack<>();
        String str="abc";
        //we can also put by using while loop
        s.push(str.charAt(0));
        s.push(str.charAt(1));
        s.push(str.charAt(2));
        //for new empty string for storing rev string create stringbuilder easy for modify it 
        StringBuilder result=new StringBuilder("");
        while(!s.isEmpty()){
            char c=s.pop();
            result.append(c);
            //append at last
        }
        //at last store  result to org string
        str=result.toString();
        //we use to string to convert sting builder to string because they are of different types
        System.out.println(str);
        
    }
    
}
