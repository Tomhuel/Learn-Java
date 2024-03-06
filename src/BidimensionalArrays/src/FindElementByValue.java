public class FindElementByValue {
    public static void execute() {
        System.out.println("· Find element by value");
        int[][] numbers = RandomMatrix.randomMatrix(3, 4, 10);
        int element = 3;
        System.out.println("Element to find: " + element);
        int[] indexes = findElementByValue(element, numbers);
        int row = indexes[0];
        int col = indexes[1];
        if (row == -1 || col == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at");
            System.out.println("row: " + (row + 1));
            System.out.println("column: " + (col + 1));
            System.out.println("Value at [" + row + "][" + col + "] = " + numbers[row][col]);
        }
    }

    public static int[] findElementByValue(int element, int[][] matrix) {
        int[] indexes = {-1, -1};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == element) {
                    indexes[0] = i;
                    indexes[1] = j;
                    return indexes;
                }
            }
        }
        return indexes;
    }
}
