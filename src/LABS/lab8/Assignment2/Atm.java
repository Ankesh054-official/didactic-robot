package LABS.lab8.Assignment2;

import LABS.lab8.Assignment2.BankException.BankException;
import LABS.lab8.Assignment2.BankException.LowBanalceException;
import LABS.lab8.Assignment2.BankException.SystemException;

import java.util.Scanner;

public class Atm {

    static void operate(BankAccount obj, int accountNumber,  int deposit, int withdraw){

        try{
            obj.deposit(accountNumber,deposit);
            obj.withdraw(accountNumber,withdraw);
            System.out.println(obj.getBalance(accountNumber)+"\n");
        } catch (BankException e) {
            System.out.println(e);
        } catch (LowBanalceException e) {
            System.out.println(e);
        } catch (SystemException e){
            System.out.println(e);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BankAccount sbi = new BankAccount("Ankesh", "SBI", 500000);
        BankAccount sbi1 = new BankAccount("Ank", "SBI", 500);
        BankAccount sbi2 = new BankAccount("Anh", "SBI", 50);
        BankAccount sbi3 = new BankAccount("Ansh", "SBI", 5);


        System.out.println(sbi);
        operate(sbi,1,100000, 200000);

        System.out.println(sbi1);
        operate(sbi1,5,10000, 2000);


        System.out.println(sbi2);
        operate(sbi2,3,100, 200000);


        System.out.println(sbi3);
        operate(sbi3,4,00, 200000);





    }

}
