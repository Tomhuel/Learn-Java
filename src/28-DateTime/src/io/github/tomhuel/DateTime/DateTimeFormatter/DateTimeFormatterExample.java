package io.github.tomhuel.DateTime.DateTimeFormatter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExample {
    public static void execute() {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm:ss.mm");
        System.out.println(df.format(LocalDateTime.now()));
    }
}
