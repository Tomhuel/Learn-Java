package io.github.tomhuel.APIStream.InfiniteStream;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class InfiniteStream {
    public static void execute() {
        AtomicInteger counter = new AtomicInteger(0);
        Stream.generate(() -> {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return counter.getAndIncrement();
        }).limit(20).forEach(System.out::println);
    }
}
