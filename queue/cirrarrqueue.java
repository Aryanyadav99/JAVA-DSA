//objective :-> to implement a circular queue using array
//reaon:->because normal queueu implentation with array take 0(n)for removing a fun  it make remove time completixty to 0(1);
//here we shift front instead of shifting numbers and shift rear to aage menas move rear from last to 0th index then 1 then 2 and so on
//we can transfer rear from last to 0th and moving 1 2 so on index by formula rear=(rear+1)%size;
// of rear make our queue circular  
//if front will go end then update by front=(front+1)%size;
//for check queu is full or not check by rear(rear+1)==front yani rear ko ek badya aur vaha hame front mil gya 
package queue;

public class cirrarrqueue {
    static class queue
   {  static int array[];
     static int size;
     static int front;
     static int rear;
     queue(int n){
        array=new int[n];
        size=n;
        front =0;
        rear=-1;
        }
     public boolean isEmpty(){
     return( rear==-1&&front ==-1);
     }
     //in circular queue there is nedd to check queue is full or not 
       public boolean isfull(){
     return (rear+1)%size==front;
     }
      public void add(int data){
        if(rear==size-1){
            System.out.println("queue id full");
            return ;
        }
        //add first element 
        if(front ==-1){
            front =0;
        }
         rear=(rear+1)%size;
         array[rear]=data;
         return;
      }
      public int remove(){
        //case 1:-> queue not exist
        if(rear==-1&&front==0){
            System.out.println("queue doent exist");
            return-1;
        }
        //case 2 :-> queue is empty
        else if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        int res =array[front];
        //case 3:-> queue coantains onlly one data
        if(rear==front){
            rear=front=-1;
        }
        else {
            front=(front+1)%size;
        }
        return res;
      }
      public int peek(){
        return array[front];
      }
   }
    public static void main(String[]args){
        queue q=new queue(5);
        q.add(1);
        q.add(2);
        q.add(5);
        q.add(4);
        q.add(5);
        q.remove();
        q.remove();
        q.add(12);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
 
}
