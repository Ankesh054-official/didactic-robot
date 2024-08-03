package LABS.Activity.Activity3;

import java.util.InputMismatchException;
import java.util.Scanner;

//Write a program that prompts the user to enter an integer. Handle the
//InputMismatchException that might occur if the user enters a non-integer value.
public class MismatchCheck {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        int value;

        try{
            System.out.print("Enter a integer:\t");
            value = get.nextInt();
        }catch (InputMismatchException wrongValue){
            System.out.println(wrongValue);
        }

    }

}
