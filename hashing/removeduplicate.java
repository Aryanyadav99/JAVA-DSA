package hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class removeduplicate {
    public static ArrayList<Integer>al=new ArrayList<>();
    public static void removedup(int array[]){
        HashMap<Integer,Boolean>map=new HashMap<>();
        for(int i=0;i<array.length;i++){
            if(! map.containsKey(array[i])){
               al.add(array[i]);
               map.put(array[i],true);    
            }
        }
    }
    public static void main(String[]args){
        int array[]={1,3,2,2,3,1,6,2,5};
        removedup(array);
        System.out.println(al);
    }
}
