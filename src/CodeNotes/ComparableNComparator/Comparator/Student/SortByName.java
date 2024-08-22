package CodeNotes.ComparableNComparator.Comparator.Student;

import java.util.Comparator;

public class SortByName implements Comparator {
    /**
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return
     */
    @Override
    public int compare(Object o1, Object o2) {
        return ((Student) o1).name.compareTo(((Student) o2).name);
    }
}
