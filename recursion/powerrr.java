package recursion;

public class powerrr {
    public static int power(int x,int y){
        if(y==0){
            return 1;
        }
       int res= power(x, y-1);
       return res*x;
    }
    public static void main(String[] args) {
        System.out.println(power(2, 5));
    }
}
