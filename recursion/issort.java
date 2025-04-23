package recursion;

public class issort {
    public static boolean sort(int array[],int i){
        if(i==array.length-1){
            return true;
        }
        if(array[i]>array[i+1]){
            return false;
        }
        
        return sort(array, i+1);
    }
    public static void main(String[] args) {
        int array[]={2,3,4,5,6,6,7,8,6};
        System.out.println(sort(array, 0));
    }
}
