package CodeNotes.collection.Queue.PriorityQueue;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.add(5);
        pq.add(2);
        pq.add(3);
        pq.add(1);
        pq.add(4);

        System.out.println(pq);
        while (!pq.isEmpty()){
            System.out.println(pq.poll());
        }

    }
}
