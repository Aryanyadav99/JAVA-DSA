package arraylist;
import java.util.*;
public class multidimensional {
    public static void main(String[]args){
       //parent list 
       ArrayList<ArrayList<Integer>>al=new ArrayList<>();
       //child lists
       ArrayList<Integer>l1=new ArrayList<>();
       ArrayList<Integer>l2=new ArrayList<>();
       //fititing in child
       for(int i=0;i<6;i++){
        l1.add(i);
       }
       for(int i=6;i<11;i++){
        l2.add(i);
       }
       // fitting in parent 
       al.add(l1);
       al.add(l2);
       //dispaling in list format
       System.out.println(al);
       //dispklaying in 2d format
       ArrayList<Integer> Store =new ArrayList<>();
       for(int i=0;i<al.size();i++){
        Store=al.get(i);
        for(int j=0;j<Store.size();j++){
            System.out.print(Store.get(j));
        }
        System.out.println();
       }
    }
}
