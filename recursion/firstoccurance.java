package recursion;
// linear serarch from strtr
public class firstoccurance {
    public static int firstocc(int array[],int i,int key){
        if(i==array.length){
            return -1;
        }
        if(array[i]==key){
            return i;
        }
        return firstocc(array, i+1, key);
    }
    public static void main(String[] args) {
        int array[]={3,2,5,4,3,2,6,1};
        System.out.println(firstocc(array, 0, 5));
    }
}
