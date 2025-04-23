//object 
//stock->stock  value for company given hota hao 
//span -> max no of consecutivE DAYS for which (PRICE<TODAYS) PRICE so we have find span for all 7 days graph in copy
//span of 0th index day is 1 
//approach:-> ham ye dekh le ki jiska hame span find karna hai usse pahle uske barabar ya bada koi kab aya tha vhai differnece apna span hoga 
//formula -> span =(current index-prevhigh index);
//for claculating prevhigh is very largs by loop make 0(nsqu)
//we have to solve in 0(n) by stack
package Stacks;
import java.util.*;
public class stockspan {
    public static void stocksspan(int stocks[],int span[]){
      Stack<Integer> s=new Stack<>();
      span[0]=1;
      //ifrst value of span is always by graph dekho
      s.push(0);
      //stasck me 0 as a index behj do
      for(int i=1;i<stocks.length;i++){
        //take a lop for further span values so it start with 1
        int currprice=stocks[i];
        while(!s.isEmpty()&& currprice>stocks[s.peek()]){
            //ye loop tab tak satck se calue pop karega jab tak ya to stack empty na ho jaye ya to cureent price kisi se chota ya barabar ho jaye
            s.pop();
        }
        if(s.isEmpty()){
            span[i]=i+1;
        }
        else{
            int prevhigh=s.peek();
            span[i]=i-prevhigh;
        }
        s.push(i);
      }
    }
    public static void main(String[]args){
        int stocks[]={100,80,60,70,60,85,100};
        int span[]=new int[stocks.length];
        stocksspan(stocks,span);
        for(int i=0;i<stocks.length;i++){
            System.out.print(span[i]+" ");
        }
    }
}
