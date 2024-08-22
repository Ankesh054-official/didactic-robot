package CodeNotes.exceptionHandling;


import java.util.InputMismatchException;
import java.util.Scanner;



public class Main {

    /**
     * Method: {@link #checkValidVoter(int)}
     * @param age
     * @throws AgeInvalidException
     */
    public static void checkValidVoter(int age) throws AgeInvalidException{
        if(age >= 18){
            System.out.println("Is a valid voter");
        }else{
            throw new AgeInvalidException("Age Should be more than or equal to 18.");
        }
    }

    /**
     * Method: {@link #getInput(Scanner)}
     * @param sc
     * @throws AgeTypeMismatchException
     */
    public static void getInput(Scanner sc) throws AgeTypeMismatchException{
        try {
            int age = sc.nextInt();
            checkValidVoter(age);
        }catch (InputMismatchException wrongInputType){
            throw new AgeTypeMismatchException("Age should be in numbers.");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            getInput(sc);
        }catch(AgeTypeMismatchException invalidAgeValue){
            System.out.println(invalidAgeValue.getMessage());
        }


    }
}
