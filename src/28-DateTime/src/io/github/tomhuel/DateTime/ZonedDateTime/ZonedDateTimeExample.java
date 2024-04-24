package io.github.tomhuel.DateTime.ZonedDateTime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeExample {
    public static void execute() {
        LocalDateTime localDateTime = LocalDateTime.now();
        ZoneId arizona = ZoneId.of("US/Arizona");
        ZonedDateTime arizonaDateTime = ZonedDateTime.of(localDateTime, arizona);

        ZonedDateTime canaryDateTime = ZonedDateTime.of(localDateTime, ZoneId.of("Atlantic/Canary"));
        System.out.println(canaryDateTime);
        System.out.println(canaryDateTime.withZoneSameInstant(arizona));
    }
}
