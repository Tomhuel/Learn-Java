import java.util.Random;

public class IfElse {
    public static void execute() {

        Random rand = new Random();
        int i = rand.nextInt(10);

        if (i > 5) {
            System.out.println("I higher than 5: " + i);
        } else if (i == 5) {
            System.out.println("I same as 5: " + i);
        } else {
            System.out.println("I lower than 5: " + i);
        }
    }
}
