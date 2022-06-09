public class QueuqExample {
    int Queue[];
    int front=-1;
    int rear=-1;
    int size;
    QueuqExample(int size){
        this.size=size;
        Queue = new int[size];
    }
    public boolean enqueue(int data){
        if(isFull()){
            System.out.println("queue overflow");
            return false;
        }

        if(front==-1){
            front=0;
        }
        Queue[++rear]=data;
        return true;
    }
    public int dequeue(){
        if (isempty()){
            System.out.println("queue is underflow");
            return -9999999;
        }
        int val=front;
        if(front==rear){
            front=rear=-1;
        }
        else {
            front++;
        }

        return Queue[val] ;
    }
    public boolean isempty(){
        return front==-1;
    }
    public boolean isFull(){
        return rear==size-1;

    }

    public static void main(String[] args) {
        QueuqExample q = new QueuqExample(5);
        q.enqueue(10);
        q.enqueue(20);
        System.out.println(q.dequeue());

    }
}
