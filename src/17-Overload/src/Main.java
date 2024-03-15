public class Main {
    public static void main(String[] args) {
        int[] a = {1, 1, 1, 1};
        int[] b = {1, 1, 1};
        int[] c = {1, 1, 1, 1, 1};
        int[] d = {1, 1, 1, 1, 1};
        int[] e = {1, 1, 1, 1, 1};
        int[] f = {1, 1, 1, 1, 1};
        int[] result = Calculator.add(a, b, c, d, e, f);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}