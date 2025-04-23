//knapsack = its just a bag
//0 1 knapsack-- solved by dynamic programming 
//given-> n items thats can be divided and thier  weight and value given capacity of knapsack aslo given
//objective -> we have to put all of tem in knapsack having capacity .. so we have to find total maxvalue of knapsack after selling those items
//approach --> choose that item have value /weight ratio is high
package greedyalgo;

import java.util.*;

public class fractionalknapsack {
 public static void main(String[]args){
    int value[]={60,100,120};
    int weight[]={10,20,30};
    int capacity=50;//capacity total
    //create a double (to got exact ratio) 2d array for sort ratio one 1st col for index and 2nd for ratio
     double ratio[][]=new double[value.length][2];
     for(int i=0;i<value.length;i++){
        ratio[i][0]=i;
        ratio[i][1]=(double)value[i]/weight[i];
     }
      // now sort by inbuild fun sort ratio acc to col 2 
      Arrays.sort(ratio,Comparator.comparingDouble(o -> o[1]));
      // thats sort ratio according(prioritize) to  col 2 in ascending order 
      //but we needed in descending because whose ratio is high we include thats most
           double result=0;
      for(int i=ratio.length-1;i>=0;i--){//thats loop to tace the ratio from max to min
          int idx=(int)ratio[i][0];//our ratio is double type for getting int index typecast it
          //ths index help to find the best valuevalbe product
          if(capacity>=weight[idx]){//check is there is space to completely fill a material 
             result = result+value[idx];//fill completely and trace the value
             capacity=capacity-weight[idx];//reduced capacity ater filling somw weight
          }
          else{
            //we cannot store complemetly so we have to store in fraction
            result=result+(ratio[i][1]*capacity);
            //only added when there is little space remained after filling completely all
            //so thats our last filling now our bag is completely full
            capacity=0;
            break;

          }
       }
        System.out.println("Maximun final value "+result);
     
    
 }   
}
