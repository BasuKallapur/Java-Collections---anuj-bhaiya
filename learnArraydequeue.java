import java.util.ArrayDeque;

public class learnArraydequeue {
    public static void main(String[] args) {
        System.out.println("array dequeue is doubly-ended");
        ArrayDeque<Integer> adq= new ArrayDeque<>();
        // methods of queue can be used here
        adq.offer(12); // adds at last
        adq.offerFirst(24); // adds at beginning
        adq.offerLast(48); // adds at last (same functionality as offer(); )
        adq.offer(36);
        System.out.println(adq);
        //peek
        System.out.println("peek method");
        System.out.println(adq.peek());
        System.out.println(adq.peekFirst()); //peekFirst = peek
        System.out.println(adq.peekLast()); //peekLast
        //poll
        System.out.println("poll method");
        System.out.println(adq.poll());
        System.out.println("poll() " + adq);
        //pollFirst
        System.out.println("pollFirst method"); //same as poll
        System.out.println(adq.pollFirst());
        System.out.println("pollFirst() " + adq);
        //pollLast
        System.out.println("pollLast method");
        System.out.println(adq.pollLast());
        System.out.println("pollLast() " + adq);
    }
}
