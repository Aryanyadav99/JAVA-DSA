//optimsed code for next gretesr element by stack
package Stacks;
import java.util.*;
public class ngeoptimised {
    public static void ng(int array[],int nextgreater[]){
        Stack<Integer>s=new Stack<>();
        //traverse form back because stack take work in lifo and check the same `
        for(int i=array.length-1;i>=0;i--){
            while(!s.isEmpty()&&array[s.peek()]<=array[i]){
              s.pop();
            }
            if(s.isEmpty()){
                nextgreater[i]=-1;
            }
            else{
                nextgreater[i]=array[s.peek()];
            }
            s.push(i);
        }
        //it has while inside for loop but while only eneter or take value one time so its timne complexit is linear oveall [0(n)+0[2n]=0(3n)]=0(n)
    }
    public static void main(String[]args){
        int array[]={6,8,0,1,3};
        int nextgreater[]=new int[array.length];
        ng(array,nextgreater);
        for(int i=0;i<array.length;i++){
            System.out.println(nextgreater[i]);
        }
    }
}
