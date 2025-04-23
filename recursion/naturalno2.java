package recursion;

public class naturalno2 {
    public static void naturalno(int n,int i){
          if(i>n){
            return ;
           }
          System.out.println(i);
          naturalno(n, i+1);
    }
    public static void main(String[] args) {
        naturalno(10, 1);
    }
}
