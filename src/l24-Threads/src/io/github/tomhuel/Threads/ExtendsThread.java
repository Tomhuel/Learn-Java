package io.github.tomhuel.Threads;

public class ExtendsThread extends Thread {

    public ExtendsThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Executing Thread: " + this.getName());

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
            System.out.println(this.getName());
        }

        System.out.println("Finish the thread process");
    }
}
