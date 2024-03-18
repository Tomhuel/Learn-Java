package xyz.tomhuel.javacourse.packages;

import xyz.tomhuel.javacourse.packages.garden.*;
import static xyz.tomhuel.javacourse.packages.garden.Bush.cutBush;
import xyz.tomhuel.javacourse.packages.user.User;
import static xyz.tomhuel.javacourse.packages.user.Status.READY;

public class Main {
    public static void main(String[] args) {
        User pepe = new User("Pupa");
        System.out.println(pepe);

        Car toyota = new Car("Corolla");
        System.out.println(toyota);

        Kid miguel = new Kid("Miguel", 12);
        Dog bulldog = new Dog("Bulldog");
        System.out.println(miguel.playsWithDog(bulldog));

        System.out.println(cutBush());

        System.out.println(READY.getStatus());
    }
}