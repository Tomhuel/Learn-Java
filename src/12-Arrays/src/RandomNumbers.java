import java.util.Random;

public class RandomNumbers {
    public static Integer[] randomIntegerArray() {
        Integer[] numbers = new Integer[10];
        Random randomizer = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = randomizer.nextInt(0, 30);
        }
        return numbers;
    }

    public static Integer[] randomIntegerArray(int length) {
        Integer[] numbers = new Integer[length];
        Random randomizer = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = randomizer.nextInt(0, 30);
        }
        return numbers;
    }

    public static Integer[] randomIntegerArray(int length, int maxValue) {
        Integer[] numbers = new Integer[length];
        Random randomizer = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = randomizer.nextInt(0, maxValue);
        }
        return numbers;
    }

    public static int[] randomIntArray() {
        int[] numbers = new int[10];
        Random randomizer = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = randomizer.nextInt(0, 30);
        }
        return numbers;
    }

    public static int[] randomIntArray(int length) {
        int[] numbers = new int[length];
        Random randomizer = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = randomizer.nextInt(0, 30);
        }
        return numbers;
    }

    public static int[] randomIntArray(int length, int maxValue) {
        int[] numbers = new int[length];
        Random randomizer = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = randomizer.nextInt(0, maxValue);
        }
        return numbers;
    }
}
