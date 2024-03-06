public class LoopInMatrix {
    public static void execute() {
        System.out.println("· Loop in Matrix:");
        String[][] names = new String[3][2];
        names[0][0] = "John";
        names[0][1] = "Mark";
        names[1][0] = "Elon";
        names[1][1] = "Bill";
        names[2][0] = "Guillermo";
        names[2][1] = "Miguel";

        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                System.out.println(names[i][j]);
            }
        }

        for (String[] row: names) {
            for (String name: row) {
                System.out.println(name);
            }
        }
    }
}
