public class IdentifyOrder {
    public static void execute() {
        Integer[] numbers = RandomNumbers.randomIntegerArray();
        System.out.println(identifyOrder(numbers)); // Random
        BubbleSort.bubbleSort(numbers);
        System.out.println(identifyOrder(numbers)); // Ascending
        BubbleSort.bubbleSort(numbers, true);
        System.out.println(identifyOrder(numbers)); // Descending
    }

    public static Order identifyOrder(Integer[] array) {
        boolean desc = false;
        boolean asc = false;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                asc = true;
            }
            if (array[i] > array[i + 1]) {
                desc = true;
            }
        }
        if (desc && asc) {
            return Order.Random;
        } else if (asc) {
            return Order.Ascending;
        }
        return Order.Descending;
    }
}
