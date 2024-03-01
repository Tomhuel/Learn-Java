import java.io.IOException;

public class ExecuteOtherApps {
    public static void execute() {
        Runtime rt = Runtime.getRuntime();
        Process process;
        try {
            if (System.getProperty("os.name").startsWith("windows")) {
                process = rt.exec("notepad");
            } else if (System.getProperty("os.name").startsWith("mac")) {
                process = rt.exec("textedit");
            } else {
                process = rt.exec("code");
            }
            process.waitFor();
        } catch (Exception error) {
            System.err.println("Command not found...");
            System.exit(1);
        }
    }
}
