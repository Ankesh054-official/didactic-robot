package LABS.lab11.assignment2;


    class MinimumRequiredAmountException extends RuntimeException{
        MinimumRequiredAmountException(){
            super();
        }

        MinimumRequiredAmountException(String msg){
            super(msg);
        }
    }

    class LowBalanceException extends RuntimeException{
        LowBalanceException(){
            super();
        }

        LowBalanceException(String msg){
            super(msg);
        }
    }



public class BankAccount {
    private double balance;

    BankAccount(int initialBalance){
        this.balance = initialBalance;
    }

    private void currentBalance(){
        System.out.println("Current Balance:\t"+this.balance);
    }

    /**
     * @param amount
     * @throws LowBalanceException
     */
    public void withdraw(int amount) throws LowBalanceException{
        if(this.balance >= amount){
            this.balance -= amount;
            System.out.println("Widrawal successfull");
            this.currentBalance();
        }else {
            throw new LowBalanceException("Unable to complete this withdrawal transaction: Due to low balance");
        }
    }

    /**
     * @param amount
     * @throws MinimumRequiredAmountException
     */
    public void deposit(int amount) throws MinimumRequiredAmountException{
        if(amount > 100){
            this.balance += amount;
        }else{
            throw new MinimumRequiredAmountException("Error while deposit: Amount should be greater than 100");
        }
    }
}

class Main{
    public static void main(String []args){
        BankAccount BA = new BankAccount(5000);

        try{
            BA.deposit(101);
            BA.deposit(20);
            BA.withdraw(9000);
        }catch (MinimumRequiredAmountException | LowBalanceException bankIssue){
            System.out.println(bankIssue);
        }

    }
}