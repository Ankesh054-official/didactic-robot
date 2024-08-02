package CodeNotes.collection.Linkedlist;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.add(10);
        ll.add("Ankesh");
        ll.add("get");
        ll.add("You");
        ll.add("hello");
        ll.add(3,"me");

        System.out.println(ll);

        ll.remove(0);
        System.out.println(ll);

        ll.remove("get");
        System.out.println("removed specified element "+ll);

        LinkedList clonell = (LinkedList) ll.clone();
        System.out.println("cloned "+clonell);

        clonell.clear();
        System.out.println("cleared "+clonell);

        ll.addFirst(20);
        System.out.println("Added at first " +ll);

        ll.addLast(30);
        System.out.println("Added at last " +ll);

        System.out.println(ll.contains("Ankesh"));

        ll.pop();
        ll.push(70);
        System.out.println(ll);

        System.out.println(ll.indexOf("You"));
        System.out.println(ll.get(2));






    }
}
