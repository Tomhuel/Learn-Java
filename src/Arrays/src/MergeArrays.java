public class MergeArrays {
    public static void execute() {
        Integer[] numbers1 = {1, 2, 3, 4};
        Integer[] numbers2 = {1, 2, 3};
        Integer[] test = mergeArray(numbers1, numbers2);
        for (Integer number: test) {
            System.out.println(number);
        }
    }

    public static Object[] mergeArray(Object[] array1, Object[] array2) {
        Object[] result = new Object[array1.length + array2.length];
        System.arraycopy(array1, 0, result, 0, array1.length);
        System.arraycopy(array2, 0, result, 0 + array1.length, array2.length);
        return result;
    }

    public static Integer[] mergeArray(Integer[] array1, Integer[] array2) {
        Integer[] result = new Integer[array1.length + array2.length];
        System.arraycopy(array1, 0, result, 0, array1.length);
        System.arraycopy(array2, 0, result, 0 + array1.length, array2.length);
        return result;
    }
}
