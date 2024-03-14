public class Relational {
    public static void execute() {
        int i = 5;
        byte j = 3;
        float k = 3.4f;
        double l = 13L;
        boolean m = false;

        // Are the same
        System.out.println("i == j = " + (i == j));
        // Opposite
        System.out.println("!(i == j) = " + !(i == j));
        // Are diferent
        System.out.println("(i != j) = " + (i != j));
        // i is lower than j
        System.out.println("(i < j) = " + (i < j));
        // i is lower or equal than j
        System.out.println("(i <= j) = " + (i <= j));
        // i is higher than j
        System.out.println("(i > j) = " + (i > j));
        // i is higher or equal than j
        System.out.println("(i >= j) = " + (i >= j));
    }
}
