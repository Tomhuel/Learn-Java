public class AddElementAtIndex {
    public static void execute() {
        Integer[] numbers = RandomNumbers.randomIntegerArray();
        BubbleSort.bubbleSort(numbers);
        Integer[] newArray = insertElement(9, 100, numbers);
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
    }

    public static Integer[] insertElement(Integer index, Integer value, Integer[] array) {
        Integer[] firstPart = new Integer[index];
        Integer[] secondPart = new Integer[array.length - index + 1];
        secondPart[0] = value;
        System.arraycopy(array, index + 1 - 1, secondPart, 1, secondPart.length - 1);
        System.arraycopy(array, 0, firstPart, 0, index);
        return MergeArrays.mergeArray(firstPart, secondPart);
    }
}
