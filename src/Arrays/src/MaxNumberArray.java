public class MaxNumberArray {
    public static void execute() {
        Integer[] numbers = RandomNumbers.randomIntegerArray();
        Integer maxValue = getMaxIntegerArray(numbers);
        System.out.println("maxValue = " + maxValue);
    }

    public static Integer getMaxIntegerArray(Integer[] array) {
        Integer max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }
}
