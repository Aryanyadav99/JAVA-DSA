package arraylist;
import java.util.*;
public class maxareaopt {
    public static void main(String[]args){
        ArrayList < Integer > list = new ArrayList <> ();
        list.add (1);
        list.add (8);
        list.add (6);
        list.add (2);
        list.add (5);
        list.add (4);
        list.add (8);
        list.add (3);
        list.add (7);
        int area1=0;//for comparison 
        //two pointer approach
        int area=0;
        int a=0;
        int b=list.size()-1;
        while(a<=b){
           area=(b-a)*Math.min(list.get(a),list.get(b));
           if(area1<area){
            area1=area;
           }
          // always update small height pointer for max area
          if(list.get(a)>list.get(b)){
            b--;
          }
          else{
            a++;
          }
         }
        System.out.println(area1);
    }
}
