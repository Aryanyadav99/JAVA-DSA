package arraylist;
import java.util.*;
public class maxareabf {
    public static void main(String[]args){
        ArrayList<Integer>list=new ArrayList<>();
        list.add (1);
        list.add (8);
        list.add (6);
        list.add (2);
        list.add (5);
        list.add (4);
        list.add (8);
        list.add (3);
        list.add (7);
        int area1=0;
        int area;
        for(int i=0;i<=list.size();i++){
            for(int j=i+1;j<list.size();j++){
                 area=(j-i)*Math.min(list.get(i), list.get(j));
                 if(area>area1){
                    area1=area;
                 } 
                 //area1 = Math.max(area,area1);
            }
        }
        System.out.println(area1);
    }
}
