//  in order  // best 
package heaps;

public class klargestelement {
    public static void klarge(int array[],int k){
       for(int i=0;i<k;i++){
       int c=i;
       int p=(c-1)/2;
       while( c>0 && array[c]<array[p]){
        int temp=array[c];
        array[c]=array[p];
        array[p]=temp;
        c=p;
        p=(c-1)/2;
       }
       }
       for(int i=k;i<array.length;i++){
        if(array[i]>array[0]){int temp=array[0];
        array[0]=array[i];
        array[i]=temp;
        heapify(array,0,k);}
       }
    }
       public static void heapify(int array[],int i,int size){
        int p=i;
        int lc=2*i+1;
        int rc=2*i+2;
        if(lc<size&& array[lc]<array[p] ){
            p=lc;
        }
        if(rc<size && array[rc]<array[p] ){
            p=rc;
        }
        if(p!=i){
            //swap
            int temp=array[p];
            array[p]=array[i];
            array[i]=temp;
            heapify(array,p,size);
        }
      
    }
    public static void main(String[]args){
        int array[]={4,1,6,3,7,2,9,8};
        int k=4;
        klarge(array,4);
        for(int i=0;i<k;i++){
        System.out.println(array[i]);
        }
    }
}
//  remark :- we can also make it just by heap functions 
// if want to find k min we make the max heap and reverse the logic 