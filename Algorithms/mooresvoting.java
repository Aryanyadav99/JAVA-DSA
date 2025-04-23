package Algorithms;
// yaha moore chacha unhone voting trick nikali jab voting jab majority chaiye vote >n/2
/*
 * simailarly yahi ques solve hoga 
 * first take a count to count something not the votes of particular it count the comparative votes 
 * and then take a winner which will consider the winner if this poll actully have a winner but if doesnt then we ahve to check it 
 * and the considertion of winner is >n/2 where nis total votes or array size
 * so iterate over the array if count ==0 that means till now no one is winner so consider the next to winner and increment the count 
 * if we got the vote against him then decrement the count .. 
 * after the full iteration we got our winner of acutally we have this will check by second iteration 
 * if the ques stats like in leetcode its tc0(n)-- beacuse winner is actually a winner 
 * but if there is not any suerity then its tc0(2n)--beacuse there wmay be no winners 
 
 */
public class mooresvoting {
    public static int findwinner(int array[]){
          int count=0;
          int winner=-1;
          for(int i=0;i<array.length;i++){
            if(count==0){
                winner=array[i];// because i is increment above we come to next ele so make it winner if count ==0;
            }
            if(winner==array[i]){// check if next ele is same as pre then increment the count 
                count++;
            }
            else{
                count--;
            }
          }// if it is sure in ques that winner exist so rerturn winner else check it
          int flag=0;
          for(int i=0;i<array.length;i++){
            if(array[i]==winner){
                flag++;
            }
          }
          if(flag>array.length/2){
            return winner;
          }
          else{
            return -1;
          }
    }
    public static void main(String[] args) {
        int votes[]={1,2,1,3,1,2,1,1,1,2,2,3,1,1};// 1 is 8 times and size is 14
        int res=findwinner(votes);
        System.out.println(res);
    }
}
