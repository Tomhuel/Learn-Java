import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CompareDate {
    public static void execute() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        calendar.set(2003, Calendar.JUNE, 23);
        Date date1 = calendar.getTime();
        Date date2 = new Date();
        Date date3 = date2;

        if (date1.after(date2)) {
            System.out.println(format.format(date1) + " > " + format.format(date2));
        } else if (date1.before(date2)) {
            System.out.println(format.format(date1) + " < " + format.format(date2));
        } else {
            System.out.println("Same Date");
        }
    }
}
