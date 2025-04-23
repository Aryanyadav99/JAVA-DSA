package arraylist;
import java.util.ArrayList;
public class maxinlist {
    public static void main(String[]args){
        ArrayList <Integer>Al=new ArrayList<>();
        Al.add(2);
        Al.add(9);
        Al.add(1);
        Al.add(5);
        Al.add(3);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<Al.size();i++){
            if(Al.get(i)>max){
                max=Al.get(i);
            }
        }
        System.out.println(max);
    }
}
