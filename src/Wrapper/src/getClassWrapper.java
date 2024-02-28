import java.lang.reflect.Method;

public class getClassWrapper {
    public static void execute() {
        String greetings = "Hello world!";

        Class strClass = greetings.getClass(); // See the intern structure of String's Class
        System.out.println("strClass = " + strClass.getSimpleName()); // see strClass Name
        System.out.println("strClass = " + strClass.getPackageName()); // see strClass Package Name
        System.out.println("strClass = " + strClass.getSuperclass()); // see strClass SuperClass Name
        System.out.println("--------------------------------------------------");

        for (Method method: strClass.getMethods()) {
            System.out.println(method.getName());
        }
    }
}
