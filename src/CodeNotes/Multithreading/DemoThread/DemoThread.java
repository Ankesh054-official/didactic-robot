package CodeNotes.Multithreading.DemoThread;

public class DemoThread implements Runnable{

    @Override
    public void run() {
        System.out.println("Started inside run");
    }
}
