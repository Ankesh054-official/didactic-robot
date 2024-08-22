package CodeNotes.ComparableNComparator.Comparator.Car;

import java.util.Comparator;

public class SortByModel implements Comparator {
    /**
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return
     */
    @Override
    public int compare(Object o1, Object o2) {
        return ((Car) o1).model.compareTo(((Car) o2).model);
    }
}
