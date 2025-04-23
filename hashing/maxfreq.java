package hashing;

import java.util.HashMap;

public class maxfreq {
    public static void main(String[]args){
        int array[]={2,3,5,3,2,5,6,8,5,32,24,45,5,67,43,2,2,4,65,4,3};
        HashMap<Integer,Integer>map=new HashMap<>();
       for(int i=0;i<array.length;i++){
        if(map.containsKey(array[i])){
            map.put(array[i],map.get(array[i])+1);
        }
        else{
            map.put(array[i],1);
        }
       }
       int max=0;int ans=Integer.MIN_VALUE;
       for(int i:array){
          if(map.get(i)>max){
            max=map.get(i);
            ans=i;
          }
       }
       System.out.println(ans);
       System.out.println(map);
    }
}
