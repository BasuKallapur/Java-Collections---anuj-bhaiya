import java.util.LinkedList;
import java.util.Queue;

public class learnLinkedlist {
    public static void main(String[] args) {
        Queue<Integer> queue= new LinkedList<>();
        queue.offer(12);
        queue.offer(24);
        queue.offer(36);
        System.out.println(queue);
        // offer(): is used to add elements
        queue.offer(55);
        System.out.println("after added new element to queue: " + queue);
        // poll(): removes first element in queue
        System.out.println("element removed using poll is: " + queue.poll());
        System.out.println(queue);
        // peek(): tell which element is nextinlcine (which element will come out next)
        System.out.println("first element is : " + queue.peek());



    }
}
