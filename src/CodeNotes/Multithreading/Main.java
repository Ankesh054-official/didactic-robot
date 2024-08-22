package CodeNotes.Multithreading;


import CodeNotes.Multithreading.DemoThread.DemoThread;

public class Main {

    public static void main(String[] args) {
        Runnable r = new DemoThread();
        Thread th = new Thread(r);
        th.start();
    }
}
