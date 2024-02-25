public class Logical {
    public static void execute() {
        int i = 3, j = 5, k = 4;

        System.out.println("i is lower than j AND lower than k: " + (i < j && i < k));
        System.out.println("i is lower than j OR higher than k: " + (i < j && i > k));
        System.out.println("i is lower than j AND lower than k OR higher than j: " + ((i < j && i < k) || i > j));
    }
}
