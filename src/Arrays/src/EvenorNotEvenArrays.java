public class EvenorNotEvenArrays {
    public static void execute() {
        Integer[] numbers = RandomNumbers.randomIntegerArray();
        Integer[] evenNumbers;
        Integer[] notEvenNumbers;

        int evenLength = 0;
        int notEvenLength = 0;

        for (Integer number: numbers) {
            if (number % 2 == 0) {
                evenLength++;
            } else {
                notEvenLength++;
            }
        }

        evenNumbers = new Integer[evenLength];
        notEvenNumbers = new Integer[notEvenLength];

        int iEven = 0;
        int iNotEven = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenNumbers[iEven++] = numbers[i];
            } else {
                notEvenNumbers[iNotEven++] = numbers[i];
            }
        }

        for (Integer number: evenNumbers) {
            System.out.println(number);
        }
        System.out.println("--------------");
        for (Integer number: notEvenNumbers) {
            System.out.println(number);
        }
    }
}
