package recursion;

public class nthfibbo {
    public static int fibbo(int t,int a,int b,int c){
        if(c==t){
            return a;
        }
       int ans= fibbo(t, b, a+b, c+1);
        return ans;
    }
    public static void main(String[] args) {
       System.out.println( fibbo(7, 0, 1, 1));
    }
}
