// senario we have to find the intersection of elemnt of array
// given two array
// appraoch 1 -- pick the elemt from array one and search on array two if present then print it and make the aelemnt to array 2 to -ifi or +infi so get rid from duplicates 
// but its tc(m*n) m size of array 1 and n is for 2
// approach 2-- instead of using linear search we can use binary search so sort the sammlest one and compare from other one  its ic is 0(nlogn)+0(mlogn)
// its a decent approach but the problrm is that if there is dublicates then it fails because now we cannot make it -infi or +infi because you need to again sort the array
//  well there is one more methof sort both the array compare one with one if equal then got intersection increment both if not equal increment the smallest one 
// its tc 0(mlogm)+0(nlogn)+O(m+n)min is tc merging  others are of soting 

// the last and the best approach is to use hash map
package hashing;

import java.util.HashMap;

public class intersection {
  public static void main(String[]args){
    int array1[]={1,2,4,7,2,1,4,6,2,2,45,5};
    int array2[]={2,5,3,4,5,87,9};
    HashMap<Integer,Integer>map=new HashMap<>();
    for(int i=0;i<array1.length;i++){
        if(!map.containsKey(array1[i])){
            map.put(array1[i],0);
        }
        else{
            map.put(array1[i], map.get(array1[i])+1);
        }
    }
    for(int i=0;i<array2.length;i++){
       if(map.containsKey(array2[i])){
        System.out.println(array2[i]);
        map.put(array2[i], map.get(array2[i])-1);
       }
    }
  } 
}

//tcO(n+m);