package heaps;
//by aryan
public class heapsortoptme{
    public static void sort(int array[]){
        // bi boundary exapnd // here we can also take for loop instead of while
        int bi=1;
        while(bi<=array.length-1){
           int ci=bi;
           int pi=(ci-1)/2;
           while(ci>0){
            if(array[pi]>array[ci]){
                //swapping 
                int temp=array[pi];
                array[pi]=array[ci];
                array[ci]=temp;
            }
            ci=pi;
            pi=(ci-1)/2;
           }
           bi++;
        }
        
        // uptill this our heap elemts added in finited and perfect form 
        // now arrange in ascending form thorugh removal
        // lf limiting factor
           int lf=array.length-1;
           while(lf>0){
            int temp=array[0];
            array[0]=array[lf];
            array[lf]=temp;
            lf--;
            // now take limiting fatctor  limit ya compress ho rha hai
            int pi=0;
            int lci=1;
            int rci=2;
            while(lci<=lf){
                int min=pi;
                if(array[lci]<array[min]){
                    min=lci;
                }
                if(rci<=lf && array[rci]<array[min]){
                    min=rci;
                }
                if(min==pi){
                    break;
                }
                // swapping 
                int temp2=array[min];
                array[min]=array[pi];
                array[pi]=temp2;
                pi=min;
                lci=(2*pi+1);
                rci=(2*pi+2);
            }
           }
               
    }
    public static void main(String[] args) {
        int array[]={5,3,1,8,4,0,2,4,0,2,4,3};
        sort(array);
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}