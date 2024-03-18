public class ForLoop {
    public static void execute() {
        for (
            int i = 0; // declare initial var
            i < 10; // condition
            i++ // increment o decrement
        ) {
            // content
            if (i == 3) {
                continue; // skips the actual loop to the next
            }
            System.out.println(i);
            if (i == 6) {
                break; // breaks the loop and continues
            }
        }
    }
}
