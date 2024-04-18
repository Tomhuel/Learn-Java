package io.github.tomhuel.Lambdas.Consumer;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerExercise {
    public static void execute() {
        Consumer<String> consumer = System.out::println;

        Consumer<Date> dater = date -> {
            SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy - hh:mm:ss");
            System.out.println(sdf.format(date));
        };

        consumer.accept("Hello lambdas!");
        dater.accept(new Date());

        BiConsumer<String, Integer> sayAge = (name, number) -> System.out.println(name + " has " + number + " years old");

        sayAge.accept("William", 21);

        List<String> names = Arrays.asList("WiLlIAm", "john", "kEnNY", "KARTMAN");
        List<User> users = new ArrayList<>();
        names.forEach((name) -> {
            String formattedName = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
            users.add(new User(formattedName));
            System.out.println(formattedName + " loaded.");
        });

        users.forEach(System.out::println);

        Supplier<String> getThreadName = () -> Thread.currentThread().getName();

        Supplier<User> createUser = User::new;

        System.out.println(createUser.get().setName("Kakyoin"));

        String thread = getThreadName.get();
        System.out.println(thread);
    }
}
