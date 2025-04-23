package arraylist;

import java.util.ArrayList;

public class swapping {
    public static void main(String[]args){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(6);
        list.add(9);
        System.out.println(list);
        int i1=2;
        int i2=1;
        int temp=list.get(i1);
        list.set(i1,list.get(i2));
        list.set(i2,temp);
        System.out.println(list);
    }
}
