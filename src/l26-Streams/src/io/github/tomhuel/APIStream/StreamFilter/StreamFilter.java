package io.github.tomhuel.APIStream.StreamFilter;

import io.github.tomhuel.APIStream.User;

import java.util.function.Function;
import java.util.stream.Stream;

public class StreamFilter {
    public static void execute() {
        System.out.println("· Stream Filter");
        Stream<String> names = Stream.of("William pinkerton", "Kayle", "karen", "chad");

        Function<String, String> parser = (string) -> {
            return string.substring(0, 1).toUpperCase() + string.substring(1).toLowerCase();
        };

        Stream<User> users = names.map((name) -> {
            String[] split = name.split(" ");
            if (split.length == 1) {
                return new User(parser.apply(name));
            }
            return new User(parser.apply(split[0]), parser.apply(split[1]));
        }).filter(u -> {
            return u.getName().substring(0, 1).equals(u.getName().substring(0, 1).toUpperCase());
        });

        System.out.println(users.toList());
    }
}
