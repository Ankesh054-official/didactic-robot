package CodeNotes.collection.Set.SortedSet;

import java.util.TreeSet;

public class Tree {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        int []arr = {5, 1,6,7,8,1,3};
        for (int i: arr){
            ts.add(i);
        }

        System.out.println(ts);
        System.out.println(ts.first());
        System.out.println(ts.last());
        System.out.println(ts.reversed());
    }
}
