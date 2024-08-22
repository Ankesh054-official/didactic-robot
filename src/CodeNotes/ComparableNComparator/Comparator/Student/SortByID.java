package CodeNotes.ComparableNComparator.Comparator.Student;

import java.util.Comparator;

public class SortByID implements Comparator {
    /**
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return
     */
    @Override
    public int compare(Object o1, Object o2) {
        Integer id_o1 = (Integer) ((Student) o1).id;
        Integer id_o2 = ((Integer) ((Student) o2).id);
        return id_o1.compareTo(id_o2);
    }
}
