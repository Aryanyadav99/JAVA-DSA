package hashing;
import java.util.*;
public class inbuildhashmap {
    public static void main(String[]args){
        HashMap<String,Integer> map=new HashMap<>();
// 1.. insert
        map.put("abc",1);
        map.put("def",3);
        map.put("abc", 10);
        map.put("aaa", 10);
//2.. size of map
        System.out.println(map.size());
        // check wheather the kew is present in map or not 
        int v=0;
        if(map.containsKey("abc")){
            System.out.println("map has abc");
            v=map.get("abc");
        }
 //3.. get value
        System.out.println(v);
        // if we find non kew value it shows null pointer exception
        // so never use .get directly first check wheater key is present or not then only do .get 
        int v1=0;
        if(map.containsKey("abc1")){
            v=map.get("abc1");
        }
        System.out.println(v1);
        // now we get 0 insted of null pointer exception

 //4... remove
        map.remove("abc");
        if(map.containsKey("abc")){
            System.out.println("map has abc");
        }
        // if key is not there remove function doesnt gave any expection 
        // all uper tc is 0(1)
        //iterate in map
//5..set fromation 
          Set<String>keys=map.keySet(); //tc0(n)
          // the function is keyset which gave keys on another ds called set 
//6.. for itertion in hash map or now in set we use foreach loop   for(datatype itertor:setname or parent value)
          for(String k:keys){
            System.out.println("key= "+k+" value= "+map.get(k));
          } 
          // contains value also a fun find the value present or not have tc 0(n) n = no of keys
          // because it go evevry key to match the value
//4.. clear fun 
          //hm.clear used to clear out hm complete;y
// isEmpty
          // check map is empty or not 

    }
}
