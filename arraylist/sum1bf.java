//objective:-- to check whose two value sum in al is equal to target sum;
package arraylist;
import java.util.*; 
public class sum1bf {
    public static void main(String[]args){
        ArrayList < Integer > list = new ArrayList <> ();
        list.add (1);
        list.add (8);
        list.add (6);
        list.add (2);
        list.add (5);
        list.add (4);
        list.add (8);
        list.add (3);
        list.add (7);
        int target=10;
        int a=0;
        int b=0;
        int sum=0;
        for(int i=0;i<list.size();i++){
            for( int j=i;j<list.size();j++){
                sum=list.get(i)+list.get(j);
                if(sum==target){
                    a=i;
                    b=j;
                    break;
                }
            }
            if(sum==target){
                break;
            }
        }
        System.out.println(list.get(a)+" "+list.get(b));
    }
}
