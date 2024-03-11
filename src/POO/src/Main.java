public class Main {
    public static void main(String[] args) {
        CarBuilder toyotaBuilder = new CarBuilder()
                .setColor("Orange")
                .setBrand("Toyota")
                .setModel("Corolla")
                .setPower(1.4);

        CarBuilder opelBuilder = new CarBuilder()
                .setColor("Blue")
                .setBrand("Opel")
                .setModel("Corsa")
                .setPower(1.2);

        Car toyota = toyotaBuilder.build();
        Car opel = opelBuilder.build();

        System.out.println(toyota);
        System.out.println("----------------------");
        System.out.println(opel);
    }
}