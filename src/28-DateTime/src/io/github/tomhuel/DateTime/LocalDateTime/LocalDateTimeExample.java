package io.github.tomhuel.DateTime.LocalDateTime;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
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

        localDateTime = LocalDateTime.of(2003, Month.MAY, 15, 0, 23,3);
        System.out.println(localDateTime);
        localDateTime = LocalDateTime.parse("2003-05-15T13:22:43");
        System.out.println(localDateTime);

        String format1 = localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);

        String format2 = localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        System.out.println(format1);
        System.out.println(format2);

    }
}
