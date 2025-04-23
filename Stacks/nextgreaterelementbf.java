// concept important ***
//objective:-> find next greatest element  on right side
// nge=sabse pas wala grater element on right side if not exost any put -1
package Stacks;

public class nextgreaterelementbf {
    public static void main(String[]args){
    //brute force
    int array[]={6,8,0,1,3};
    int nxtgrtr[]=new int[array.length];
    for(int i=0;i<array.length;i++){
        for(int j=i+1;j<array.length;j++){
            if(array[i]<array[j]){
                nxtgrtr[i]=array[j];
                break;
            }
            else{
                nxtgrtr[i]=-1;
            }
        }
    }
    nxtgrtr[array.length-1]=-1;
    for(int k=0;k<array.length;k++){
        System.out.println(nxtgrtr[k]);
    }
}
}
// time complexity 0(n2)