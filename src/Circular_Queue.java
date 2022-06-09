public class Circular_Queue {
    int rear=-1;
    int front=-1;
    int []queues;
    int size;

    Circular_Queue(int size){
        this.size = size;
        queues =new int[size];
    }
     public boolean enqueue(int data){
         if (isfull()) {

             System.out.println("queue is overflow");
             return  false;
         }
         if (front == -1) {
             front=0;
         }
         rear=(rear+1)%size;
         queues[rear]=data;
         return true;
     }
     public int dequeue(){
        if (isEmpty()){
            System.out.println("queue is underflow");
            return  -999999;
        }
        int val = front;
        if(front==rear){
            front=rear=-1;
        }
        else {
            front= (front+1)%size;
        }
        return queues[val];

     }
     public boolean isEmpty(){
        return front==-1;
     }

     public boolean isfull(){
        return (rear+1)%size == front;

    }
    public static void main(String[] args) {
        Circular_Queue q = new Circular_Queue(5);
        q.enqueue(10);
        q.enqueue(20);
        System.out.println(q.dequeue());
    }

}
