public class MathExample {
    public static void execute() {
        int absolute = Math.abs(-3); // Always positive
        System.out.println("absolute = " + absolute);

        double max = Math.max(3.5, 1.2); // Max value between those 2 numbers
        System.out.println("max = " + max);

        double min = Math.min(3.5, 1.2); // Min value between those 2 numbers
        System.out.println("min = " + min);

        double ceil = Math.ceil(3.3); // Round to the next number
        System.out.println("ceil = " + ceil);

        double floor = Math.floor(3.3); // Round to the previous number
        System.out.println("floor = " + floor);

        long avg = Math.round(3.3); // Round the number
        System.out.println("avg = " + avg);

        double sqrt = Math.sqrt(16); // Square Root
        System.out.println("sqrt = " + sqrt);
        
        double pow = Math.pow(2, 3); // First number raised to the power of the second number
        System.out.println("pow = " + pow);

        double PI = Math.PI; // PI
        System.out.println("PI = " + PI);

        double exp = Math.exp(1);
        System.out.println("exp = " + exp);

        double log = Math.log(10);
        System.out.println("log = " + log);

        double grades = Math.toDegrees(1.57);
        System.out.println("grades = " + grades);

        double radians = Math.toRadians(90);
        System.out.println("radians = " + radians);

        double sin = Math.sin(radians);
        System.out.println("sin = " + sin);

        double cos = Math.cos(180);
        System.out.println("cos = " + cos);
    }
}
