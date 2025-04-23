package Leetcode.rotated;
// here we have to rotate the given array by kth step or shift alll the elemnt by jth step so rotation acoour 
// approach :-- when we have to jump the indexex in array and we also have to jump in such a way if we croosing the length of array so we have to move at strat the we use a powerful operator thats modulus operator
// special property of modulo opertor is that is give rem so our ans not exceed the n
// fo use the formula (i+k)%n we got the finbal pos 
// here we also use a temp array because we have to move elemnt in that temp by help of orginal array .. it protect the overallping of element and loss of elemnt 

public class rotatedkth {
    public static void main(String[] args) {
        int array[]={3,4,5,6,1,2};
        // for gitting sorted array we have to rotate it by 2 
        int k=2;
        int temp[]=new int[array.length];
        for(int i=0;i<array.length;i++){
              temp[(i+k)%array.length]=array[i];
        }
        for(int i=0;i<array.length;i++){
            System.out.println(temp[i]);
        }
    }
}
