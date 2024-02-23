import javax.swing.*;

public class NumberSystem {
    public static void execute() {
        String numberStr = JOptionPane.showInputDialog(null, "Introduce a number");
        int decimalNumber = 0;
        try {
            decimalNumber = Integer.parseInt(numberStr);
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, "ERROR: Should introduce a number");
            execute();
            System.exit(1);
        }
        String binaryMessage = "Binary Number: " + Integer.toBinaryString(decimalNumber);
        String octalMessage = "Octal Number: " + Integer.toOctalString(decimalNumber);
        String hexMessage = "Hex Number: " + Integer.toHexString(decimalNumber);
        String message = binaryMessage + "\n" + octalMessage + "\n" + hexMessage;

        JOptionPane.showMessageDialog(null, message);
    }
}
