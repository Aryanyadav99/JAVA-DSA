package recursion;

public class fibooprint2 {
    public static void fibbon(int t,int a,int b,int count){
        if(count==t){
          return;
        }
        System.out.println(a);
        fibbon(t, b, a+b,count+1);
    }
    public static void main(String[] args) {
        fibbon(15, 0, 1,0);
    }

}
