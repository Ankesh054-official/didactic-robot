package CodeNotes.ComparableNComparator.Practice;

public class Car implements Comparable{
    int power;
    String model;
    String manu;

    /**
     * @param power
     * @param model
     * @param manu
     */
    public Car(int power, String model, String manu) {
        this.power = power;
        this.model = model;
        this.manu = manu;
    }

    /**
     * @param o the object to be compared.
     * @return {@code +ive, -ive, 0}
     */
    @Override
    public int compareTo(Object o) {
        Integer this_power = this.power;
        Integer param_o_power = ((Car) o).power;
        return this_power.compareTo(param_o_power);
    }

    @Override
    public String toString() {
        return "{" +
                "power=" + power +
                ", model='" + model + '\'' +
                ", manu='" + manu + '\'' +
                '}';
    }
}
