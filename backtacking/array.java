package backtacking;

public class array {
    public static void arraytraversal(int array[],int i){
        if(i>array.length-1){
            return;
        }
        array[i]=i+1;
        arraytraversal(array, i+1);
        array[i]=array[i]-2;// backtracking step
    }
    public static void main(String[] args) {
        int array[]=new int[6];
        arraytraversal(array, 0);
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
