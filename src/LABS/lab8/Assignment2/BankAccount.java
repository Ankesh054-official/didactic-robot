package LABS.lab8.Assignment2;

import LABS.lab8.Assignment2.BankException.BankException;
import LABS.lab8.Assignment2.BankException.LowBanalceException;
import LABS.lab8.Assignment2.BankException.SystemException;

import java.util.ArrayList;


public class BankAccount{
    private String accountHolderName;
    private String bankName;
    private int accountNumber = 0;
    private static ArrayList<Integer> accountNumbers = new ArrayList();
    private int balance = 0;
    private String passBook = "";

    /**
     * @implNote Parametrized constructor to initilize values.
     * @param accountHolderName
     * @param bankName
     * @param initialAmount
     */
    BankAccount(String accountHolderName, String bankName, int initialAmount){
        this.accountHolderName = accountHolderName;
        this.bankName = bankName;
        this.balance = initialAmount;
        this.accountNumberInitilize();
    }

    /**
     * @see Object#toString()
     * @return {@code String}
     */
    @Override
    public String toString() {
        return "BankAccount{" +
                "accountHolderName='" + accountHolderName + '\'' +
                ", bankName='" + bankName + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }


    /**
     * Method: {@link #accountNumberInitilize()}
     * @implNote
     * Used to assign new account number to new object. By accessing the
     * last element of the {@link  #accountNumbers}  ArrayList<Integer>,
     * Store and assign one higher the last assigned account number.
     */
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

    /**
     * Method: {@link #deposit(int, int)}
     *
     * @implNote
     * Used to deposit {@code amount} to current {@code balance},
     * Techically used to increase {@code balance} by
     * {@code amount}.
     * Throws {@code BankException("Entered Account Mismatch")} if
     * {@code accountNumber} doesn't match.
     * Throws {@code SystemException("System malfunction: trying to
     * deposit "+amount+" amount")} if {@code amount} is 0 or less than 0.
     *
     * @param accountNumber
     * @param amount
     * @throws SystemException
     * @throws BankException
     */
    public void deposit(int accountNumber, int amount) throws SystemException, BankException{
        System.out.println("Deposit "+amount);
        if (!accountNumbers.contains(accountNumber) && accountNumber != this.accountNumber) throw new BankException("Entered Account Mismatch");
        if(amount <= 0) throw new SystemException("System malfunction: trying to deposit "+amount+" amount");
        this.balance += amount;
    }

    /**
     * Method: {@link #withdraw(int, int)}
     *
     * @implNote
     * Used to withdraw {@code amount} from current {@code balance},
     * Technically decrease {@code balance} by {@code amount}.
     * Throws {@code BankException("Entered Account Mismatch")} if
     * {@code accountNumber} doesn't match.
     * Throws {@code LowBanalceException("Insufficient Balance.")}
     * if {@code balance} is less than {@code amount}.
     * @param accountNumber
     * @param amount
     * @throws LowBanalceException
     * @throws BankException
     */
    public void withdraw(int accountNumber, int amount)throws LowBanalceException, BankException {
        System.out.println("Withdraw "+amount);
        if (!accountNumbers.contains(accountNumber) && accountNumber != this.accountNumber) throw new BankException("Entered Account Mismatch");
        if(this.balance < amount) throw new LowBanalceException("Insufficient Balance.");
        this.balance -= amount;
    }

    /**
     *Method: {@link #getPassbook(int)}
     *
     * @implNote
     * Used to print all the attributes of current instance.
     * Throws {@code BankException("Entered Account Mismatch")} if
     * {@code accountNumber} doesn't match.
     *
     * @param accountNumber
     * @throws BankException
     */
    public void getPassbook(int accountNumber) throws BankException{
        System.out.println("Passbook");
        if (!accountNumbers.contains(accountNumber) && accountNumber != this.accountNumber) throw new BankException("Entered Account Mismatch");
        this.passBook = "\nAccount Holder Name: "+this.accountHolderName+"\n" +
                "Bank Name: "+this.bankName+"\n"+
                "Account Number: "+this.accountNumber+"\n"+
                "Balance: "+this.getBalance(accountNumber)+"\n";
        System.out.println(this.passBook);
    }

    /**
     * Method: {@link #getBalance(int)}
     *
     * @implNote
     * Used to get balance of current instance.
     * Throws {@code BankException("Entered Account Mismatch")} if
     * {@code accountNumber} doesn't match.
     *
     * @param accountNumber
     * @return {@code this.balance}
     * @throws BankException
     */
    public int getBalance(int accountNumber) throws BankException{
        System.out.println("Current Balance");
        if (!accountNumbers.contains(accountNumber) && accountNumber != this.accountNumber) throw new BankException("Entered Account Mismatch");
        return this.balance;
    }
}
