// find two no thats sum  is equal is target but here the list is sorted and rotated
// here a pivot is elemnt where rotaion occurs 
// 11,15,6,8,9,10 pivot is 10
package arraylist;
import java.util.*;
public class sum2opt {
    public static void main(String[]args){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target=16;
       // brute force apply here also but we have to solve by opt way
       // for opt we use two pointer approach with some twist like find pivot point 
       // since we have a ascending sorted list so it always sattis a cond where that cond got wrong we got breaking point
       // and its alwauys the largest value so rp is at the breaking point 
       // so i is largest and i+1 is samllest 
       // now we cant simply lp++or rp-- because we have to travel in rotated array so use modulo arithmetic formulae 
       //updation :: lp=(lp+1)%n;
       //rp=(n+rp-1)%n;
       int bp=-1;
       for(int i=0;i<list.size()-1;i++){
        if(list.get(i)>list.get(i+1)){// since array is sorted in asce it voilate our basic
          bp=i;
          break;
        }
       }
       int rp=bp;
       int lp=bp+1;
       int sum=0;
       int a=0;
       int b=0;
       int n=list.size();
       while(lp!=rp){// here we take equal we cant take greater beacus it is rotateed array 
          sum=list.get(lp)+list.get(rp);
          if(sum==target){
           a=lp;
           b=rp;
           break;
          }
          else if(sum>target){
            rp=(n+rp-1)%n;
          }
          else{
            lp=(lp+1)%n;
          }
       }
       System.out.println(list.get(a)+" "+list.get(b));
    }
}
