//objevtive :- find sum of two is equal to target or not in sorted list you can also find in the non sorted array
package arraylist;
import java.util.*;
public class sum1opt {
    public static void main(String[]args){
        ArrayList < Integer > list = new ArrayList <> ();
        for(int i=1;i<=10;i++){
            list.add(i);
        }
        int target=10;
        int lp=0;
        int rp=list.size()-1;
        int sum=0;
        int a=0;
        int b=0;
        int c=-1;
        while(lp<=rp){
           sum=list.get(lp)+list.get(rp);
           if(sum==target){
            a=lp;
            b=rp;
            c++;
            break;
           }
           else if(sum>target){
            rp--;
           }
           else{
            lp++;
           }
        }
        if(c==0){
            System.out.println(list.get(a)+" "+list.get(b));
        }
        else{
            System.out.println("not in list");
        }
    }
}
