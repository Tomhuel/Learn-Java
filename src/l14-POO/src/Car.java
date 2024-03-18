import java.util.Objects;

public class Car implements Comparable {

    private static int wheels = 4;
    private static int lastId = 1;

    protected static final int roadMaxSpeed = 120;

    private int id;
    private String brand;
    private String model;
    private CarColor color;
    private Engine power;

    private GasCapacity gasCapacity;
    private String status = "stopped";


    public Car(CarBuilder carBuilder) {
        this.id = lastId++;
        this.brand = carBuilder.getBrand();
        this.model = carBuilder.getModel();
        this.color = carBuilder.getColor();
        this.power = carBuilder.getPower();
        this.gasCapacity = carBuilder.getGasCapacity();
    }

    public Car() {
        this.id = lastId++;
        this.color = CarColor.WHITE;
        this.power = new Engine(0, null);
        this.gasCapacity = new GasCapacity();
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color.getColor();
    }

    public Engine getPower() {
        return power;
    }

    public GasCapacity getGasCapacity() {
        return gasCapacity;
    }

    public static int getWheels() {
        return wheels;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(CarColor color) {
        this.color = color;
    }

    public void setPower(Engine power) {
        this.power = power;
    }

    public void setGasCapacity(GasCapacity gasCapacity) {
        this.gasCapacity = gasCapacity;
    }

    public String accelerate(int rpm) {
        this.status = "running";
        return "The car " + this.brand + " " + this.model + " accelerating at " + rpm + " rpm";
    }

    public static String sound() {
        return "Bruum Bruuuum tututututututu bruuututututututututututututu nioooooooooooooooooooooom nioooooooooooooooooooooooooooooom";
    }

    public double calculateConsumption(int km, double gasPercentage) {
        return km / (gasCapacity.getCapacity() * gasPercentage);
    }

    public float calculateConsumption(int km, float gasPercentage) {
        return km / (gasCapacity.getCapacity() * gasPercentage);
    }

    public String stop() {
        this.status = "stopped";
        return "The car " + this.brand + " " + this.model + " stops ";
    }

    @Override
    public String toString() {
        String output = "";
        output += "ID: " + this.id + "\n";
        output += "Brand: " + this.brand + "\n";
        output += "Model: " + this.model + "\n";
        output += "Color: " + this.color.getColor() + "\n";
        output += "Power: " + this.power.getPower() + "\n";
        output += "Status: " + this.status + "\n";
        output += "Wheels: " + wheels;
        return output;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return power.equals(car.getPower()) && gasCapacity == car.getGasCapacity() && Objects.equals(brand, car.getBrand()) && Objects.equals(model, car.getModel()) && Objects.equals(color, car.getColor());
    }

    public int compareTo(Car car) {
        return Integer.compare(this.id, car.id);
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Car)) return 0;
        return compareTo((Car) o);
    }
}
