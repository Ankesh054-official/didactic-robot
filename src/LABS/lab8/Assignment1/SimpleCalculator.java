package LABS.lab8.Assignment1;


/**
 * 1.Create a Java program that acts as a simple calculator.
 * ● The program should prompt the user to enter two numbers and an operator (+, -,
 * *, /).
 * ● Perform the corresponding calculation based on the operator.
 * ● Handle potential exceptions, such as division by zero or invalid operator input.
 * ● Display the result or an appropriate error message.
 */
public class SimpleCalculator extends Exception{

    static int add(int a, int b){
        return a+b;
    }

    static int subtract(int a, int b){
        return a-b;
    }

    static int multiply(int a, int b){
        return a*b;
    }

    static double divide(int a, int b) throws ArithmeticException{
        if(b == 0) throw new ArithmeticException("Divide by zero");
        return a/b;
    }

    static int modulo(int a, int b){
        return a%b;
    }

    public static void main(String[] args) {
        divide(1,0);
    }

}
