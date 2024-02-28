import java.util.Calendar;
import java.util.Date;

public class CalendarExample {
    public static void execute() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2003);
        calendar.set(Calendar.MONTH, 5);
        calendar.set(Calendar.DAY_OF_MONTH, 23);
        calendar.set(Calendar.HOUR_OF_DAY, 21);
        Date date = calendar.getTime();
        System.out.println("date = " + date);
    }
}
