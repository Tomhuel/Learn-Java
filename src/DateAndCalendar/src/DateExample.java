import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
    public static void execute() {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy hh:mm:ss");
        String dateStr = dateFormat.format(date);
        System.out.println("dateStr = " + dateStr);
        long amount = 0;

        Date start = new Date();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            amount += i;
        }
        Date stop = new Date();

        long time = stop.getTime() - start.getTime();
        System.out.println("time to count " + amount + " = " + time/1000.0 + "s");
    }
}
