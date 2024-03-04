public class AddElementByOrder {
    public static void execute() {
        System.out.println("Insert Element by Order");
        Integer[] numbers = RandomNumbers.randomIntegerArray();
        BubbleSort.bubbleSort(numbers);
        insertElementByOrder(30, numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public static void insertElementByOrder(Integer element, Integer[] array) {
        int index = 0;
        if (element > array[array.length - 1]) {
            index = array.length - 1;
        }
        for (int i = 0; i < array.length; i++) {
            if (element < array[i]) {
                index = i;
                break;
            }
        }
        AddElementAtIndex.insertElement(index, element, array);
    }
}
