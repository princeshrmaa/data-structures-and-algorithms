package stack;

public class Stack {
    int top;
    int size;
    int arr[];
    //abstract data type...
    public Stack(int capacity){
    size=capacity;
    top=-1;
    arr=new int[size];
    }
    void push(int data){
    }
    int pop(){
return 0;
    }
    int peek(){
return 0;
    }
    boolean isFull(){
        return top==-1;
    }
    boolean isEmpty(){
     return top==size-1;
    }

}
