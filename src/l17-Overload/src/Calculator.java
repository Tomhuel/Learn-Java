public class Calculator {

    private Calculator() {}

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int... args) {
        int max = 0;
        for (int n : args) {
            max += n;
        }
        return max;
    }

    public static float add(float a, float b) {
        return a + b;
    }

    public static int[] add(int[]... args) {
        int max[] = args[0];
        for (int i = 0; i < args.length; i++) {
            if (max.length < args[i].length) {
                max = args[i];
            }
        }
        int[] result = new int[max.length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < args.length; j++) {
                if (i < args[j].length) {
                    result[i] += args[j][i];
                }
            }
        }
        return result;
    }
}
