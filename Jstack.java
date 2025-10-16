public class Jstack {

    public static void main(String args[]){
        Stack stack=new Stack(5);
        stack.pop();
        stack.push(4);
        stack.push(42);
        stack.display();
        System.out.println("Top elemet is:"+ stack.peek());
        stack.pop();
        stack.display();
    }
}
class Stack{
    int top;
    int[] arr;
    int capacity;
    
    Stack(int size){
        arr=new int[size];
        capacity=size;
        top=-1;
    }
    void push(int x){
        if(isFull()){
            System.out.println("Stack overflow!");
            return;
        }
        arr[++top]=x;
        System.out.println(x+" is pushed into your Stack");

    }
    int pop(){
        if(isEmpty()){
            System.out.println("Stack underflow");
            return -1;
        }
        return arr[top--];
    }
    int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top];
    }
    boolean isEmpty(){
        return top==-1;
    }
    boolean isFull(){
        return top==capacity-1;
    }
    void display(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack elements:");
        for(int i=0;i<=top;i++){
            System.out.println(arr[i]+" ");

        }
        System.out.println();
    }
}