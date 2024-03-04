public class DeleteElementByIndex {
    public static void execute() {
        System.out.println("Delete element by index");
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Integer[] newNumbers;
        try {
            newNumbers = deleteElementByIndex(3, numbers);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < newNumbers.length; i++) {
            System.out.println(newNumbers[i]);
        }
    }

    public static Integer[] deleteElementByIndex(Integer index, Integer[] array) throws Exception {
        if (index < 0 || index >= array.length) {
            throw new Exception("Index not valid");
        }
        Integer[] newArray;
        Integer[] firstPart = new Integer[index];
        Integer[] secondPart = new Integer[array.length - index - 1];
        System.arraycopy(array, 0, firstPart, 0, firstPart.length);
        for (int i = 0; i < secondPart.length; i++) {
            secondPart[i] = array[index + i + 1];
        }
        newArray = MergeArrays.mergeArray(firstPart, secondPart);
        return newArray;
    }
}
