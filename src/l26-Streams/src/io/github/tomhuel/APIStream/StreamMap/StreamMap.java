package io.github.tomhuel.APIStream.StreamMap;

import io.github.tomhuel.APIStream.User;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamMap {
    public static void execute() {
        System.out.println("· Stream Maps");
        Stream<String> names = Stream.of("wILLIAm pinKertON", "KAyle", "karen", "cHad");

        Function<String, String> parser = (string) -> {
            return string.substring(0, 1).toUpperCase() + string.substring(1).toLowerCase();
        };

        Stream<User> users = names.map((name) -> {
            String[] split = name.split(" ");
            if (split.length == 1) {
                return new User(parser.apply(name));
            }
            return new User(parser.apply(split[0]), parser.apply(split[1]));
        });

        System.out.println(users.toList());
    }
}
