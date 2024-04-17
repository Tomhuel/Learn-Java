package io.github.tomhuel.ExecutorFramework.Timers;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ScheduledExecutorServicePeriodicExercise {
    public static void execute() throws InterruptedException {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);

//        CountDownLatch locker = new CountDownLatch(5);
        AtomicInteger counter = new AtomicInteger(5);

        System.out.println("Main task");
        Future<?> future = executorService.scheduleAtFixedRate(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
//                locker.countDown();
                counter.getAndDecrement();
                System.out.println("Working...");
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
        }, 1000, 5000, TimeUnit.MILLISECONDS);
//        locker.await();
        while(counter.get() > 0) {}
        future.cancel(true);
        executorService.shutdown();

        System.out.println("Another tasks...");
    }
}
