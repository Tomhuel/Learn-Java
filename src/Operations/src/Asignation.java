public class Asignation {
    public static void execute() {
        int i = 5;
        int j = i + 4;

        System.out.println("i = " + i);
        i += 2; // i = i + 2;
        System.out.println("i = " + i);
        i -= 2; // i = i + 2;
        System.out.println("i = " + i);
        i *= 2; // i = i + 2;
        System.out.println("i = " + i);
        i /= 2; // i = i + 2;
        System.out.println("i = " + i);

        String sqlString = "SELECT * FROM Clients";
        sqlString += " WHERE id=3;";
    }
}
