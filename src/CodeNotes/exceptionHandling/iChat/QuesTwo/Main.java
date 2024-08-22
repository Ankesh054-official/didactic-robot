package CodeNotes.exceptionHandling.iChat.QuesTwo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Write a Java program that reads data from a text file containing integers. Implement exception handling to deal with the following scenarios:
 *
 * Scenario 1: If the file is not found, catch the exception and print a user-friendly error message.
 * Scenario 2: If there is a non-integer value in the file, catch the exception and skip that particular value, continuing with the next one.
 */
public class Main {
    public static void main(String[] args) {
        File obj = new File("input.txt");
        Scanner sc;

        try{
            sc = new Scanner(obj);

            while(sc.hasNext()){
                try{
                    System.out.println(sc.nextInt());
                }catch (InputMismatchException inp){
                    System.out.println(inp);
                    break;
                }
            }
        }catch (FileNotFoundException fnfe){
            try{
                obj.createNewFile();
            }catch (IOException io){
                System.out.println(io);
            }
        }



    }
}
