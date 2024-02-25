public class Arithmetic {
    public static void execute() {
        // Add
        int i = 8, j = 5, result;
        result = i + j;
        System.out.println("result = " + result);

        // Subtract
        result = i - j;
        System.out.println("result = " + result);

        // Multiply
        result = i * j;
        System.out.println("result = " + result);

        // Split
        float floatResult = (float) i / j;
        System.out.println("floatResult = " + floatResult);

        // Rest
        floatResult = i % j;
        System.out.println("floatResult = " + floatResult);
    }
}
