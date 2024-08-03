package LABS.lab8.Assignment2.BankException;


public class BankException extends Exception{
    private String msg = "";

    public BankException(){
        super();
    }

    public BankException(String msg){
        super(msg);
        this.msg = msg;
    }

}
