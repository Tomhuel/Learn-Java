package io.github.tomhuel;

import io.github.tomhuel.Synchronization.Bakery;
import io.github.tomhuel.Threads.ExtendsThread;
import io.github.tomhuel.Threads.RunnableThread;
import io.github.tomhuel.Threads.SynchronizeThreads;
import io.github.tomhuel.Timers.AddTimer;

public class Main {
    public static void main(String[] args) {
        try {
            // How to create a Thread with inheritance
//            executeExtendsThread();

            // How to create a Thread with runnable
//            executeRunnables();

            // Synchronize Methods
//            SynchronizeThreads.execute();

            // How to Synchronize different Threads
//            Bakery.execute();

            // How to Synchronize different Threads with Java 8 Lambdas
//            Bakery.executeLambdas();

            // Timer Tasks
            AddTimer.execute();

            throw new InterruptedException("");
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }

    }

    public static void executeExtendsThread() {
        Thread thread1 = new ExtendsThread("Hello");
        Thread thread2 = new ExtendsThread("Goodbye");
        Thread thread3 = new ExtendsThread("Who am i?");
        System.out.println("thread1 = " + thread1.getState());
        System.out.println("thread2 = " + thread2.getState());
        System.out.println("thread3 = " + thread3.getState());
        thread1.start();
        thread2.start();
        thread3.start();
        System.out.println("And Main Method it's still working!");
        System.out.println(thread1.getState());
        System.out.println(thread2.getState());
        System.out.println(thread3.getState());
    }

    public static Runnable createRunnable() {
        Thread main = Thread.currentThread();
        return new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i + " - " + Thread.currentThread().getName());
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        System.err.println(e.getMessage());
                    }
                }
                System.out.println("Current Main Thread Status: " + main.getState());
            }
        };
    }

    public static void executeRunnables() throws InterruptedException {
        Thread thread1 = new Thread(new RunnableThread("Hello"));
        Thread thread2 = new Thread(createRunnable(), "Goodbye");
        Thread thread3 = new Thread(new RunnableThread("Who are you?"));

        thread1.start();
        thread2.start();
        thread3.start();
        thread1.join();
        thread2.join();
        thread3.join();
        System.out.println("And Main Method it's still working!");
    }
}