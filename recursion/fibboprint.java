package recursion;

public class fibboprint {
    public static void fibbon(int r,int a,int b){
        if(a>r){
          return;
        }
        System.out.println(a);
        fibbon(r, b, a+b);
    }
    public static void main(String[] args) {
        fibbon(10, 0, 1);
    }
}
