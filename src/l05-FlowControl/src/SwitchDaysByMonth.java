import java.util.Date;

public class SwitchDaysByMonth {


    public static void execute() {
        Date date = new Date(2000, 2, 23);
        int monthdays;

        switch (date.getMonth()) {
            case 1:
                monthdays = 31;
                break;
            case 2:
                monthdays = 29;
                break;
            case 3:
                monthdays = 31;
                break;
            case 4:
                monthdays = 30;
                break;
            case 5:
                monthdays = 31;
                break;
            case 6:
                monthdays = 30;
                break;
            case 7:
                monthdays = 31;
                break;
            case 8:
                monthdays = 31;
                break;
            case 9:
                monthdays = 30;
                break;
            case 10:
                monthdays = 31;
                break;
            case 11:
                monthdays = 30;
                break;
            case 12:
                monthdays = 31;
                break;
            default:
                monthdays = 0;
                break;
        }

        System.out.println("Total days: " + monthdays);
    }
}