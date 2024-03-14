public class StringArrayMethods {
    public static void execute() {
        // Get char array from a string
        char[] test = "this is a test".toCharArray();
        for (int i = 0; i < test.length; i++) {
            System.out.println("test[" + i + "] = " + test[i]);
        }

        System.out.println("This is a new test".split("s"));

        String string = "this is a test";

        for (int i = 0; i < string.length(); i++) {
            System.out.println("my string:" + i + " = " + test[i]);
        }

    }
}
