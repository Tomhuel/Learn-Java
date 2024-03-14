public class TypeConversion {
    public static void execute() {

        // String to Primitive
        String numberStrtoInt = "50";

        int intNumber = Integer.parseInt(numberStrtoInt);
        System.out.println("intNumber = " + intNumber);

        String numberStrToDouble = "98765.4e-3";
        double doubleNumber = Double.parseDouble(numberStrToDouble);
        System.out.println("doubleNumber = " + doubleNumber);

        String booleanStr = "true";
        boolean bool = Boolean.parseBoolean(booleanStr);
        System.out.println("booleanStr = " + bool);

        // Primitive to String
        int numberIntToStr = 10;
        String StringInt = Integer.toString(numberIntToStr);
        System.out.println("StringInt = " + StringInt);

        double numberDoubleToString = 9876.5e-3;
        String StringDouble = Double.toString(numberDoubleToString);
        System.out.println("StringDouble = " + StringDouble);

        boolean boolToString = true;
        String StringBool = Boolean.toString(boolToString);
        System.out.println("StringBool = " + StringBool);

        // Primitives to Primitives
        int IntToShort = 10000;
        short myShort = (short) IntToShort;
        long myLong = IntToShort;
        System.out.println("myShort = " + myShort);
    }
}
