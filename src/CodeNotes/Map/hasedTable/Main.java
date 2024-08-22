package CodeNotes.Map.hasedTable;


import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Hashtable<Object,Object> ht = new Hashtable();
        ht.put(105, "Sm");     // 6
        ht.put(116, "all");    // 6
        ht.put(104, "Al");     // 5
        ht.put(103, "Ank");    // 4
        ht.put(102, "to");     // 3
        ht.put(101, "Ankesh"); // 2

        System.out.println(ht);
        /**
         * top to bottom, right to left
         *
         * sm, all >> top element
         *
         * all, sm >> all is right element on same index
         *
         * all,  sm, Al, Ank, to, Ankesh
         *
         */

//        Iterator i = ht.entrySet().iterator();
//        while (i.hasNext()){
//            Map.Entry x = (Map.Entry) i.next();
//            System.out.println(x.getKey()+" : "+x.getValue());
//        }

        for (Map.Entry i : ht.entrySet()){
            System.out.println(i.getKey()+" : "+i.getValue());
        }



    }
}
