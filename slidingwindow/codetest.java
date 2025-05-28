package slidingwindow;

// code for only sum=k
public class codetest {
    public static void main(String[] args) {
        int array[]={10,5,2,7,1,9};
        int lp=0;
        int rp=0;
        int len=0;
        int maxlen=0;
        int sum=0;
        int k=15;
        while(rp<array.length){
            sum=sum+array[rp];
            if(sum<k){
                rp++;
            }
            else if(sum==k){
                len=rp-lp+1;
                maxlen=Math.max(maxlen, len);
                rp++;
            }
            else{
                sum=sum-array[lp];
                lp++;
            }
        }
        System.out.println(maxlen);
    }
}
