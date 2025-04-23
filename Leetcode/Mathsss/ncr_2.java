package Leetcode.Mathsss;
// as we can find ncr by using n!/r!*(n-r)!   so we can easily find factorial through loop or recursion but it take the tc0(n+r+(n-r))

// instead of this we can eaily find ncr through the Math and logic thtas for 7c3  we have (7*6*5*4*3*2*1)  /  (3*2*1)  * (4*3*2*1)
//but we can finally simplified it and got  7*6*5/3*2*1  so we can observe the upper limit have to reach till the rnage of r or bits of r so we can use loop and find it 
// in 0(r+r) if we find seperately  and 0(r) if we find in one pass but we have to follow here some edge cases  

// well there might be a case when er got n-r is smaller than r then like   7c5  we have (7*6*5*4*3*2*1)  /  (5*4*3*2*1)  * (2*1)
// so here do some simplication and curr the r part then we have only n-r part thstd behave like r part 
public class ncr_2 {
    public static void main(String[] args) {
        int n=20;
        int r=10;
        if(r>n-r){
            r=n-r;
        }
        long res=1;
        for(int i=0;i<r;i++){
             res=res*(n-i); //  so in first pass it has 70 then go for divide then 69 then so on
             res=res/(i+1);// so in after res multiplieed with 70 then we divide with 1 then 2 then so on 
             // its like 70/1 * 69/2 * 68/3 ......so on
        }
        System.out.println(res);
    }
}
