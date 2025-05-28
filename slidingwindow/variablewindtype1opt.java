package slidingwindow;

//most imp type
// so this is a type of variation of sw where window is not fixed it continously variating there may be increment and decrement acc to ques 
//so the ques type is longest subarray/string with condition
// ques --lonest subarray where sun is <=k
//optimal approach 
public class variablewindtype1opt {
    public static void main(String[] args) {
        int array[]={2,5,1,7,10};
        int k=14;
        //so the way is to strt with smallestwindow and expand and compress the acc to our need
        int lp=0;
        int rp=0;
        int sum=0;
        int length=0;
        int maxlength=0;
        //the catche here is that we have to find the max length not subarray so if we got some length x then why we have to go below it make it fix 
        while(rp<array.length){
            sum=sum+array[rp];
            if(sum>k){
                sum=sum-array[lp];
                lp=lp+1;
            }
            //agar choti ho gyi aur sum satisfy kar rha  to normal process
            //otherwise treate is as constant window

            if(sum<=k){
                length=rp-lp+1;
                maxlength=Math.max(maxlength, length);
                System.out.println(maxlength);
                rp++;
            }
           else{
            lp++;
            rp++;
           }
        }
        System.out.println(maxlength);
    }
}
