import java.util.Queue;
import java.util.Comparator;
import java.util.PriorityQueue;;

public class learnPriorityQueue {
    //here all methods of queue like peek, poll, offer are valid for priorityqueue as well, becuase pq is getting implemeted by queue itself.
    public static void main(String[] args) {
        // //Min-heap
        // System.out.println("Priority quee");
        // Queue<Integer> pq= new PriorityQueue<>();
        // pq.offer(40);
        // pq.offer(12);
        // pq.offer(24);
        // pq.offer(36);
        // System.out.println(pq); // smallest element gets highest priority
        // pq.poll();
        // System.out.println(pq); //removes highest priority value
        // System.out.println(pq.peek());

        //max-heap
        System.out.println("Priority quee");
        Queue<Integer> pq= new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(40);
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);
        System.out.println(pq); // smallest element gets highest priority
        pq.poll();
        System.out.println(pq); //removes highest priority value
        System.out.println(pq.peek());

    }
}
