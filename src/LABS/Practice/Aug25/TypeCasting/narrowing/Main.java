package LABS.Practice.Aug25.TypeCasting.narrowing;


/**
 * Narrowing
 * <p>{@code double -> float -> long -> int -> short -> byte}</p>
 * <p>I'll  return value of char according to ascii value.</p>
 * <p>{@code int -> char}</p>
 *
 * {@code (float)} This is called cast operator this is used to perform narrowing.
 */
public class Main {
    public static void main(String[] args) {
//        Float.MAX_VALUE == 3.4028235E38
                double a = 3.4028235E38;
                float b = (float) a;// Exceeding by only one after decimal result in Infinity.
        System.out.println(b);
    }
}
