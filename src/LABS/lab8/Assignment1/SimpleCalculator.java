package LABS.lab8.Assignment1;


import java.awt.*;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 1.Create a Java program that acts as a simple calculator.
 * ● The program should prompt the user to enter two numbers and an operator (+, -,
 * *, /).
 * ● Perform the corresponding calculation based on the operator.
 * ● Handle potential exceptions, such as division by zero or invalid operator input.
 * ● Display the result or an appropriate error message.
 */
public class SimpleCalculator extends RuntimeException{

    static int add(int a, int b){
        return a+b;
    }

    static int subtract(int a, int b){
        return a-b;
    }

    static int multiply(int a, int b){
        return a*b;
    }

    static int divide(int a, int b) throws ArithmeticException{
        if(b == 0) throw new ArithmeticException("Divide by zero");
        return a/b;
    }

    static int modulo(int a, int b){
        return a%b;
    }

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
        String listOfOperations = "List of Operations:\n+ for ADD\n- for Subtract\n* for Multiply\n/ for Divide\n% for Modulo\n? to Exit\n\n";
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
