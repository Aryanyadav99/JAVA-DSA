// given -> we have infinte supply of money (1,2,5,10,20,50,100,500,2000)
// objective:-> find the min no of coins/notes to amke chane of value v..
package greedyalgo;
import java.util.*;
public class indiancoins {
    public static void main(String[]args){
        int money[]={2000,500,100,50,20,10,5,2,1};
        ArrayList<Integer>ans=new ArrayList<>();
        int value=5001;
        int count=0;
        for(int i=0;i<money.length;i++){
            while(money[i]<=value){
                ans.add(money[i]);
                value=value-money[i];
                count++;
            }
        }
        System.out.println(count);
        System.out.println(ans);
    }
}
