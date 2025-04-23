package heaps;
public class ksamllement {
    public static void ksmallestelement(int array[],int k){
        //let first k elent are  our elemt 
        for(int i=1;i<k;i++){
              upheapify(array,i);
        }
        for(int i=k;i<array.length;i++){
           if(array[i]<array[0]){
            int temp=array[0];
            array[0]=array[i];
            array[i]=temp;
            downheapify(array,k);
           }
            
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
        int array[]={4,1,6,3,7,2,9,8};
        ksmallestelement(array,4);
        for(int i=0;i<4;i++){
            System.out.println(array[i]);
        }
    }
}
