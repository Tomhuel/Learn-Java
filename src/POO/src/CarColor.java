public enum CarColor {
    RED("Red"),
    BLACK("Black"),
    WHITE("White"),
    ORANGE("Orange"),
    YELLOW("Yellow"),
    BLUE("Blue"),
    GREEN("Green");

    private final String color;

    CarColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
