import java.util.Scanner;

public class Login {
    public static void execute() {
        String[] users = new String[2];
        String[] passwords = new String[2];
        users[0] = "Tomhuel";
        passwords[0] = "incorrecta";

        users[1] = "Conrao";
        passwords[1] = "maricon";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce the account's username: ");
        String user = scanner.nextLine();

        System.out.print("Introduce the account's password: ");
        String pass = scanner.nextLine();

        boolean userAuthenticathed = false;
        String username = "";

        for (int i = 0; i < users.length; i++) {
            if (users[i].equals(user) && passwords[i].equals(pass)) {
                userAuthenticathed = true;
                username = users[i];
                break;
            }
        }

        if (userAuthenticathed) {
            System.out.println("Bienvenido " + username);
        } else {
            System.out.println("Credenciales inválidas");
        }
    }
}
