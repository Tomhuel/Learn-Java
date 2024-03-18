public class CarBuilder {

    private String brand;
    private String model;
    private CarColor color;

    private GasCapacity gasCapacity;

    private Engine power;

    CarBuilder() {
        this.brand = "";
        this.gasCapacity = new GasCapacity();
        this.color = CarColor.WHITE;
        this.model = "";
        this.power = new Engine(0.0, EngineType.GAS);
    }

    public CarBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public CarBuilder setColor(CarColor color) {
        this.color = color;
        return this;
    }

    public CarBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public CarBuilder setPower(Engine power) {
        this.power = power;
        return this;
    }

    public CarBuilder setGasCapacity(GasCapacity gasCapacity) {
        this.gasCapacity = gasCapacity;
        return this;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Engine getPower() {
        return power;
    }

    public CarColor getColor() {
        return color;
    }

    public GasCapacity getGasCapacity() {
        return this.gasCapacity;
    }

    public Car build() {
        return new Car(this);
    }
}
