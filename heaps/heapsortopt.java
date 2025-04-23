// heap sort without any space 
package heaps;
public class heapsortopt {
    public static void heapsorting(int array[]){
       // firstly we have to build heap
       buildheap(array);
       arrange(array);
    }
    public static void buildheap(int array[]){
       for(int i=1;i<array.length;i++){
        int ci=i;
        int pi=(ci-1)/2;
        while(ci>0){
              if(array[pi]>array[ci]){
                int temp=array[ci];
                array[ci]=array[pi];
                array[pi]=temp;
              }
              ci=pi;
                pi=(ci-1)/2;
        }
       }
    }
    public static void arrange(int array[]){
            for(int i=array.length-1;i>0;i--){
                //swap
                int temp=array[0];
                array[0]=array[i];
                array[i]=temp;
                int pi=0;
                int li=2*pi+1;
                int ri=2*pi+2;
                while(li<i){
                    int min=pi;
                    if(array[min]>array[li]){
                        min=li;
                    }
                    if(ri<i&& array[ri]<array[min]){
                        min=ri;
                    }
                    if(min==pi){
                        break;
                    }
                    int t=array[min];
                    array[min]=array[pi];
                    array[pi]=t;
                    pi=min;
                    li=2*pi+1;
                    ri=2*pi+2;
                }
            }
    }
    public static void main(String[] args) {
        int array[]={5,3,5,2,4,2,3,24,2,100,43,5,1,4,1,2,3};
        heapsorting(array);
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
