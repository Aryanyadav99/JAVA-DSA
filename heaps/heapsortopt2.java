//in more good and expert way

package heaps;
public class heapsortopt2 {
    public static void heapsortopt(int array[]){
        //forming the heap
        if(array.length==0 || array.length==1){
            return;
        }
        int si=1;
        for(int i=si;i<array.length;i++){
              upheapify(array,i);
        }
        // destroying the heap for sorted array
        int ei=array.length-1;
        while(ei>0){
            int temp=array[ei];
            array[ei]=array[0];
            array[0]=temp;
            ei--;
            downheapify(array,ei);
        }
    }
    public static void upheapify(int array[],int i){
        int ci=i;
        int pi=(ci-1)/2;
        while(pi>=0){
            if(array[pi]<array[ci]){
                //swap
                int temp=array[pi];
                array[pi]=array[ci];
                array[ci]=temp;
                ci=pi;
                pi=(ci-1)/2;
            }
            else{
                return;
            }
        }
    }
    public static void downheapify(int array[],int ei){
        int pi=0;
        int li=2*pi+1;
        int ri=2*pi+2;
        while(li<=ei){
            int max=pi;
            if(array[max]<array[li]){
                max=li;
            }
            if(ri<=ei && array[max]<array[ri]){
                max=ri;
            }
            if(pi==max){
                return;
            }
            //swap
            int temp=array[pi];
            array[pi]=array[max];
            array[max]=temp;
            pi=max;
            li=2*pi+1;
             ri=2*pi+2;
        }
    }
    public static void main(String[] args) {
        int array[]={5,3,1,8,4,0,2,4,0,2,4,3};
        heapsortopt(array);
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
