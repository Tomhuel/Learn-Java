import java.util.Objects;

public class Engine {
    private double power;
    private EngineType type;

    public Engine(double power, EngineType type) {
        this.power = power;
        this.type = type;
    }

    public double getPower() {
        return power;
    }

    public EngineType getType() {
        return type;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public void setType(EngineType type) {
        this.type = type;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Engine)) return false;
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return (Double.compare(this.power, engine.getPower()) == 0 && this.type.equals(engine.type));
    }
}
