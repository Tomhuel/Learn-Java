import java.util.Date;

public class TwoSleepYear {
    // Bisiesto
    public static void execute() {

        Date date = new Date(2024, 06, 23);
        boolean twoSleepYear = false;
        if (date.getYear() % 4 == 0 && (date.getYear() % 100 != 0 || (date.getYear() % 100 == 0 && date.getYear() % 400 == 0))) {
            twoSleepYear = true;
        }

        int days;

        if (date.getMonth() == 2 && twoSleepYear) {
            days = 29;
        } else if (date.getMonth() == 2) {
            days = 28;
        } else if (date.getMonth() == 1 || date.getMonth() == 3 || date.getMonth() == 5 || date.getMonth() == 7 || date.getMonth() == 8 || date.getMonth() == 10 || date.getMonth() == 12) {
            days = 31;
        } else {
            days = 30;
        }
        System.out.println(days + " days");
    }
}
