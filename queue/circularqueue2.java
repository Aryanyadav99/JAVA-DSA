package queue;
public class circularqueue2{
    static class queue{
        int array[];
        int front=-1;
        int rear=-1;
        int size;
        queue(int n){
        array=new int[n];
        }
        // isempty
        public boolean isEmpty(){
            return rear==-1 && front==-1;
        }
        //size
        public int size(){
            return size;
        }
        //add
        public void add(int data){
           rear++;
           if (rear==array.length) {
            rear=0;
           }
           array[rear]=data;
           size++;
           if(front<rear){
            front=0;
           }
        }
        // remove
        public int remove(){
            if(rear==-1 && front==-1){
                 System.out.println("queue not exist");
                 return -1;
            }
            if(front==rear){
                int data=array[front];
                front=-1;
                rear=-1;
                return data;
            }
            int data=array[front];
           front++;
           if (front==array.length) {
            front=0;
           }
            return data;
        }
        //peek
        public int peek(){
            return array[front];
        }

    }
       public static void main(String[] args) {
        queue q=new queue(10);
       
        for(int i=0;i<10;i++){
            q.add(i);
        }
       q.remove();
       q.add(13);
       while (!q.isEmpty()) {
        System.out.println(q.peek());
        q.remove();
       }
       }
}


