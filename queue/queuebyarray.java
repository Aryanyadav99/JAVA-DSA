package queue;
public class queuebyarray{

    static class q{
       static  int array[];
       static int size;
       //in array fornt is always 0
       //but rear always changes so take a rear
       static int rear;
        q(int n){
           array=new int[n];
           size=n; 
            rear=-1;
        }

        //operations

        //1->isempty
        public  boolean isEmpty(){
            return rear==-1;
        }
        

        //2-> add function
        public  void add(int data){
          if(rear==size-1){
            System.out.println("cannt add queue is full");
            return;
          }  
          rear=rear+1;
          array[rear]=data;
        }
        
        //3--> remove function
        public  int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
             //same as deletion in normal array but here we delete a front 
            int front =0;
            for(int i=0;i<rear;i++){
                array[i]=array[i+1];
            }
            rear=rear-1;
            //here rear will decreased by one because we shifted all data one step back
            return array[front] ;
        }
        
        //4->peek -->
        public int peek(){
            return array[0];
        }

    }
    public static void main(String[]args){
       q q=new q(10);
       //5 is size of array
       for(int i=0;i<3;i++){
        q.add(i);
       }
       while(!q.isEmpty()){
        System.out.println(q.peek());
        q.remove();
       }
    }
}
