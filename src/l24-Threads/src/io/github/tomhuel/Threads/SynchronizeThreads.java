package io.github.tomhuel.Threads;

public class SynchronizeThreads implements Runnable {

    private String string1, string2;

    public SynchronizeThreads(String string1, String string2) {
        this.string1 = string1;
        this.string2 = string2;
    }

    @Override
    public void run() {
        printStrings(string1, string2);
    }

    public synchronized static void printStrings(String string1, String string2) {
        System.out.print(string1 + " ");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }

        System.out.println(string2);
    }

    public static void execute() throws InterruptedException {
        new Thread(new SynchronizeThreads("Hello", "World")).start();
        Thread t2 = new Thread(new SynchronizeThreads("How", "are you?"));
        t2.start();
        Thread t3 = new Thread(new SynchronizeThreads("I'm good", "Thx"));
        Thread.sleep(300);
        t3.start();
        Thread.sleep(300);
        System.out.println(t3.getState());
        t3.join();
        System.out.println("Dialogs Finished");
    }
}
