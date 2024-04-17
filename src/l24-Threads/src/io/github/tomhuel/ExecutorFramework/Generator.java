package io.github.tomhuel.ExecutorFramework;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class Generator {
    public static Runnable taskGenerator(int id, int sleep) {
        return new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("Starting task " + id + "...");
                    System.out.println("Thread's name: " + Thread.currentThread().getName());
                    TimeUnit.SECONDS.sleep(sleep);
                } catch (InterruptedException e) {
                    System.err.println(e.getMessage());
                    Thread.currentThread().interrupt();
                }
                System.out.println("Finishing task " + id + "...");
            }
        };
    }

    public static <T> Callable<T> callableGenerator(int id, int sleep, T t) {
        return new Callable<T>() {
            @Override
            public T call() throws Exception {
                try {
                    System.out.println("Starting task " + id + "...");
                    System.out.println("Thread's name: " + Thread.currentThread().getName());
                    TimeUnit.SECONDS.sleep(sleep);
                } catch (InterruptedException e) {
                    System.err.println(e.getMessage());
                    Thread.currentThread().interrupt();
                }
                System.out.println("Finishing task " + id + "...");
                return t;
            }
        };
    }
}
