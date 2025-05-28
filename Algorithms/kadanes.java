package Algorithms;
// this is a famous algo for finding the subarray of max lenght or length of subarray of max sum/product;
/*so this is a code for finding the max sum not subarray so insituation is that we have to traverses one by one
 add on sum and update max but if our sum is a negative value after addition that means it doesnt increase the sum so reset sum to 0
 and move ahead 
 */

public class kadanes {
    public static int findmaxsum(int[] nums) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int no=nums[i];
            sum=sum+no;
            max=Math.max(sum,max);
            if(sum<0){
                 sum=0;
            }
        }
        return max;

    }
    public static void main(String[] args) {
        int array[]={2,0,2,1,1,0};
      int i= findmaxsum(array);
        System.out.println(i);
    }
}

 // we can also find the min sum of subarray through kadanes algo only we have to chanfe the max to min and sum<0
// ohh if there are all +ve element then no preobme the min of them beacme the min beacuse we are making it sum evertime zero afet >0
