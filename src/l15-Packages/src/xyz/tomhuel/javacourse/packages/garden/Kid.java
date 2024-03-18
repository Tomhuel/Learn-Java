package xyz.tomhuel.javacourse.packages.garden;

public class Kid {
    private String name;
    private int age;

    public Kid(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String playsWithDog(Dog dog) {
        return this.name + " (" + this.age + "years old) is playing with his dog, that is a " + dog.getRace() + ": " + Dog.woof();
    }
}
