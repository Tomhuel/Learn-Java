package io.github.tomhuel.DateTime.Duration;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class InstantExample {
    public static void execute() {
        Instant i1 = Instant.now();

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Instant i2 = Instant.now();
        Duration time = Duration.between(i1, i2);
        System.out.println(time);
    }
}
