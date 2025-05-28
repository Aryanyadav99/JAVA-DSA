package slidingwindow;//type 1 problem here we have to find the max sum of a subarray consist 4 element

public class constwindow {
    public static void main(String[] args) {
        int array[]={-1,2,3,3,4,5,-1};
        int k=4;
        //for that we have to make a const window of size k
        int lp=0;
        int rp=lp+k-1;
        int sum=0;
        int maxsum=0;
        //find the sun of first four elemnts 
        for(int i=lp;i<=rp;i++){
            sum=sum+array[i];
        }
        maxsum=sum;
        System.out.println(maxsum);
        //now move the window and find the max sum
        while(rp<=array.length-1){
            sum=sum-array[lp];
            sum=sum+array[rp];
            maxsum=Math.max(maxsum, sum);
            System.out.println(maxsum);
            lp++;
            rp++;
        }
        System.out.println(maxsum);
    }
}
