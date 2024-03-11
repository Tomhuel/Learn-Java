public class CarBuilder {

    private String brand;
    private String model;
    private String color;

    private double power;

    public CarBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public CarBuilder setPower(double power) {
        this.power = power;
        return this;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPower() {
        return power;
    }

    public String getColor() {
        return color;
    }

    public Car build() {
        return new Car(this);
    }
}
