//given a string containg only parathesis (){}[]
// object:->to check given string conating all valid paraenthesis
//vaild conditions :1-- open bracket closed with same bracket 
//2:order of bracket must be same eg:([{}]) not ({)}
//3:opening always come first and closing always aftr opening 
//using stack get in liner tc 
//approach-> step one push all openig in stack 
//if you get any closing checch stack top me uska pair hai to thik aage bado yuani pop the top varna false retunr kar do  
package Stacks;
import java.util.*;
public class validparanthesis {
    public static boolean vp( String str){
        Stack<Character>s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if( ch=='('|| ch=='{' || ch=='['){//openeing brackets 
               s.push(ch);
            }
            else{
                if(s.isEmpty()){
                    //check if all the brackets are closing then it already a inavlid condtion
                    return false ;
                }
                else if((s.peek()=='('&&ch==')')||(s.peek()=='{'&&ch=='}')||(s.peek()=='['&&ch==']')){ //checking the pair 
                    s.pop();
                }
            }
        }
              return s.isEmpty();
    }
    public static void main(String[]args){
        String str="({[]}())";
       boolean ans= vp(str);
       System.out.println(ans);

    }
}
