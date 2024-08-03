package LABS.Activity.Activity3;

import java.util.HashSet;

public class OperationOnHashSet {

    public static void main(String[] args) {

        // Create a HashSet of integers.
        HashSet<Integer> hs = new HashSet<>();
        int []arr = {5, 10, 15, 20, 25};

        // Add the numbers 5, 10, 15, 20, and 25 to the set.
        for (int i : arr){
            hs.add(i);
        }
        // Display the elements of the set.
        // System.out.println(hs);
        for (int i: hs){
            System.out.println(i);
        }

        // Check if the set contains the number 10.
        System.out.println(hs.contains(10));

        // Remove the number 15 from the set.
        hs.remove(15);
        System.out.println(hs);

        //Display the size of the set.
        System.out.println(hs.size());

    }
}
