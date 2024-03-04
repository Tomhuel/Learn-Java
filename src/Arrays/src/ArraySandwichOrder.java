public class ArraySandwichOrder {
    public static void execute() {
        Integer[] numbers = RandomNumbers.randomIntegerArray(50, 100);
        BubbleSort.bubbleSort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number " + (i + 1) + ": " + numbers[i] + " - " + numbers[(numbers.length - i - 1)]);
        }
    }
}
