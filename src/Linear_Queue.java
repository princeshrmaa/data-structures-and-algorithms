public class Linear_Queue {
    int arr[];
    int capacity;
    int front,rear;
    public Linear_Queue(int capacity){
       front=0;
       rear=0;
       this.capacity = capacity;
       arr=new int[capacity];
    }
    void enqueue(int data){
        if(isFull()){
            System.out.print("Queue Overflow ! Queue is Full");
            return;
        }
        arr[rear]=data;
        rear=(rear+1)%capacity;
        System.out.println(data + " added successfully");
    }
    int dequeue(){
        if(isEmpty()){
            System.out.println("Queue Underflow ! Queue is Empty");
            return -1;
        }
        int var=arr[front];
        front=(front+1)%capacity;
        if(front==rear){
            front=0;
            rear=0;
        }
        return var;
    }
    int peek(){
        if(isEmpty()){
            System.out.println("Queue Underflow ! Queue is Empty");
            return -1;
        }
        return arr[front];
    }
    void display(){
        for(int i=front;i<rear;i++){
            System.out.println(arr[i]+" -> ");
        }
    }
    boolean isEmpty(){
        return front==rear;
    }
    boolean isFull(){
        return rear==capacity;
    }
}
