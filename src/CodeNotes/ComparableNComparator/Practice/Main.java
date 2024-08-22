package CodeNotes.ComparableNComparator.Practice;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car(1, "S", "Toyota");
        Car c3 = new Car(3, "S", "MD");
        Car c2 = new Car(2, "S", "Alpha");
        Car c4 = new Car(4, "S", "BMW");

        ArrayList al = new ArrayList();
        al.add(c1);
        al.add(c2);
        al.add(c3);
        al.add(c4);
//        Collections.sort(al);
        System.out.println(al);
    }
}
