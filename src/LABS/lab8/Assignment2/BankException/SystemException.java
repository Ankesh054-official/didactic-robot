package LABS.lab8.Assignment2.BankException;

public class SystemException extends RuntimeException{
    private String msg = "";

    public SystemException(){
        super();
    }

    public SystemException(String msg){
        super(msg);
        this.msg = msg;
    }

}
