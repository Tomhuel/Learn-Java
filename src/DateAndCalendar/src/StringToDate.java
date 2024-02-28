import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {

    public static void execute() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = "2003-06-23";

        Date date = null;
        try {
            date = format.parse("2000-01-01");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        System.out.println("date = " + date);
    }
}
