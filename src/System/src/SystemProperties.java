import java.util.Properties;

public class SystemProperties {
    public static void execute() {
        String username = System.getProperty("user.name");
        String home = System.getProperty("user.home");
        String workspace = System.getProperty("user.dir");
        String javaVersion = System.getProperty("java.version");
        String separator = System.getProperty("path.separator");
        
        System.out.println("username = " + username);
        System.out.println("home = " + home);
        System.out.println("workspace = " + workspace);
        System.out.println("javaVersion = " + javaVersion);
        System.out.println("separator = " + separator);
        Properties pList = System.getProperties();
        pList.list(System.out);
    }
}
