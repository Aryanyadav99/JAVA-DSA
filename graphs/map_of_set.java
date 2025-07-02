package graphs;

import java.util.HashMap;

public class map_of_set {
    public static void main(String[] args) {
        HashMap<Integer,HashMap<Integer,Integer>>hm=new HashMap<>();
        // parent hm key-- source
        //child hm key--destination and value --edge weight
        int v=5;// no of verticces
        for(int i=0;i<=v;i++){
            hm.put(i,new HashMap<>());
        }
        //put the edges
        hm.get(0).put(1,100);
        hm.get(0).put(2,100);
        hm.get(1).put(2,100);
        hm.get(2).put(0,100);
        hm.get(1).put(0,100);
        hm.get(2).put(1,100);

        //print desti and weight of all the sources
        for(int i:hm.keySet()){
            for(int j:hm.get(i).keySet()){
                System.out.println("source: "+i +"desti: "+j +"weight: "+hm.get(i).get(j));
            }
        }
    }
}
