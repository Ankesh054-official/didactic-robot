package LABS.lab8.Assignment2;

import LABS.lab8.Assignment2.BankException.BankException;
import LABS.lab8.Assignment2.BankException.LowBanalceException;
import LABS.lab8.Assignment2.BankException.SystemException;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 2.Write a Java program to simulate a simple banking application.
 *  * ● Create a class BankAccount with a balance and methods for deposit and
 *  * withdrawal.
 *  * ● Implement exception handling for withdrawal operations to prevent overdrawing.
 *  * ● Handle the scenario when the withdrawal amount is greater than the balance.
 */

public class BankAccount{
    private String accountHolderName;
    private String bankName;
    private int accountNumber = 0;
    private static ArrayList<Integer> accountNumbers = new ArrayList();
    private int balance = 0;
    private String passBook = "";


    BankAccount(String accountHolderName, String bankName, int initialAmount){
        this.accountHolderName = accountHolderName;
        this.bankName = bankName;
        this.balance = initialAmount;
        this.accountNumberInitilize();
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountHolderName='" + accountHolderName + '\'' +
                ", bankName='" + bankName + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }

    private void accountNumberInitilize(){
        if(accountNumbers.size() > 0){
            int lastAccountNumber = accountNumbers.getLast();
            this.accountNumber = lastAccountNumber+1;
            accountNumbers.add((int) this.accountNumber);
        }else if(accountNumbers.size() == 0){
            this.accountNumber = 1;
            accountNumbers.add(1);
        }
    }

    public void deposit(int accountNumber, int amount) throws SystemException, BankException{
        System.out.println("Deposit "+amount);
        if (!accountNumbers.contains(accountNumber) && accountNumber != this.accountNumber) throw new BankException("Entered Account Mismatch");
        if(amount <= 0) throw new SystemException("System malfunction: trying to deposit "+amount+" amount");
        this.balance += amount;
    }

    public void withdraw(int accountNumber, int amount)throws LowBanalceException, BankException {
        System.out.println("Withdraw "+amount);
        if (!accountNumbers.contains(accountNumber) && accountNumber != this.accountNumber) throw new BankException("Entered Account Mismatch");
        if(this.balance < amount) throw new LowBanalceException("Insufficient Balance.");
        this.balance -= amount;
    }

    public void getPassbook(int accountNumber) throws BankException{
        System.out.println("Passbook");
        if (!accountNumbers.contains(accountNumber) && accountNumber != this.accountNumber) throw new BankException("Entered Account Mismatch");
        this.passBook = "\nAccount Holder Name: "+this.accountHolderName+"\n" +
                "Bank Name: "+this.bankName+"\n"+
                "Account Number: "+this.accountNumber+"\n"+
                "Balance: "+this.getBalance(accountNumber)+"\n";
        System.out.println(this.passBook);
    }

    public int getBalance(int accountNumber) throws BankException{
        System.out.println("Current Balance");
        if (!accountNumbers.contains(accountNumber) && accountNumber != this.accountNumber) throw new BankException("Entered Account Mismatch");
        return this.balance;
    }
}
