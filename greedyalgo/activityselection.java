//we can use same concept in disjoint set , max meeting in a room
// Given -> we have n activities with their start and end times
//            activies are sorted acc to end time
//objective-> find the max no of activities that can be performed by a single person,
//assuming ->that person can only work on a single activity in a time
// input (start=[10,12,20]end=[20 25 30] ) 3 actiivtes
// output 2  AO & A2;
//understand by graph on copy 
//we have to find non overlalpping or disjoint work
//sorting  must bases on end time  in ascending order so always activity became fast finish
 //check a shortest first  activity and find all disjoint activity
 //for disjoint activity start time >= last end time  
 //increment count
 //this is best approach for that type of activity
package greedyalgo;
public class activityselection {
    public static void main(String[]args){
        int start[]={1,3,0,5,8,5};
        int end  []={2,4,6,7,9,9};
        int res = actsel(start,end);
        System.out.println("max activities"+ res);
    }
    public static int actsel(int start[],int end[]){
        //since end is already sorted in ascending order find all disjoint element 
        int maxAct =0;
        //  1st activity to pahle perform hi hogi uske bad apne pas max time hai baki sab activites ko ktm karne ka
        maxAct=1;
        int lastEnd= end[0];
        for(int i=1;i<end.length;i++){
             if(start[i]>=lastEnd){
                //activity selected 
                maxAct++;
                lastEnd=end[i];
             }
        }
        return maxAct;
    }
    //we can use array list to store  which activity you selected 
}
