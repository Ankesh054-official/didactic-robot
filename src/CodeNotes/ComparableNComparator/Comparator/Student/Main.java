package CodeNotes.ComparableNComparator.Comparator.Student;

import java.util.ArrayList;
import java.util.Collections;


public class Main {


    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        ArrayList params = new ArrayList();
        int []ids = {1,5,3,4,2};
        String []names = {"Ankesh", "Prashant", "Sam", "Alpha", "Bravo"};

        for (int i = 0; i < ids.length; i++){
            list.add(new Student(ids[i], names[i]));
        }

        Collections.sort(list,(new SortByID()));

        System.out.println(list);
        Collections.sort(list,(new SortByName()));
        System.out.println(list);
    }
}
