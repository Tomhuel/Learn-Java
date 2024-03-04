public class FindByInteger {
    public static void execute() {
        Integer[] numbers = RandomNumbers.randomIntegerArray(1000, 30);
        Integer index = indexOf(numbers, 30);
        if (index.equals(-1)) {
            System.out.println("Number not found");
        } else {
            System.out.println("Number at index: " + index);
            System.out.println("numbers[" + index + "] = " + numbers[index]);
        }
    }

    public static Integer indexOf(Integer[] array, Integer item) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }
}
