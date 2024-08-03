package LABS.lab8.Assignment2.BankException;

public class LowBanalceException extends Exception{
    private String msg = "Low Balance";


    public LowBanalceException(){
        super("Low Balance");
    }

    public LowBanalceException(String msg){
        super(msg);
        this.msg = msg;
    }
}
