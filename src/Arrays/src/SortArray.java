import java.util.Arrays;
import java.util.Collections;

public class SortArray {
    public static void execute() {
        System.out.println("Sort Arrays");
        Integer[] numbers = RandomNumbers.randomIntegerArray();
        for (int number: numbers) {
            System.out.println(number);
        }
        System.out.println("Array Sorted:");
        Arrays.sort(numbers); // Sort ascending
        for (int number: numbers) {
            System.out.println(number);
        }
        System.out.println("Reverse order:");
        Arrays.sort(numbers, Collections.reverseOrder()); // Sort descending
        for (int number: numbers) {
            System.out.println(number);
        }
    }
}
