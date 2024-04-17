package io.github.tomhuel.ExecutorFramework.Timers;

import io.github.tomhuel.ExecutorFramework.Generator;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceExercise {
    public static void execute() throws InterruptedException {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);

        System.out.println("Main task");
        Runnable task1 = Generator.taskGenerator(1, 2);
        executorService.schedule(task1, 0, TimeUnit.SECONDS);
        executorService.shutdown();
        executorService.awaitTermination(2000, TimeUnit.MILLISECONDS);

        System.out.println("Another tasks...");
    }
}
