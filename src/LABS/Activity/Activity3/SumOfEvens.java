package LABS.Activity.Activity3;

//Write a Java program that calculates the sum of all even numbers present
//in an ArrayList of integers.


import java.util.ArrayList;
import java.util.Scanner;

public class SumOfEvens {

    /**
     * Method: {@link #isEven(int)}
     * @implNote Used to check whether {@code a} given integer is even or not returns boolean value accordingly.
     *
     * @param a
     * @return {@code boolean}
     */
    public static boolean isEven(int a){
        if(a%2 == 0) return true;
        else return false;
    }

    /**
     * Method: {@link #sum(ArrayList)}
     * @implNote Used to calculate the {@code sum} of integers available in {@code list} and returns {@code sum}.
     *
     * @param list
     * @return {@code sum}
     */
    public static int sum(ArrayList<Integer> list){
        int sum = 0;

        for(int i : list){
            if(isEven(i)) {
                sum += i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter 5 Space-seperated Interger:\t");
        for(int i = 1; i <= 5; i++){
            if(get.hasNextInt()){
                list.add(get.nextInt());
            }
        }

        System.out.println("Sum of "+list+" = "+sum(list));


    }
}
