public class TransposedMatrix {
    public static void execute() {
        System.out.println("· Transposed Matrix");

        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        System.out.println("Initial state:");
        for (int[] row : matrix) {
            for (int col : row) {
                System.out.print(col + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                int aux = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = aux;
            }
        }

        System.out.println("Final state:");
        for (int[] row : matrix) {
            for (int col : row) {
                System.out.print(col + "\t");
            }
            System.out.println();
        }
    }
}
