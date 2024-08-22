package CodeNotes.exceptionHandling;

public class AgeTypeMismatchException extends Exception{
    public AgeTypeMismatchException(){
        super();
    }

    /**
     * @param msg
     */
    public AgeTypeMismatchException(String msg){
        super(msg);
    }
}
