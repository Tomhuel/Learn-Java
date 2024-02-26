public class TagLoops {
    public static void execute() {
        loop1:
        for (int i = 0; i < 6; i++) {
            loop2:
            for (int j = 0; j < 6; j++) {
                if ((i + j) % 2 == 0) {
                    continue loop1; // Skips the actual loop of loop1 (loop of i)
                }
//                if ((i + j) % 5 == 0) {
//                    continue loop2; // Skips the actual loop of loop2 (loop of j)
//                }
                System.out.println(i + " + " + j + " = " + (i + j));
            }
        }
    }
}
