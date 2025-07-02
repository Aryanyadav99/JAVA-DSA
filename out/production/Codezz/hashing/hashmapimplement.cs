implement  on the bases of array of linked list and every indesx od array are in from of buckets which containing one or more than one nodes
1.. put 
normally putting causes the tc0(n) n-no of nodes because first we have to check is there any key exist or not 
thtas why we use hash map 
it implwmwnt hash code inbuild 
key-> hash code(hash function) ->bucket index  
so hash code work on 0(1) to convert 
then only tc is due to tracing the linked list 
so if we have balaced bucket  then the  tc 0(X);
X=n/N;
N-- no of buckets
n- no of nodes 
so x is always a constant value 
thats why put fuc tc is 0(1);
on incresing n our X will also  incresedse thtas make our tc not good 
so there is threshold for x if x become gretaer thann that we did the rehashing 
rehashing means creation of new array of linkedlist of large size so n can eqaully divided 
and the process of rehashing is 0(n) but its done very few time so we ignore it normally 
..0.. so finding bucket we use ( %bucket )thnak give the range till buvket size adnprocess called compression

2.. now how hash code can be written ?
its implemntes on bases of base to power system 
ex 1345-- 1*10pow3+3*10pow2*...
ex "abc"--a*p pow3+b*p pow2+... and (p is actually  a prime number gaves a good distribution)
why we couldnot take string as sun o thier ascaii value 
because then abc and bca have same value which are logically dierent string 
thtas why for perfrming hash code we did some minute opertaon its tc0(1);means constant
for storing class then perfrom hash code on bases on the address  
genrally object has its own hashcode  function..

3... so for any storing in hash map two function aare present hashcode and then compression

4.. there is one more problem called collision case 
when after compression two or more value gave the same index no thtas called collision case

collision handeling 
can be handke by two techniques 
1... closed hashing(separate chaninig ) **used majorly means inplement all of them in the same index through linkedlist at every index there us head of linked list
2... open hashing if one position is filled increment the value and tryout for the next value 
by linear probing -- f(a)+f(i);
by quadratic probing --f(i)--isquare faster get the empty position 
3.. double hashing ---hash the code again to get the new value 