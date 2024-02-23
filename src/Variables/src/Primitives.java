public class Primitives {
    public static void execute() {
        // Byte Type
        byte byteNumber = 127;
        System.out.println(byteNumber);
        System.out.println("Byte's type in bytes is: " + Byte.BYTES);
        System.out.println("Byte's type in bits is: " + Byte.SIZE);
        System.out.println("Byte's max value " + Byte.MAX_VALUE);
        System.out.println("Byte's min value " + Byte.MIN_VALUE);

        // Short Type
        short shortNumber = 32767;
        System.out.println(shortNumber);
        System.out.println("Short's type in bytes is: " + Short.BYTES);
        System.out.println("Short's type in bits is: " + Short.SIZE);
        System.out.println("Short's max value " + Short.MAX_VALUE);
        System.out.println("Short's min value " + Short.MIN_VALUE);

        // Int Type
        int intNumber = 2147483647;
        System.out.println(intNumber);
        System.out.println("Int's type in bytes is: " + Integer.BYTES);
        System.out.println("Int's type in bits is: " + Integer.SIZE);
        System.out.println("Int's max value " + Integer.MAX_VALUE);
        System.out.println("Int's min value " + Integer.MIN_VALUE);

        // Tipo Long
        long longNumber = 9223372036854775807L;
        System.out.println(longNumber);
        System.out.println("Long's type in bytes is: " + Long.BYTES);
        System.out.println("Long's type in bits is: " + Long.SIZE);
        System.out.println("Long's max value " + Long.MAX_VALUE);
        System.out.println("Long's max value " + Long.MIN_VALUE);

        // Tipo Float
        float floatNumber = 3.4028235E38F;
        System.out.println(floatNumber);
        System.out.println("Float's type in bytes is: " + Float.BYTES);
        System.out.println("Float's type in bits is: " + Float.SIZE);
        System.out.println("Float's max value " + Float.MAX_VALUE);
        System.out.println("Float's min value " + Float.MIN_VALUE);

        // Tipo Double
        double doubleNumber = 9223.0;
        System.out.println(doubleNumber);
        System.out.println("Double's type in bytes is: " + Double.BYTES);
        System.out.println("Double's type in bytes is: " + Double.SIZE);
        System.out.println("Double's max value " + Double.MAX_VALUE);
        System.out.println("Double's min value " + Double.MIN_VALUE);

        // Tipo Character
        char character = 64;
        System.out.println(character);
        System.out.println("Character's type in bytes is: " + Character.BYTES);
        System.out.println("Character's type in bytes is: " + Character.SIZE);

        boolean bool = false;
        System.out.println(bool);
    }
}
