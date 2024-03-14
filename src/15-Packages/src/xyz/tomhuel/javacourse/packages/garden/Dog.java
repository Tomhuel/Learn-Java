package xyz.tomhuel.javacourse.packages.garden;

public class Dog {
    private String race;

    public Dog(String race) {
        this.race = race;
    }

    public String getRace() {
        return race;
    }

    public static String woof() {
        return "Woof!";
    }
}
