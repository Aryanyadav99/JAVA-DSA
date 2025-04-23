package recursion;

public class sumofn {
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int ans=sum(n-1);
        return ans+n;
    }
    public static void main(String[] args) {
       int val= sum(10);
       System.out.println(val);
    }
}
