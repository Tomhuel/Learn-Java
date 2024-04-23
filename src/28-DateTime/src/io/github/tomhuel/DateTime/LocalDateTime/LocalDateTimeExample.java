package io.github.tomhuel.DateTime.LocalDateTime;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeExample {
    public static void execute() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("hour = " + localDateTime.getHour());
        System.out.println("minutes = " + localDateTime.getMinute());
        System.out.println("seconds = " + localDateTime.getSecond());

        LocalTime sixThirty = LocalTime.of(6, 30);
        System.out.println(sixThirty);
        System.out.println(sixThirty.plus(2, ChronoUnit.HOURS));
    }
}
