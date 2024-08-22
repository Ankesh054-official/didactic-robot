package CodeNotes.collection.Set.LinkedhashSet;

import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        LinkedHashSet lhs = new LinkedHashSet();
        int []arr = {5,2,7,6,8,9};
        for (int i : arr){
            lhs.add(i);
        }

        System.out.println(lhs);
        System.out.println(lhs.reversed());
    }
}
