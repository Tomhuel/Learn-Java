import java.util.Random;

public class RandomNumbers {
    public static void execute() {
        String[] colours = {"Blue", "Red", "Green", "Yellow"};
        int random = (int) Math.floor(Math.random() * colours.length);
        System.out.println(colours[random]);

        Random randomizer = new Random();
        int randomInt = randomizer.nextInt(10);
        System.out.println("randomInt = " + randomInt);
    }
}
