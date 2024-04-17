package io.github.tomhuel.ExecutorFramework;

import io.github.tomhuel.ExecutorFramework.Timers.ScheduledExecutorServiceExercise;
import io.github.tomhuel.ExecutorFramework.Timers.ScheduledExecutorServicePeriodicExercise;

import java.util.concurrent.*;

public class ExecutorFramework {
    public static void execute() throws InterruptedException, ExecutionException {
//        executeService();
//        FutureExercise.execute();
//        ThreadPoolExecutorExercise.execute();
//        ExecutorProducerExercise.execute();
//        ScheduledExecutorServiceExercise.execute();
        ScheduledExecutorServicePeriodicExercise.execute();
    }

    private static void executeService() throws InterruptedException {
        // Executor Service to manage threads
        ExecutorService executorService = Executors.newSingleThreadExecutor(); // newSingleThreadExecutor means create just 1 Thread

        // Create Runnable
        Runnable task1 = Generator.taskGenerator(1, 1);

        executorService.submit(task1);

        // The executor framework will continue executing until we use .shutdown or .shutdownNow method
        executorService.shutdown();

        // Waits the time provided and then continue the program. It's like and sleep.
        System.out.println("Hello executor");
        executorService.awaitTermination(5, TimeUnit.SECONDS);
        System.out.println("Goodbye executor");
    }

    public static boolean hasDone(Future<?> future) {
        return future.isCancelled() || future.isDone();
    }
}
