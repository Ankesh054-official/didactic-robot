package CodeNotes.ComparableNComparator.Comparator.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Main {
    static int []powers = {200, 10, 12};
    static String []manu = {"Toyota", "GLS", "BMW"};
    static String []model = {"MW", "CL", "LP"};

    public static void storeInArrayList(){

        ArrayList list = new ArrayList();

        for (int i = 0; i < powers.length; i++){
            list.add(new Car(powers[i], manu[i], model[i]));
        }
        System.out.println(list);

        System.out.println("Manu Sorted");
        Collections.sort(list, new SortByManu());
        System.out.println(list);

        System.out.println("Power Sorted");
        Collections.sort(list, new SortByPower());
        System.out.println(list);

        System.out.println("Model Sorted");
        Collections.sort(list, new SortByModel());
        System.out.println(list);
    }

    public static void storeInTreeSet(){
        TreeSet list = new TreeSet(new SortByPower());

        for (int i = 0; i < powers.length; i++){
            list.add(new Car(powers[i], manu[i], model[i]));
        }

        System.out.println("Power Sorted");
        System.out.println(list);
    }

    public static void main(String[] args) {
        storeInTreeSet();
    }
}
