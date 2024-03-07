public class SimetricMatrix {
    public static void execute() {
        System.out.println("· Mirror Matrix");
        int[][] matrix = {
                {1, 2, 3, 4},
                {2, 1, 0, 5},
                {3, 0, 1, 6},
                {4, 5, 6, 1}
        };

        boolean mirror = true;

        mirror: for (int i = 0; i < matrix.length; i++) {
            int[] array1 = matrix[i];
            int[] array2 = new int[matrix[i].length];
            for (int j = 0; j < matrix[i].length; j++) {
                array2[j] = matrix[j][i];
                if (array1[j] != array2[j]) {
                    mirror = false;
                    break mirror;
                }
            }
        }

        if (mirror) {
            System.out.println("The Matrix is simetric");
        } else {
            System.out.println("The Matrix is not simetric");
        }
    }
}
