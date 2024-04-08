package io.github.tomhuel.generics.classes;

public class Main {
    public static void main(String[] args) {
        Truck<Animal> horsesTruck = new Truck(30);
        horsesTruck.add(new Animal("Jimmy", "Horse"));
        horsesTruck.add(new Animal("Henry", "Horse"));
        horsesTruck.add(new Animal("Miguel", "Horse"));
        horsesTruck.add(new Animal("Troya", "Horse"));
        horsesTruck.add(new Animal("Chapo", "Horse"));

        printTruck(horsesTruck);
        System.out.println("\n");

        Truck<MachineTool> machineTruck = new Truck(3);
        machineTruck.add(new MachineTool("Bulldozer"));
        machineTruck.add(new MachineTool("Excavator"));
        machineTruck.add(new MachineTool("SnowRemover"));

        printTruck(machineTruck);
        System.out.println("\n");

        Truck<Car> carTruck = new Truck(6);

        carTruck.add(new Car("Mercedes"));
        carTruck.add(new Car("BMW"));
        carTruck.add(new Car("Suzuki"));

        printTruck(carTruck);
    }

    public static <T> void printTruck(Truck<T> truck) {
        for (T a: truck) {
            System.out.println(a);
        }
    }
}
