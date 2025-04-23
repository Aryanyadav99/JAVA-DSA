package recursion;

public class fiboosum {
    public static int fiboo(int r,int a,int b){
       if(b>r){
        return a;
       }
       int ans=fiboo(r, b, a+b);
       return ans+a;
    }
    public static void main(String[] args) {
       int sum= fiboo(10, 0, 1);
       System.out.println(sum);
    }
}
