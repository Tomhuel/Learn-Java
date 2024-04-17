package io.github.tomhuel.Synchronization;

import io.github.tomhuel.Synchronization.Runnables.Baker;
import io.github.tomhuel.Synchronization.Runnables.Consumer;

import java.util.concurrent.ThreadLocalRandom;

public class Bakery {
    private String bread;
    private boolean aviability;

    public synchronized void bake(String dough) throws InterruptedException {
        while (aviability) {
            wait();
        }
        this.bread = dough;
        System.out.println("Baker bakes: " + this.bread);
        this.aviability = true;
        notify();
    }

    public synchronized String consume() throws InterruptedException {
        while (!aviability) {
            wait();
        }
        System.out.println("Client eats bread: " + this.bread);
        this.aviability = false;
        notify();
        return this.bread;
    }

    public static void execute() {
        Bakery bakery = new Bakery();
        new Thread(new Baker(bakery)).start();
        new Thread(new Consumer(bakery)).start();
    }

    public static void executeLambdas() {
        Bakery bakery = new Bakery();

        new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    bakery.bake("Bread nº" + i);
                    Thread.sleep(ThreadLocalRandom.current().nextInt(500, 2000));
                }
            } catch (InterruptedException e) {
                System.err.println("Error baking: " + e.getMessage());
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    bakery.consume();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }
}
