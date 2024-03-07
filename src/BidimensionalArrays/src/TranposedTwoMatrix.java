public class TranposedTwoMatrix {
    public static void execute() {
        System.out.println("· Transpose 2 Matrix");
        int[][] a, b;
        int rows = 3;
        int cols = 6;
        a = new int[rows][cols]; //RandomMatrix.randomMatrix(rows, cols);
        b = new int[cols][rows];

        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = count;
                count++;
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                b[j][i] = a[i][j];
            }
        }

        for (int[] row : b) {
            for (int col : row) {
                System.out.print(col + "\t");
            }
            System.out.println();
        }
    }
}
