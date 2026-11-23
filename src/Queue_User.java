import java.util.Scanner;

public class Queue_User {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int size=sc.nextInt();
       Linear_Queue q= new Linear_Queue(size);
        System.out.println(q.front);
        System.out.println(q.rear);
        System.out.println(q.capacity);
        System.out.println(q.isEmpty());
        System.out.println(q.isFull());
        q.enqueue(10);
        q.enqueue(15);
        q.enqueue(30);
        q.enqueue(20);
        q.display();
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.isEmpty());
        q.enqueue(10);
        q.display();
    }
}
