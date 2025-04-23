package recursion;

public class factorial {
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int ans=fact(n-1);
        return n*ans;
    }
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
