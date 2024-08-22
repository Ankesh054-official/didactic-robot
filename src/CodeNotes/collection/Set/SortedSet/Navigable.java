package CodeNotes.collection.Set.SortedSet;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Navigable {
    public static void main(String[] args) {
        NavigableSet ns = new TreeSet();
        String []arr = {"aaa","bbb","ccc","ddd","ggg"};

        for (String i : arr){
            ns.add(i);
        }
        ns.add("eee");
        System.out.println(ns);

        // Returns element one less then argument.
        System.out.println(ns.lower("eee"));

        // Returns element one higher then argument.
        System.out.println(ns.higher("bbb"));

        // Returns element if available else closest less element.
        System.out.println(ns.floor("fff"));

        // Returns element if available else closest higher element.
        System.out.println(ns.ceiling("eee"));

        // Retreive and remove first and last element in set, returns removed element.
        System.out.println(ns.pollFirst());
        System.out.println(ns.pollLast());

        ns.add("eee");
        ns.add("fff");
        ns.add("aaa");
        ns.add("ggg");
//        System.out.println(ns.descendingSet());
        System.out.println(ns.reversed());



    }
}
