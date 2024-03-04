public class BubbleSort {
    public static void execute() {
        System.out.println("Bubble Sort");
        Integer[] numbers = RandomNumbers.randomIntegerArray();
//        String[] numbers = {"m","a","o","z","g","ñ","b","k","y"};

        for (Object number : numbers) {
            System.out.println(number);
        }

        System.out.println("Sorting...");

        bubbleSort(numbers, true);

        for (Object number : numbers) {
            System.out.println(number);
        }
    }

    public static void bubbleSort(Object[] array, boolean desc) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (desc) {
                    if (((Comparable) array[j]).compareTo(array[i]) > 0) {
                        var aux = array[j];
                        array[j] = array[i];
                        array[i] = aux;
                    }
                } else {
                    if (((Comparable) array[j]).compareTo(array[i]) < 0) {
                        var aux = array[j];
                        array[j] = array[i];
                        array[i] = aux;
                    }
                }
            }
        }
    }

    public static void bubbleSort(Object[] array) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (((Comparable) array[j]).compareTo(array[i]) < 0) {
                    var aux = array[j];
                    array[j] = array[i];
                    array[i] = aux;
                }
            }
        }
    }
}
