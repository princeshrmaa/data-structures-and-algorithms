import java.util.*;

public class Queue_2 {
   public static void main(String[] args) {
       Queue<Integer> q = new LinkedList<>();
       q.add(10);//enqueue
       q.add(20);//enqueue
       q.add(30);//enqueue
       q.add(25);//enqueue
       System.out.println(q);
       System.out.println(q.poll());//dequeue
       System.out.println(q.peek());//peek
       //Priority Queue
       PriorityQueue<Integer> pq=new PriorityQueue<>();
       pq.add(50);
       pq.add(20);
       pq.add(30);
       pq.add(50);
       while(!pq.isEmpty()){
           System.out.print(pq.poll());
       }
       Deque<Integer> dq=new ArrayDeque<>();
       dq.addFirst(10);
       dq.addLast(30);
       dq.addFirst(20);
       dq.addLast(50);
       System.out.println(dq.pollFirst());
       System.out.println(dq.pollLast());
       System.out.println(" ");
    }
}
