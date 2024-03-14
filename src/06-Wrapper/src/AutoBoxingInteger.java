public class AutoBoxingInteger {
    public static void execute() {
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        // 2, 4, 6, 8, 10, 12, 14 = 56
        int amount = 0;
        for (Integer num: numbers) {
            if (num % 2 == 0) { // Num var is changed by the value of the Integer by default. We don't need to use intValue();
                amount += num;
            }
        }
        System.out.println("amount = " + amount);
    }
}
