package Leetcode.pascalltriangle;

// as you know pascal triangle structure so there is approxx three possible question that migh asked 
//1,, find element at i th row and jth col 

// concept -- the concept for finding the ele is do i-1 c j-1 like ncr and use the optimal sol for this
// ponit to remeber i-1 j-1 not i and j 
// and we take row and col from for 1 not from 0 for simple calc and finding logic beacuse it has many pattern to solve 
public class problem1 {

    // optimal way to find the ncr 
    public static long ncr(int n,int r){
        if(r>n-r){
            r=n-r;
        }
        long res=1;// take long beacuse ncr gave too much large value for small ques
        for(int i=0;i<r;i++){ // beacuse int num there is 8*7*6.... for 8! so num necrement one by moving forwad but at strt no decement 
           res=res*(n-i);
           res=res/(i+1);
        }
        return res;
    }
    public static void main(String[] args) {
       // we have to find the ele in pas traingle 
       //given
       int row=5;
       int col=3;
       long ele=ncr(row-1,col-1); // find r-1 c c-1
       System.out.println(ele);
    }
}
