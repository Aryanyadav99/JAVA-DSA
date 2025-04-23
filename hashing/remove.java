package hashing;
import java.util.ArrayList;
import java.util.HashMap;

public class remove{
    public static void main(String[] args) {
        int array[]={2,1,34,12,32,0,1,2,1,3,1,2,3,1,430,0,4,213};
        ArrayList<Integer>output=removedub(array);
        System.out.println(output);
    }
    public static ArrayList<Integer> removedub(int array[]){
        ArrayList<Integer>output=new ArrayList<>();
        HashMap<Integer,Boolean>hm=new HashMap<>(); // not compul to take boolean it doesnt use here 
        for(int i=0;i<array.length;i++){
          if(hm.containsKey(array[i])){

          }  
          else{
            output.add(array[i]);
            hm.put(array[i], true);
          }
        }
        return output;
    }
}