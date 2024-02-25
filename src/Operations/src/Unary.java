public class Unary {
    public static void execute() {
        int i = 5;

        int j = +i;
        System.out.println("j = " + j);
        
        j = -i; // j = (-1) * i;
        System.out.println("j = " + j);
    }
}
