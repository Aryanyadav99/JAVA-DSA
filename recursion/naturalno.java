package recursion;
  
public class naturalno {
    public static void natno(int n){
        if(n==0){
            return;
        }
       System.out.println(n);
       natno(n-1);
    }
    public static void main(String[] args) {
        natno(10);
    }
}
