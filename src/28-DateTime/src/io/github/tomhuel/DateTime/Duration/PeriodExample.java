package io.github.tomhuel.DateTime.Duration;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class PeriodExample {
    public static void execute() {
        LocalDate date1 = LocalDate.of(2003, 5, 15);
        LocalDate date2 = LocalDate.of(2021, 11, 14);

        Period period = Period.between(date1, date2);

        System.out.printf("Period between %s and %s is: %d years, %d months, %d days.", date1, date2, period.getYears(), period.getMonths(), period.getDays());
    }
}
