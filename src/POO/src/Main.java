public class Main {
    public static void main(String[] args) {
        // Toyota Builder
        CarBuilder toyotaBuilder = new CarBuilder()
                .setColor(CarColor.ORANGE)
                .setBrand("Toyota")
                .setModel("Corolla")
                .setPower(new Engine(1.4, EngineType.DIESEL))
                .setGasCapacity(new GasCapacity(44));

        // OpelBuilder
        CarBuilder opelBuilder = new CarBuilder()
                .setColor(CarColor.BLUE)
                .setBrand("Opel")
                .setModel("Corsa")
                .setPower(new Engine(1.2, EngineType.GAS))
                .setGasCapacity(new GasCapacity(40));

        // Building with Builders
        Car toyota = toyotaBuilder.build();
        Car toyota2 = toyotaBuilder.build();
        Car opel = opelBuilder.build();

        // Acelerate
        System.out.println(toyota.accelerate(3200));

        // toString
        System.out.println(toyota);
        System.out.println("----------------------");
        System.out.println(opel);

        // Function
        System.out.println(toyota.calculateConsumption(300, 0.75));

        // Print both Toyota
        System.out.println("toyota = " + toyota);
        System.out.println("toyota2 = " + toyota2);

        // Equals
        Object test = new Object();
        System.out.println("Toyota1 == Toyota2: " + toyota.equals(toyota2)); // true
        System.out.println("Toyota1 == Toyota2: " + toyota.equals(test)); // false

        // Static Attribute
        System.out.println("All Cars have this amount of wheels: " + Car.getWheels());

        // Static function Broom
        System.out.println(Car.sound());

        // Car with constructor without args
        Car ford = new CarBuilder().build();
        System.out.println(ford.calculateConsumption(30, 2.3));
        System.out.println(ford);

        // Print Const
        System.out.println("Max speed: " + Car.roadMaxSpeed);

        // Loop Enum
        for (CarColor color : CarColor.values()) {
            System.out.println(color.getColor());
        }

        // CompareTo
        System.out.println(toyota);
        System.out.println(ford);
        System.out.println(toyota.compareTo(toyota2));
    }
}