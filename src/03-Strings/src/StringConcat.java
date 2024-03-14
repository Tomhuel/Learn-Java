public class StringConcat {
    public static void execute() {
        String curso = "Java's Programm";
        String teacher = "Andrés Guzmán";
        String message = curso + " with the teacher: " + teacher;

        int number1 = 10;
        int number2 = 5;

        System.out.println(message + " " + (number2 + number1));
        System.out.println(number1 + number2 + " " + message);
        System.out.println(curso.concat(" with the teacher: ").concat(teacher));

        curso.transform(c -> { // Curso's value won't change. To change we have to curso = curso.transform(...);
            return "Nuevo curso";
        });

        curso.replace('a', 'A'); // Curso's value won't change. To change we have to curso = curso.replace(...);

        System.out.println("curso = " + curso);
    }
}
