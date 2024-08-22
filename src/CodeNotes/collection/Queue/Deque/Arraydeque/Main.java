package CodeNotes.collection.Queue.Deque.Arraydeque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Deque ardq = new ArrayDeque();

        for (int i = 0; i <= 5; i++){
            ardq.add(i);
        }

        ardq.addFirst(5);
        ardq.addLast(6);
        ardq.removeFirst();
        ardq.pollFirst();
        ardq.removeLast();
        ardq.pollLast();
        ardq.pollLast();

        ardq.offerFirst(4);


        System.out.println(ardq);

    }
}
