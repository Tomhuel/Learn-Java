public class Car {

    private String brand;
    private String model;
    private String color;
    private double power;


    Car(CarBuilder carBuilder) {
        this.brand = carBuilder.getBrand();
        this.model = carBuilder.getModel();
        this.color = carBuilder.getColor();
        this.power = carBuilder.getPower();
    }

    Car() {

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public double getPower() {
        return power;
    }

    public Car setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public Car setColor(String color) {
        this.color = color;
        return this;
    }

    public Car setModel(String model) {
        this.model = model;
        return this;
    }

    public Car setPower(double power) {
        this.power = power;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append("Brand: ").append(this.brand).append("\n");
        output.append("Model: ").append(this.model).append("\n");
        output.append("Color: ").append(this.color).append("\n");
        output.append("Power: ").append(this.power);
        return output.toString();
    }
}
