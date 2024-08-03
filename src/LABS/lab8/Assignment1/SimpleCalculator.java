package LABS.lab8.Assignment1;


import java.awt.*;
import java.util.InputMismatchException;
import java.util.Scanner;


public class SimpleCalculator extends RuntimeException{

    /**
     * @implNote
     * 
     * {@link #add(int, int)} To add two integers.
     * @param a
     * @param b
     * @return {@code a+b}
     */
    static int add(int a, int b){
        return a+b;
    }

    /**
     * @implNote
     * {@link #subtract(int, int)} To subtract two integers.
     * @param a
     * @param b
     * @return {@code a-b}
     */
    static int subtract(int a, int b){
        return a-b;
    }

    /**
     * @implNote
     * {@link #multiply(int, int)} To multiply two integers.
     * @param a
     * @param b
     * @return {@code a*b}
     */
    static int multiply(int a, int b){
        return a*b;
    }

    /**
     * @implNote
     * {@link #divide(int, int)} To divide two integers.
     * @param a
     * @param b
     * @return {@code a/b}
     */
    static int divide(int a, int b) throws ArithmeticException{
        if(b == 0) throw new ArithmeticException("Divide by zero");
        return a/b;
    }

    /**
     * @implNote
     * {@link #modulo(int, int)} to calculate the remainder after dividing
     * {@code a} by {@code b}
     * @param a
     * @param b
     * @return {@code a%b}
     */
    static int modulo(int a, int b){
        return a%b;
    }

    /**
     * @implNote
     * Based on {@code operation} the {@code switch} statement decides
     * that which case has to excuted.
     * According to the operation respective method is invoked, whatever
     * invoked method returns get stored in {@code result} and returned.
     *
     * For {@code operation} which is not defined
     * {@code InputMismatchException("Invalid! Operation")} will be thrown.
     *
     * @param operation
     * @param a
     * @param b
     *
     * @return {@code result}
     * @throws InputMismatchException
     */
    static int switchOperation(String operation, int a, int b) throws InputMismatchException {
        int result = 0;

        switch (operation){
            case "+":
                result = add(a,b);
                break;
            case "-":
                result = subtract(a,b);
                break;
            case "*":
                result = multiply(a,b);
                break;
            case "/":
                try{
                    result = divide(a,b);
                }catch (ArithmeticException zeroDivide){
                    System.out.println(zeroDivide);
                    return 0;
                }
                break;
            case "%":
                result = modulo(a,b);
                break;
            default:
                throw new InputMismatchException("Invalid! Operation");
        }

        System.out.print(a+" "+operation+" "+b+" = ");
        return result;
    }

    public static void main(String[] args) {
        String listOfOperations = "List of Operations:\n" +
                                    "+ for ADD\n" +
                                    "- for Subtract\n" +
                                    "* for Multiply\n" +
                                    "/ for Divide\n" +
                                    "% for Modulo\n" +
                                    "? to Exit\n\n";
        String operation = "";

        do{
            System.out.print(listOfOperations+"Choose Operation:\t");

            Scanner get = new Scanner(System.in);
            operation = get.nextLine();

            System.out.println("Enter two space-seperated numbers:\t");
            int a = get.nextInt();
            int b = get.nextInt();

            try{
                System.out.println(switchOperation(operation, a, b));
            }catch (InputMismatchException input){
                System.out.println(input);
            }finally {
                continue;
            }
        }while (!operation.equals("?"));
    }

}
