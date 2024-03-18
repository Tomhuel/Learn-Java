import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class AssignSystemProperties {
    public static void execute() {
        try {
            FileInputStream configuration = new FileInputStream("src/configuration.properties");
            Properties properties = new Properties(System.getProperties());
            properties.load(configuration);
            properties.setProperty("Learning?", "true");
            System.setProperties(properties);
            System.getProperties().list(System.out);
            System.out.println(System.getProperty("SERVER_PORT"));
        } catch (Exception e) {
            System.err.println("File not found");
            System.exit(1);
        }
    }
}
