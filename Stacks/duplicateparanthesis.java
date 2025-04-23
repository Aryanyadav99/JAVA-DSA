//given :-> balanced eXpression having valid paranthesis  brcaces always ()
//objective :-->  check if there is duplicatae paranthesis meanss unnessary paranthesis eg dup --((a+b))
//if exist return true else false 
//medium level ques 
//tc 0(n)
//jab closing aega to vo apna pair dudega ,jab tak use pair na mile uske bich wale elemnt ko utate raho 
//agar use direct pair mil raha hai to samjho vo duplicate hai
package Stacks;
import java.util.*;
public class duplicateparanthesis {
    public static boolean dp(String str){
        Stack<Character> s=new Stack<>();
       for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        //closing 
        if(ch==')'){
            int count =0;//found counting in between elemets 
            while(s.peek()!='('){//find till openning brace
                  s.pop();
                  count++;
            }
            if(count<1){// we got its opening brace 
                return true;
            }
            else{
                s.pop();//openig pair pop
            }
            
        }
        else{
            s.push(ch);
        }
       }
       return false;
    }
    public static void main(String[]args){
        //given a valid string 
        String str="((a+b))";
        String str2="(a-b)";
        boolean ans=dp(str);
        System.out.println(ans);
        System.out.println(dp(str2));
       
    }
}
