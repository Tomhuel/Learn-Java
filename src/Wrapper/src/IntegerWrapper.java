public class IntegerWrapper {
    public static void execute() {
        int primitive = 2147483647;
        Integer intObject = primitive; // Create a Wrapper Int with a primitive Int

        int newPrimitive = intObject; // Create a primitive Int with a Wrapper Int
        int newPrimitive2 = intObject.intValue(); // Create a primitive Int with a Wrapper Int
        System.out.println(intObject + newPrimitive2);

        Integer intObject2 = Integer.valueOf("34000");
        System.out.println("intObject2 = " + intObject2);

        Short shortito = 32767;
        Integer intObject3 = shortito.intValue();
        Short shortito2 = intObject2.shortValue();
        System.out.println("shortito2 = " + shortito2); // Negative value because exceed the limit
    }
}
