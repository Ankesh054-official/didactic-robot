package CodeNotes.exceptionHandling.iChat.QuesOne;


public class Main {
    public static void main(String[] args) {
       Bank bk = new Bank(1500);
       bk.performTransaction(10,2);
       bk.performTransaction(50,1);
       bk.performTransaction(100000,2);
    }
}
