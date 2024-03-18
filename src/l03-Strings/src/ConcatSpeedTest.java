public class ConcatSpeedTest {
    public static void execute() {
        String firstString = "a";
        String secondString = "b";
        String thirdString = firstString;
        StringBuilder fourthString = new StringBuilder(firstString);
        int loop = 10;

        long start = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            thirdString = thirdString + firstString + secondString + "\n";
        }
        long stop = System.currentTimeMillis();
        long result = stop - start;
        System.out.println("Using + the result is: " + result + "ms");
        thirdString = firstString;

        start = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            thirdString = thirdString.concat(firstString).concat(secondString).concat("\n");
        }
        stop = System.currentTimeMillis();
        result = stop - start;
        System.out.println("Using Concat the result is: " + result + "ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            fourthString = fourthString.append(firstString).append(secondString).append("\n");
        }
        stop = System.currentTimeMillis();
        result = stop - start;
        System.out.println("Using StringBuilder the result is: " + result + "ms");
    }
}
