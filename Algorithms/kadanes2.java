package Algorithms;
// here we have to find that subarray also 
/* so here we have to consider two pointers one is strt and one is end
 start pointer is updated we we strt the new subarray thats occur when our sum reaches to zero 
 and when the sum>max thats we found our new subarray end so make the end to i;
 */
public class kadanes2 {
    public static int findmaxsum(int[] nums) {
        int sum=0;
        int strt=-1;
        int end=-1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int no=nums[i];
            if(sum==0){
                strt=i;
            }
            sum=sum+no;
           if(sum>max){
            max=sum;
            end=i;
           }

            if(sum<0){
                 sum=0;
            }
        }
        for(int i=strt;i<=end;i++){
            System.out.println(nums[i]);
        }
        System.out.println(".........................");
        return max;

    }
    public static void main(String[] args) {
        int array[]={2,0,2,1,1,0};
      int i= findmaxsum(array);
        System.out.println(i);
    }
}
