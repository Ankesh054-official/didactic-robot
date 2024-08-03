package LABS.Activity.Activity3;

import java.util.Scanner;

public class IntParse {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        int value;

        try{
            value = Integer.parseInt(get.nextLine());
        }catch (NumberFormatException numberFormat){
            System.out.println(numberFormat);
        }catch (NullPointerException nullExcept){
            System.out.println(nullExcept);
        }
    }
}
