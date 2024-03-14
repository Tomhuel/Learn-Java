import java.util.Map;

public class GetEnvData {
    public static void execute() {
        Map<String, String> env = System.getenv();
        System.out.println(env.get("JAVA_HOME"));

        for (String config: env.keySet()) {
            System.out.println(config + " = " + env.get(config));
        }
    }
}
