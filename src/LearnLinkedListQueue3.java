import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue3 {

    public static void main(String[] args) {
    	Queue<Integer> queue =new LinkedList<>();
    	
        queue.offer(12);
        queue.offer(24);
        queue.offer(36);
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue);
       

       //offer and poll for add remove

    }
}
