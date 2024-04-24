package io.github.tomhuel.DateTime.Duration;

import java.time.Duration;
import java.time.LocalDateTime;

public class DurationExample {
    public static void execute() {
        LocalDateTime date1 = LocalDateTime.now();
        LocalDateTime date2 = LocalDateTime.now().plusHours(3).plusMinutes(20).plusSeconds(30);

        Duration duration = Duration.between(date1, date2);
        System.out.println(duration.getSeconds());
    }
}
