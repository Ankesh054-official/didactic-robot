package CodeNotes.ComparableNComparator.Comparator.Car;

public class Car {
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

    @Override
    public String toString() {
        return "{" +
                "power=" + power +
                ", model='" + model + '\'' +
                ", manu='" + manu + '\'' +
                '}';
    }
}
