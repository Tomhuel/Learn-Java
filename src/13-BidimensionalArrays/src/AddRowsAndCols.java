public class AddRowsAndCols {
    public static void execute() {
        System.out.println("· Add Rows and Cols");
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7},
                {8, 9, 10, 11, 12}
        };
        int count = 0;
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                matrix[i][j] = count;
//                count++;
//            }
//        }
        int[] rows = addRows(matrix);
        System.out.print("Add rows:\t");
        for (int row : rows) {
            System.out.print(row + "\t");
        }
        System.out.println();
        int[] cols = addCols(matrix);
        System.out.print("Add rows:\t");
        for (int col : cols) {
            System.out.print(col + "\t");
        }
    }

    public static int[] addRows(int[][] matrix) {
        int[] result = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            result[i] = sum;
        }
        return result;
    }

    public static int[] addCols(int[][] matrix) {
        int length = 0;
        for (int i = 0; i < matrix.length; i++) {
            length = Math.max(length, matrix[i].length);
        }
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (i < matrix[j].length) {
                    sum += matrix[j][i];
                }
            }
            result[i] = sum;
        }
        return result;
    }
}
