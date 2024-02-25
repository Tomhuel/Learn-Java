import java.util.Scanner;

public class HigherNumberTernary {
    public static void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce first number");
        Integer number = scanner.nextInt();

        System.out.println("Introduce second number");
        Integer number2 = scanner.nextInt();

        System.out.println("Introduce third number");
        Integer number3 = scanner.nextInt();

        Integer max = number > number2 ? number : number2;
        max = number3 > max ? number3 : max;

        System.out.println("max = " + max);
    }
}
