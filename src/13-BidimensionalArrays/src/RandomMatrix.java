import java.util.Random;

public class RandomMatrix {
    public static int[][] randomMatrix() {
        Random randomizer = new Random();
        int rows = 2;
        int cols = 3;
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = randomizer.nextInt(30);
            }
        }
        return matrix;
    }

    public static int[][] randomMatrix(int rows) {
        Random randomizer = new Random();
        int cols = 3;
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = randomizer.nextInt(30);
            }
        }
        return matrix;
    }

    public static int[][] randomMatrix(int rows, int cols) {
        Random randomizer = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = randomizer.nextInt(30);
            }
        }
        return matrix;
    }

    public static int[][] randomMatrix(int rows, int cols, int maxValue) {
        Random randomizer = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = randomizer.nextInt(maxValue);
            }
        }
        return matrix;
    }

    public static int[][] randomMatrix(int rows, int cols, int minValue, int maxValue) {
        Random randomizer = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = randomizer.nextInt(minValue, maxValue);
            }
        }
        return matrix;
    }
}
