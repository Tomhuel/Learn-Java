package io.github.tomhuel.APIStream.StreamFilter;

import io.github.tomhuel.APIStream.User;

import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamSingleFilter {
    public static void execute() {
        System.out.println("· Stream Single Filter");

        Optional<User> oUser1 = findUserByName("Willy");
        Optional<User> oUser2 = findUserByName("William");
        User user = oUser1.orElse(new User("William", "Wonkaa"));
        User user2 = oUser2.orElseThrow();
        System.out.println("user = " + user);
        System.out.println("user2 = " + user2);
        if (oUser1.isPresent()) {
            System.out.println("user3 = " + oUser2.get());
        } else {
            System.out.println("User 3 not found");
        }
    }

    private static Optional<User> findUserByName(String username) {
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
        });

        return users.filter(u -> u.getName().equals(username)).findFirst();
    }
}
