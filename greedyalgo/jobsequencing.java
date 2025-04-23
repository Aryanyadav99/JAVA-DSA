// given -> An array of jobs in which every job has a deadline and profit we must have to finish before deadline ,and every job takes singke unit of time
//objective -> Maximise the total profit if only one job can be secheduled at a time
// greedy rules mostly
//1.. jiska max chiaye ho uske bases me sorting kar do 
//2..agar ek man ek min chaiyte to ratio leke uske bases me sorting kar do 
package greedyalgo;
import java.util.*;
public class jobsequencing {
    public static void main(String[]args){
        int job[][]={{4,20},{1,10},{1,40},{1,30}};
        ArrayList<Integer>al=new ArrayList<>();
        Arrays.sort(job,Comparator.comparingDouble(o->o[1]));
        int time =0;
        int profit=0;
        for(int i=job.length-1;i>=0;i--){
            if(job[i][0]>time){//deadline compare
              al.add(i);
              time++;
              profit=profit+job[i][1];
            }
        }
        System.out.println(al);
        System.out.println(profit);
    }
}
