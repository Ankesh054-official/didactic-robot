package CodeNotes.exceptionHandling;

public class AgeInvalidException extends RuntimeException{

    /**
     * @param msg
     */
    public AgeInvalidException(String msg) {
        super(msg);
    }

    public AgeInvalidException() {
        super();
    }
}
