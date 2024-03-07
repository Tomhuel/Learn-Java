public class AddMatrixs {
    public static void execute() {
        System.out.println("· Add 2 Matrix");
        int[][] a, b;
        int rows = 3;
        int cols = 6;
        a = new int[rows][cols]; //RandomMatrix.randomMatrix(rows, cols);
        b = new int[rows][cols];

        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = count;
                b[i][j] = count;
                count++;
            }
        }

        int[][] result = addMatrix(a, b);
        if (result.length == 0) {
            System.out.println("Both Matrix must have the same size");
        } else {
            for (int[] row : result) {
                for (int col : row) {
                    System.out.print(col + "\t");
                }
                System.out.println();
            }
        }
    }

    public static int[][] addMatrix(int[][] matrix1, int[][] matrix2) {
        boolean sameSize = true;
        if (matrix1.length != matrix2.length) {
            sameSize = false;
        }
        for (int i = 0; i < matrix1.length; i++) {
            if (matrix1[i].length != matrix2[i].length) {
                sameSize = false;
            }
        }
        if (!sameSize) {
            return new int[0][0];
        }
        int[][] result = new int[matrix1.length][];
        for (int i = 0; i < matrix1.length; i++) {
            result[i] = new int[matrix1[i].length];
            for (int j = 0; j < matrix1[i].length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }
}
