package io.github.tomhuel.ExecutorFramework;

import java.util.concurrent.*;

import static io.github.tomhuel.ExecutorFramework.ExecutorFramework.hasDone;

public class ThreadPoolExecutorExercise {
    public static void execute() throws InterruptedException, ExecutionException {
        ThreadPoolExecutor executorService = (ThreadPoolExecutor) Executors.newFixedThreadPool(1);

        // Create Callables
        Callable<Integer> task1 = Generator.callableGenerator(1, 3, 312);
        Callable<String> task2 = Generator.callableGenerator(2, 5, "Hello Callable");
        Callable<Boolean> task3 = Generator.callableGenerator(3, 9, true);

        Future<Integer> result = executorService.submit(task1);
        Future<String> result2 = executorService.submit(task2);
        Future<Boolean> result3 = executorService.submit(task3);
        executorService.shutdown();

        executorService.awaitTermination(2, TimeUnit.SECONDS);

        while (!hasDone(result) || !hasDone(result2) || !hasDone(result3)) {
            System.out.println("Pool size: " + executorService.getPoolSize());
            System.out.println("Tasks in queue: " + executorService.getQueue().size());
            System.out.printf("Result 1: %s\nResult 2: %s\nResult 3: %s\n---------------%n",
                    hasDone(result) ? "completed" : "in progress",
                    hasDone(result2) ? "completed" : "in progress",
                    hasDone(result3) ? "completed" : "in progress");
            TimeUnit.MILLISECONDS.sleep(1500);
        }
        System.out.println(String.format("Result 1: %s\nResult 2: %s\nResult 3: %s",
                result.get(),
                result2.get(),
                result3.get()));
        System.out.println("Continue!");
    }
}
