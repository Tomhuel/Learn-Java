import java.util.Scanner;

public class NumberSystemCLI {
    public static void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce a number");
        int decimalNumber = 0;
        try {
            decimalNumber = scanner.nextInt();
        } catch (Exception error) {
            System.out.println("ERROR: Should introduce a int");
            execute();
            System.exit(1);
        }
        String binaryMessage = "Binary Number: " + Integer.toBinaryString(decimalNumber);
        String octalMessage = "Octal Number: " + Integer.toOctalString(decimalNumber);
        String hexMessage = "Hex Number: " + Integer.toHexString(decimalNumber);
        String message = binaryMessage + "\n" + octalMessage + "\n" + hexMessage;
        System.out.println(message);
    }
}
