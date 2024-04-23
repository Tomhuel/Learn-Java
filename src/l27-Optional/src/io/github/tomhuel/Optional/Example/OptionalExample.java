package io.github.tomhuel.Optional.Example;

import java.util.Optional;

public class OptionalExample {
    public static void execute() {
        String name = " ";
        Optional<String> opt = Optional.of(name); // Not nullable
        name = null;
        opt = Optional.ofNullable(name); // Nullable
        System.out.println("opt = " + opt);
        System.out.println("opt is present: " + opt.isPresent());
        opt.ifPresent(value -> {
            System.out.println("Opt value -> " + value);
        });
        if (opt.isEmpty()) {
            System.out.println("Opt it's empty");
        } else {
            System.out.println("Opt it's not empty");
        }

        Optional<String> optEmpty = Optional.empty();
        System.out.println(optEmpty.isEmpty()); // true
        System.out.println(optEmpty.isPresent()); // false
    }
}
