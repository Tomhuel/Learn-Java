public class AddElementAtStart {
    public static void execute() {
        Integer[] numbers = RandomNumbers.randomIntegerArray();
        BubbleSort.bubbleSort(numbers);
        Integer lastNumber = numbers[numbers.length - 1];
        for (int i = (numbers.length - 1); i > 0; i--) {
            numbers[i] = numbers[i - 1];
        }
        numbers[0] = lastNumber;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("i = " + numbers[i]);
        }
    }
}
