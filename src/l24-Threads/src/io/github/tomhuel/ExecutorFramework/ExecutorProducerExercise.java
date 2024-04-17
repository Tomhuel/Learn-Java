package io.github.tomhuel.ExecutorFramework;

import io.github.tomhuel.Synchronization.Bakery;
import io.github.tomhuel.Synchronization.Runnables.Baker;
import io.github.tomhuel.Synchronization.Runnables.Consumer;

import java.util.concurrent.*;

import static io.github.tomhuel.ExecutorFramework.ExecutorFramework.hasDone;

public class ExecutorProducerExercise {
    public static void execute() throws InterruptedException, ExecutionException {
        ThreadPoolExecutor executorService = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);

        // Create Callables
        Bakery bakery = new Bakery();
        Runnable consumer = new Consumer(bakery);
        Runnable producer = new Baker(bakery);

        Future<?> future1 = executorService.submit(producer);
        Future<?> future2 = executorService.submit(consumer);

        executorService.shutdown();
    }
}
