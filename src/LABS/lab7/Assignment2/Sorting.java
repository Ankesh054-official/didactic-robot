package LABS.lab7.Assignment2;

import java.util.Scanner;

/**
 * 2. Write a Java program that takes an array of integers as input and sorts it in ascending order using any sorting algorithm of your choice. Print the sorted array.
 */
public class Sorting {

    /**
     * {@link #ascending(int[])}
     * @implNote : Performed bubble sort.
     * @param array
     * @return {@code int[] array}
     */
    final static int[] ascending(int[] array){
        int length_of_array = array.length;

        for(int i = 0; i < length_of_array; i++){
            for (int j = (i+1); j < length_of_array; j++){
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array;
    }


    /**
     * {@link #nSizeArray(int, Scanner)}
     * @implNote : loop from {@code 0} to {@code (size-1)} and store
     * values from user input.
     * @param size
     * @param user
     * @return
     */
    final static int[] nSizeArray(int size, Scanner user){
        int []int_array = new int[size];

        System.out.print("Enter Numbers in a row without any separator:\t");
        for (int i = 0; i < size; i++) {
            int_array[i] = user.nextInt();
        }

        return int_array;
    }

    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.print("Enter Number of Element:\t");
        int length_of_input = get.nextInt();
        int []int_array = nSizeArray(length_of_input, get);
        
        for(int i: ascending(int_array)){
            System.out.print(i+"\t");
        }
    }

}
