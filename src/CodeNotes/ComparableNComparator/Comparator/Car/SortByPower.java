package CodeNotes.ComparableNComparator.Comparator.Car;

import java.util.Comparator;

public class SortByPower implements Comparator {
    /**
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return
     */
    @Override
    public int compare(Object o1, Object o2) {
        Integer power_o1 = ((Car) o1).power;
        Integer power_o2 = ((Car) o2).power;
        return power_o1.compareTo(power_o2);
    }
}
