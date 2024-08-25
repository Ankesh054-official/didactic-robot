package LABS.Practice.Aug25.TypeCasting.widning;

public class Main {

    /**
     * <p>{@code byte -> short -> int -> long -> float -> double}</p>
     *
     * It'll print value of char data according to ascii values.
     * <p>{@code char -> int}</p>
     */
    public static void main(String[] args) {
        byte a = 10;
        short b = a;
        int c = b;
        long d = c;
        float e = d;
        double f = e;

        char j = 'a';
        int h = j;
        System.out.println(h);

    }
}
