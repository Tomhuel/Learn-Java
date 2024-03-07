public class MatrixIdentity {
    public static void execute() {
        System.out.println();
        System.out.println("· Matrix Identity");
        int[][] matrix = new int[5][5];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == 0 || i == matrix.length - 1 || j == 0 || j == matrix[i].length - 1) {
                    matrix[i][j] = 1;
                }
            }
        }

        for (int[] row : matrix) {
            for (int col : row) {
                System.out.print(col + "\t");
            }
            System.out.println();
        }
    }
}
