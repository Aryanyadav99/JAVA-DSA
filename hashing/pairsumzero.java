// not fully correct
package hashing;

import java.util.HashMap;

public class pairsumzero {
 public static void main(String[] args) {
    int array[]={2,6,4,-2,1,-6,5,2,-2,-2,2};
    HashMap<Integer,Integer>map=new HashMap<>();
    for(int i=0;i<array.length;i++){
      if(map.containsKey(array[i])){
          map.put(array[i],map.get(array[i])+1);
      }
      else{
        map.put(array[i], 1);
      }
    }
   for(int i=0;i<array.length;i++){
    if(map.containsKey(-(array[i]))){
         System.out.println("("+array[i]+" "+-array[i]+")");
    }
   }
 }
}
