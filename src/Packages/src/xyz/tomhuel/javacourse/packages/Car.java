package xyz.tomhuel.javacourse.packages;

public class Car {
    private String brand;
    private int id;
    private static int lastId = 1;

    public Car() {
        this.id = lastId++;
        this.brand = "";
    }

    public Car(String brand) {
        this.id = lastId++;
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return this.id + " : " + this.brand;
    }
}
