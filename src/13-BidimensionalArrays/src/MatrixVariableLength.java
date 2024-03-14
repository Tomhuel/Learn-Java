public class MatrixVariableLength {
    public static void execute() {
        System.out.println("· Matrix with Variable Lengths");
        int[][] numbers = new int[3][];

        numbers[0] = new int[2];
        numbers[1] = new int[3];
        numbers[2] = new int[4];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Row " + (i + 1) + " has " + numbers[i].length + " of length.");
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
