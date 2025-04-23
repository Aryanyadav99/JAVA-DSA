package arraylist;

import java.util.*;


public class inbuildsorting {
    public static void main(String[]args){
        ArrayList<Integer>al=new ArrayList<>();
        al.add(3);
        al.add(5);
        al.add(1);
        al.add(8);
        al.add(2);
        System.out.println(al);
       // Collections.sort(al);//sort in ascending order 
       
        // by using inbuild fun 
         Collections.sort(al,Collections.reverseOrder()); // first comant sort in ascending then second commad reverse it 
         System.out.println(al);
         // firdstly sort in ascending then tece using for loop backward 
       /*  for(int i=al.size()-1;i>=0;i--){
            System.out.print(al.get(i)+" ");
        }*/
    } 
}
