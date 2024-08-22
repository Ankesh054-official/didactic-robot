package CodeNotes.exceptionHandling.iChat.QuesOne;


import CodeNotes.exceptionHandling.iChat.QuesOne.BankException.InsufficientFundsException;

import java.util.InputMismatchException;

/**
 * Question :
 * Imagine you are designing a simple banking system. Write a Java program that simulates a bank account. Implement the following:
 *
 * Task 1: Create a custom exception, InsufficientFundsException, that is thrown when an attempt is made to withdraw more money than the account balance.
 * Task 2: Implement a method void performTransaction(double amount) that allows both deposits and withdrawals. If a withdrawal exceeds the account balance,
 * throw the InsufficientFundsException and ensure the transaction is rolled back, leaving the account balance unchanged.
 *
 * Task 3: Demonstrate the usage of your program with multiple transactions, including scenarios where exceptions are thrown and caught.
 */
public class Bank {
    double balance;

    public Bank(double balance) {
        this.balance = balance;
    }

    private void deposit(double amount){
        this.balance += amount;
    }

    private double withdraw(double amount)throws InputMismatchException {
        if(this.balance < amount){
            throw new InsufficientFundsException("Insufficient Funds");
        }
        this.balance -= amount;
        return this.balance;
    }

    public void performTransaction(double amount, int tnxType)throws InputMismatchException {
        if (tnxType == 1){
            this.deposit(amount);
        }

        if(tnxType == 2){
            this.withdraw(amount);
        }
    }
}
