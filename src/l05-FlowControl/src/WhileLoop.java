import java.util.Scanner;

public class WhileLoop {
    public static void execute() {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }

        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        do {
            System.out.println("Introduce even number");
            int number = scanner.nextInt();
            if (number % 2 == 0) {
                flag = false;
                System.out.println("Even number introduced succesfully");
            }
        } while (flag);
    }
}
