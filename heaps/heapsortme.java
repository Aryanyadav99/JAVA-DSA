// heap sort with extra space me
package heaps;
import java.util.*;

public class heapsortme{
    public static void heapsort(int array[]){
        ArrayList<Integer> al=new ArrayList<>();
        // add al the array elemnt in list
        for(int i=0;i<array.length;i++){
            int ele=array[i];
            al.add(ele);
            // perform up heapify
            int ci=al.size()-1;
            int pi=(ci-1)/2;
            while(ci>0){
                if(al.get(pi)>al.get(ci)){
                    //swapping 
                    int temp=al.get(pi);
                    al.set(pi, al.get(ci));
                    al.set(ci, temp);
                    
                }
                ci=pi;
                pi=(ci-1)/2;
                
            }
        }
        // now with removal add ot original array
        int i=0;
        while(!al.isEmpty()){
            int ele=al.get(0);// peek
            array[i++]=ele;
            // now del with list

            // swap the element with last

            al.set(0, al.get(al.size()-1));
            

            // remove last
            al.remove(al.size()-1);
             // now apply  down heapify
              int pi=0;
              int lci=((2*pi)+1);
              int rci=(2*pi)+2;
              
              while(lci<al.size()){ 
                int min=pi;
                if(al.get(lci)<al.get(min)){
                    min=lci;
                }
                if(rci<al.size() &&al.get(min)>al.get(rci) ){
                    min=rci;
                }
                if(pi==min){
                    //nothing ti do
                    break;
                }
                
                    // swap
                    int temp2=al.get(pi);
                    al.set(pi, al.get(min));
                    al.set(min,temp2);
                
                      pi=min;
                      lci=(2*pi)+1;
                      rci=(2*pi)+2;
              }
              

        }
    }
        public static void main(String[] args) {
        int array[]={8,2,3,4,2};
        heapsort(array);
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
// tc = for building heap its take 0(n) in copy proof and for removing its take logn for single forn n element it takes nlogn 
//so overall tc is n+nlogn
// n can be ignored in place of n logn 
// so our tc will become nlogn