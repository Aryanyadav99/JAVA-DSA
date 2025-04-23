package heaps;
public class heapsort3 {
    public static void heapsort(int heap[]){
        if(heap.length==0){
            return;
        }
        // make a dummy array for construction of heap 
        int dummy[]=new int[heap.length];
        for(int i=0;i<heap.length;i++){
             dummy[i]=heap[i];
             upheapify(dummy,i);
        }
        for(int i=0;i<dummy.length;i++){
            heap[i]=dummy[0];
            dummy[0]=dummy[dummy.length-i-1];
            downheapify(dummy,0,dummy.length-i-2);
        }
    }
    public static void upheapify(int dummy[],int i){
       
        int ci=i;
        int pi=(ci-1)/2;
        while(pi>=0){
            if(dummy[ci]<dummy[pi]){
                //swap
                int temp=dummy[pi];
                dummy[pi]=dummy[ci];
                dummy[ci]=temp;
                ci=pi;
                pi=(ci-1)/2;
            }
            else{
                return;
            }
        }
    }
    public static void downheapify(int dummy[],int si,int ei){
        int pi=si;
        int li=2*pi+1;
        int ri=2*pi+2;
        while(li<=ei){
            int min=pi;
            if(dummy[min]>dummy[li]){
                min=li;
            }
            if(ri<=ei && dummy[min]>dummy[ri]){
                min=ri;
            }
            //swap
            if(min==pi){
                return;
            }
            int temp=dummy[pi];
            dummy[pi]=dummy[min];
            dummy[min]=temp;
             pi=min;
             li=2*pi+1;
             ri=2*pi+2;
        }
    }
    public static void main(String[] args) {
        int heap[]={8,2,3,4,2};
         heapsort(heap);
         for(int i=0;i<heap.length;i++){
            System.out.println(heap[i]);
         }
    }
}
