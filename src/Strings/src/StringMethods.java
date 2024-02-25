public class StringMethods {
    public static void execute() {
        // Get the String s Length
        int length = "This is my String".length();
        System.out.println("length = " + length);
        String stringUpperCase = "this is my string".toUpperCase(); // All to Upper Case
        String stringLowerCase = "THIS IS MY String".toLowerCase(); // All to lower case
        System.out.println("stringUpperCase = " + stringUpperCase);
        System.out.println("stringLowerCase = " + stringLowerCase);
        System.out.println("test".equals("test")); // Check if the strings the same
        System.out.println("test".equalsIgnoreCase("TeST")); // Check if the strings the same ignoring cases
        System.out.println("test".charAt(0)); // Get a char from the index of a String
        System.out.println("test".substring(0, 3)); // get the string from index 0 to index 2 te
        System.out.println("perenquén".replace('e', 'o').replace('é', 'ó')); // Replace the first char for the second.
        System.out.println("test".indexOf('t')); // 0
        System.out.println("test".lastIndexOf('t')); // 3
        System.out.println("test".contains("te")); // true
        System.out.println("test".startsWith("pe")); // false
        System.out.println("test".endsWith("st")); // true
        System.out.println("  test     ".trim()); // Delete the blank space around the words
    }
}
