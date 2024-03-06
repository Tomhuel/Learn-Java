public class MatrixExample {
    public static void execute() {
        System.out.println("Matrix Example:");
        int[][] numbers = new int[2][4];

        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                count++;
                numbers[i][j] = count;
            }
        }

        System.out.println("Files of numbers: " + numbers.length + ". Columns of numbers: " + numbers[0].length);

        System.out.println("First element of Matrix: " + numbers[0][0]);
        System.out.println("Last element of Matrix: " + numbers[numbers.length - 1][numbers[numbers.length - 1].length - 1]);
    }
}
