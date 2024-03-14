public class ValidateString {
    public static void execute(String curso) {
        if (curso == null) {
            curso = "";
        }
        if (curso.isBlank()) {
            if (curso.isEmpty()) {
                System.out.println("No content in the course");
            } else {
                System.out.println("There are only spaces in the content");
            }
        } else {
            System.out.println("The course is: " + curso);
        }
    }
}
