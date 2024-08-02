package CodeNotes.collection.Set.hashSet;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int []arr = {1,1,2,3, 4, 5, 3};

        HashSet hs = new HashSet();

        for(int i : arr){
            hs.add(i);
        }
        System.out.println(hs.size() == arr.length);
    }
}
