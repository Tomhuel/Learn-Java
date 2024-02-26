import java.util.Date;

public class SwitchMonthName {
    public static void execute() {
        Date date = new Date(2000, 9, 23);
        String monthName = "";

        switch (date.getMonth()) {
            case 1: monthName = "January"; break;
            case 2: monthName = "February"; break;
            case 3: monthName = "March"; break;
            case 4: monthName = "April"; break;
            case 5: monthName = "May"; break;
            case 6: monthName = "June"; break;
            case 7: monthName = "July"; break;
            case 8: monthName = "August"; break;
            case 9: monthName = "Wake me up when september ends"; break;
            case 10: monthName = "October"; break;
            case 11: monthName = "November"; break;
            case 12: monthName = "December"; break;
        }

        System.out.println(monthName);
    }


}
