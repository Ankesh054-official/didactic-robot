package CodeNotes.exceptionHandling.iChat.QuesOne.BankException;

public class InsufficientFundsException extends RuntimeException{
    public InsufficientFundsException() {
        super();
    }

    public InsufficientFundsException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }

    @Override
    public StackTraceElement[] getStackTrace() {
        return super.getStackTrace();
    }

}
