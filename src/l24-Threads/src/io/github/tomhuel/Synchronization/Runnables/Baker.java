package io.github.tomhuel.Synchronization.Runnables;

import io.github.tomhuel.Synchronization.Bakery;

import java.util.concurrent.ThreadLocalRandom;

public class Baker implements Runnable {

    private Bakery bakery;

    public Baker(Bakery bakery) {
        this.bakery = bakery;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                this.bakery.bake("Bread nº" + i);
                Thread.sleep(ThreadLocalRandom.current().nextInt(500, 2000));
            }
        } catch (InterruptedException e) {
            System.err.println("Error baking: " + e.getMessage());
        }
    }
}
