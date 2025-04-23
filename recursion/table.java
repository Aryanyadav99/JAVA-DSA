package recursion;

public class table {
    public static void printtable(int n,int i){
       if(n<i){
        return;
       }
       System.out.println(n*i);
       printtable(n, i+1);
    }
    public static void main(String[] args) {
        printtable(10, 1);
    }
}
