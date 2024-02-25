public class Strings {
    public static void execute() {
        String curso = "Java's Program";
        String curso2 = new String("Java's Program");
        System.out.println(curso.equals(curso2));

        curso = curso2;

        System.out.println(curso == curso2);
    }
}
