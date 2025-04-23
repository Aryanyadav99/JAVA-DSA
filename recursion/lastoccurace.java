package recursion;

public class lastoccurace {
    public static int lastocc(int array[],int i,int key){
        if(i<0){
            return -1;
        }
        if(array[i]==key){
            return i;
        }
        return lastocc(array, i-1, key);
    }
    public static void main(String[] args) {
        int array[]={3,2,5,4,3,2,6,1};
        System.out.println(lastocc(array, array.length-1, 2));
    }   
}
