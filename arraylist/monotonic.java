package arraylist;
import java.util.*;
public class monotonic{
  public static void main(String[]args){
    ArrayList<Integer>list=new ArrayList<>();
    for(int i=0;i<=5;i++){
        list.add(i);
    }
   // list.add(9);
    //list.add(7);
    boolean res=isMonotonic(list);
    System.out.println(res);
  }
  public static boolean isMonotonic(ArrayList<Integer>list){
       boolean asc=true;
      boolean des=true;
      for(int i=0;i<list.size()-1;i++){
        if(list.get(i)>list.get(i+1)){
            asc=false;
        }
        if(list.get(i)<list.get(i+1)){
            des=false;
        }
      }
      return asc||des;
  }
}