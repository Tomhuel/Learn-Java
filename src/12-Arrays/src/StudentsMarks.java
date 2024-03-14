import java.util.Random;

public class StudentsMarks {
    public static void execute() {
        double[] mathsMarks, historyMarks, englishMarks;
        int students = 10;
        mathsMarks = new double[students];
        historyMarks = new double[students];
        englishMarks = new double[students];
        double[][] subjects = {mathsMarks, historyMarks, englishMarks};
        Random randomizer = new Random();

        for (double[] subject: subjects) {
            for (int i = 0; i < subject.length; i++) {
                subject[i] = randomizer.nextDouble(0,10);
            }
        }

        for (int i = 0; i < students; i++) {
            System.out.println("The Student n." + (i + 1));
            System.out.println("Maths: " + mathsMarks[i]);
            System.out.println("History: " + historyMarks[i]);
            System.out.println("English: " + englishMarks[i]);
            double average = (mathsMarks[i] + historyMarks[i] + englishMarks[i]) / 3;
            System.out.println("Average: " + average);
            String status = setStatus(average);
            System.out.println("Status: " + status);
            System.out.print("\n");
        }
    }

    private static String setStatus(double average) {
        String status;
        if (average < 5) {
            status = "failed";
        } else if (average < 7) {
            status = "good";
        } else if (average < 9) {
            status = "excellent";
        } else {
            status = "outstanding";
        }
        return status;
    }
}
