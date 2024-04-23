package io.github.tomhuel.DateTime.LocalDate;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class LocalDateTime {
    public static void execute() {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDate randomDate = LocalDate.of(2021, Month.NOVEMBER, 14);
        System.out.println(randomDate);

        LocalDate yesterday = localDate.minusDays(1);
        LocalDate preYesterday = localDate.minus(2, ChronoUnit.DAYS);
        System.out.println(yesterday);
        System.out.println(preYesterday);

        DayOfWeek weekDay = localDate.getDayOfWeek();
        System.out.println(weekDay);

        boolean biSleeping = localDate.isLeapYear();
        System.out.println(biSleeping);

        boolean yesterdayIsBeforeNow = yesterday.isBefore(localDate);
        boolean yesterdayIsAfterNow = yesterday.isAfter(localDate);

        System.out.println(yesterdayIsBeforeNow);
        System.out.println(yesterdayIsAfterNow);
        System.out.println("Era: " + localDate.getEra());

    }
}
