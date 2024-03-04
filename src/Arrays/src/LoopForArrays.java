public class LoopForArrays {
    public static void execute() {
        System.out.println("Loop For Arrays");
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int length = numbers.length;

        for (int i = 0; i < length; i++) {
            System.out.println("numbers[i] = " + numbers[i]);
        }

        for (int number : numbers) {
            System.out.println("number = " + number);
        }

        int i = 0;
        while (i < length) {
            System.out.println("numbers[i] = " + numbers[i]);
            i++;
        }
        i = 0;
        do {
            System.out.println("numbers[i] = " + numbers[i]);
            i++;
        } while (i < length);

        // Loop in reverse
        for (int j = length - 1; j >= 0; j--) {
            System.out.println("numbers[j] = " + numbers[j]);
        }

        for (int j = 0; j < length; j++) {
            System.out.println("numbers[j] = " + numbers[length - 1 - j]);
        }
    }
}
