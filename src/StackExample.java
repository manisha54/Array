public class StackExample{
    int stk[];
    int top=1;
    int size;
    StackExample(int size){
        stk = new int[size];
        this.size =size;
    }
    public boolean push(int data){
        if (isFull()){
            System.out.println("stack overflow");
            return false;
        }
// top++;
        stk[++top]=data;
        return true;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println(" Stack underflow");
            return -999999;
        }
        return stk[top--];

    }



    public boolean isEmpty(){
        return top == size -1;
    }




    public boolean isFull(){
// if(top=size-1){
// return true;
// }
// return false;
        return top == size-1;
    }
}