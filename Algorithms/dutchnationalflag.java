/*  there is a algo named dutch national flag algo  .. dutch flag consist three color red white and blue .. 
  so this algo is used where we have to group three parts in sorted way 
  it consist of three pointers low,mid,highless like flag 
  there are three portion in this algo
  first portion contains all 0 and it ends with low-1;
  from low to mid-1; there are second section contains all 1;
  from mid to high-1 there is another section called unsorted section that damage in flag we have to fix it :-
  form highless+1 to end there is another section cconatins all 2;
  so 
  we have to consider our ques as unsorted portion and apply this algo 
  ...for more detail check striver video if unable to understand properly with code 

*/
package Algorithms;
public class dutchnationalflag {
  public static void sortColors(int[] nums) {
    int low=0;
    int mid=0;
    int high=nums.length;
    while(mid<high){// if the mid which we are moving crosses the highless then out the length of our unsorted portion is 0 or -ve so it must be sorted
        if(nums[mid]==0){// we have to move it to first
            int temp=nums[mid];
            nums[mid]=nums[low];
            nums[low]=temp;
            low++;
            mid++;
        }
        else if(nums[mid]==1){
            mid++;
        }
        else if(nums[mid]==2){
            int temp=nums[mid];
            nums[mid]=nums[high-1];
            nums[high-1]=temp;
            high--;
        }
    }
}
public static void main(String[] args) {
  int array[]={0,1,2,1,0,1,1,2,0,2,1,0,1};
  sortColors(array);
  for(int i=0;i<array.length;i++){
    System.out.print(array[i]);
  }
}
}
