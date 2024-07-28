package LABS.lab7.Assignment1;

import java.util.Scanner;

/**1.Write a Java program that takes an array of integers as input from
 *  the user and then calculates the sum and average of the elements in
 *  the array. The program should output the sum and average.
 */

public class AverageNSum {

    /**
     * {@link #sum(int[])}
     * @implNote :Adds each element of original to {@code sum} local variable and after completion of iterations returns that.
     *
     * Works only on array of int []array.
     *
     * @param original
     * @return {@code int sum}
     */
    private static int sum(int []original){
        int sum = 0;

        for(int i: original){
            sum += i;
        }
        return sum;
    }

    /**
     * {@link #average(double, int)}
     * @param sum
     * @param n
     * @return {@code sum/n}
     */
    private static double average(double sum, int n){
        return sum/n;
    }

    /**
     * {@link #averageNSum(int[])}
     *
     * @implNote : Invokes {@link #sum(int[])} to get {@code calculated_sum},
     * Invoked {@link #average(double, int)} and passed {@code calculated_sum, original.length}
     * and returns an array of {@code sum, average} at
     * {@code index 0, index 1} respectively.
     *
     * @param original
     * @return {@code double []result}
     */
    public static double[] averageNSum(int [] original){
        int calculated_sum = sum(original);
        double []result = {calculated_sum, average(calculated_sum, original.length)};
        return result;
    }


    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.print("Enter Number of Element:\t");
        int length_of_input = get.nextInt();
        int []int_array = new int[length_of_input];

        System.out.print("Enter Numbers in a row without any separator:\t");
        for (int i = 0; i < length_of_input; i++) {
            int_array[i] = get.nextInt();
        }


        double []result = averageNSum(int_array);
        System.out.println("Sum:\t"+result[0]+"\nAverage:\t"+result[1]);
    }
}
