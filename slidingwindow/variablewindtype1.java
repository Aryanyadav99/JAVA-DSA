//most imp type
// so this is a type of variation of sw where window is not fixed it continously variating there may be increment and decrement acc to ques 
//so the ques type is longest subarray/string with condition
// ques --lonest subarray where sun is <=k
//better approach 
public class variablewindtype1 {
    public static void main(String[] args) {
        int array[]={2,5,1,7,10};
        int k=14;
        //so the way is to strt with smallestwindow and expand and compress the acc to our need
        int lp=0;
        int rp=0;
        int sum=0;
        int length=0;
        int maxlength=0;
        while(rp<array.length){
            sum=sum+array[rp];
             // sum exceed the limit so shrink the winodw till sum<k
             while(sum>k){
                sum=sum-array[lp];
                lp++;
            }
            if(sum<=k){
                length=rp-lp+1;
                maxlength=Math.max(maxlength, length);
                System.out.println(maxlength);
                rp++;
            }
        }
        System.out.println(maxlength);
    }
}
