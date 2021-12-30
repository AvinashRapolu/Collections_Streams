import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Que
{
    // queue is first in first out
    public static void que()
    {
        // offer = add
        // poll = remove
        //peek = look at next element
        Queue<Integer> line=new LinkedList<>();
        line.offer(14);
        line.offer(16);
        line.offer(8);
        line.offer(99);
        line.offer(17);
        System.out.println("this is the queue: "+ line);
        System.out.println("this is the first element to drop "+ line.peek());
        line.poll();
        System.out.println("now this is the queue: "+ line);
    }
    public void preque()
    {
        //in the priority queue the first letter will be smallest in the list
        // Comparator.reverseOrder() inside the priorityqueue function will reverse the priority order
        //Queue pq =new PriorityQueue(Comparator.reverseOrder());
        Queue pq =new PriorityQueue();
        pq.offer(14);
        pq.offer(16);
        pq.offer(8);
        pq.offer(99);
        pq.offer(17);
        System.out.println("This is priority Que :"+ pq);
        pq.poll();
        System.out.println(" now This is priority Que after removing smallest :"+ pq);
    }
}
