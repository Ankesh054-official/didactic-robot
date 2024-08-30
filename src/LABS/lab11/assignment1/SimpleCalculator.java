package LABS.lab11.assignment1;

import java.util.InputMismatchException;
import java.util.Scanner;

class WrongInputException extends Exception{
    WrongInputException(){
        super();
    }

    WrongInputException(String msg){
        super(msg);
    }
}

class OperationOutOfRange extends RuntimeException{
    OperationOutOfRange(){
        super();
    }

    OperationOutOfRange(String msg){
        super(msg);
    }
}

public class SimpleCalculator {
    private int x;
    private int y;
    private char operator;

    /**
     * @throws WrongInputException
     */
    public void input() throws WrongInputException{
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter Two number:\t");
            this.x = sc.nextInt();
            this.y = sc.nextInt();
        }catch (InputMismatchException wrongInput){
            throw new WrongInputException("Input should be integer");
        }

        System.out.println("Enter operation to perform:\t (Valid operation +,-,*,/)\n");
        this.operator = sc.next().charAt(0);
    }

    /**
     * @throws OperationOutOfRange
     */
    public void calculate() throws OperationOutOfRange{
        switch (this.operator){
            case '+':
                System.out.println(this.x+" + "+this.y+" = "+this.add());
                break;

            case '-':
                System.out.println(this.x+" - "+this.y+" = "+this.sub());
                break;

            case '*':
                System.out.println(this.x+" * "+this.y+" = "+this.mul());
                break;

            case '/':
                try{
                    System.out.println(this.x+" / "+this.y+" = "+this.divide());
                }catch (ArithmeticException divisionException){
                    System.out.println(divisionException);
                }
                break;
            default:
                throw new OperationOutOfRange("Valid operations +,-,*,/");
        }
    }

    private int add(){
        return this.x+this.y;
    }

    private int mul(){
        return this.x*this.y;
    }

    private int sub(){
        return this.x-this.y;
    }

    private double divide() throws ArithmeticException{
        try{
            return this.x/this.y;
        }catch (ArithmeticException zeroDivision){
            throw new ArithmeticException("ZeroDivisionException: / by zero");
        }
    }

}

class Main{
    public static void main(String []args){
        SimpleCalculator sc = new SimpleCalculator();

        try{
            sc.input();
            try {
                sc.calculate();
            }catch (OperationOutOfRange invalidOperation){
                System.out.println(invalidOperation);
            }
        }catch (WrongInputException wrongInput){
            System.out.println(wrongInput);
        }
    }
}