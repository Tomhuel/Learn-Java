package io.github.tomhuel.Synchronization.Runnables;

import io.github.tomhuel.Synchronization.Bakery;

public class Consumer implements Runnable {

    private Bakery bakery;

    public Consumer(Bakery bakery) {
        this.bakery = bakery;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                this.bakery.consume();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
