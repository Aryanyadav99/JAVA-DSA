hashing is the way to change the value of given value or type  throught a function 
by using hashing we can implement 2 major ds thats are 
map
set
1.. maps
 -hashmap  -- for storing table of data here the data are in undefined order
 -linkedmap  
 -treemap
2.. sets
  -hashset
  -linkedset
  -treeset

for finding the max occurance char we use array but for finding the max occurance of a word thtas not possible by array
in array the limitation is where you storing is always a integer (index) thats key
but by using hashmap key is not limited to integer it can be any type 
1...***its storing key value pair of any type of data 
2.. there must be key should be unique .there will not multiple keys

operations on hashmap
1.. put(key,value); for insertion if there is already a kew then key remains same value should be ovewritten
2.. get(key);search value for given key
3.. remove(key);removing the key
4.. containskey(key)--check whwather key is exist or not 

implemtations 
1.. one way --linked list
tc insertion -- 0(n) first search is there is any key is present or not  then insert it
 get-0(n)
 remove 0(n)
 thtas poor thing its tc is 0(n) 

 2.. second way --BBST h=logn also called treemap used when need ordering 
 insert-0(logn);
 remove0(logn);
 get 0(logn);

 3.. using hash table 
 all of then are 0(1);
 for ordering tree is more better hash