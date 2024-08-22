package CodeNotes.collection.Queue.Deque.deque;

import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Deque dq = new LinkedList();
        dq.add(1);
        dq.add(2);
        dq.add(3);
        dq.add(4);
        dq.add(5);

        dq.addFirst(5); // adds the element at the first place
        dq.addLast(6); // adds the element at the last position
//        dq.removeFirst();    // removes the element from first place but throws NoSuchElementException if DS is empty.
        dq.pollFirst(); // removes the element from first place but didn't throw any exception if DS is empty it returns null.

//        dq.removeLast(); // removes the element from last place but throws NoSuchElementException if DS is empty.
        dq.pollLast();  // removes the element from last place but didn't throw any exception if DS is empty returns null.

        dq.offerFirst(5);
        System.out.println(dq);
    }
}
